package SemestralProject;

import java.util.Scanner;

/**
 * 5.Program pro přidání prvků do vzestupně setříděné řady
 * @autor Lukáš Dědek
 * 20/12/22
 */

public class SemestralniUloha {

    public static void Semestral() {
        Scanner sc = new Scanner(System.in);
        int pocet;
        int[] posloupnost;
        int cislo;
        boolean kladna = true;
        boolean posloupne = false;
        boolean end;
        int pozice;
        boolean pridat;
        char odpoved;
        boolean rightAnswer;
        boolean opakovat = false;

        do {
            do {
                do {
                    System.out.println("Zadej pocet prvku pocatecni posloupnosti: ");
                    pocet = sc.nextInt();
                    if (pocet < 0) {
                        System.out.println("Nesmyslná volba! \n");
                    } else {
                        break;
                    }
                } while (true);

                posloupnost = new int[pocet];
                do {
                    if (pocet == 0) { //limitní stav
                        posloupnost = new int[1];
                        break;
                    }
                    System.out.println("Zadej pocatecni vzestupne setridenou posloupnost: ");
                    for (int i = 0; i < posloupnost.length; i++) {
                        posloupnost[i] = sc.nextInt();
                        if (posloupnost[i] < 0) {
                            System.out.println("Čísla musí být kladná!");
                            kladna = false;
                            break;
                        } else {
                            kladna = true;
                        }
                    }
                } while (kladna != true);
                if (posloupnost.length == 1) { //prvky nejde porovnávat
                    posloupne = true;
                } else {
                    posloupne = true;
                    for (int i = 0; i < posloupnost.length - 1; i++) { //Je zadaná posloupnost vzestupná?
                        if (posloupnost[i] > posloupnost[i + 1]) {
                            posloupne = false;
                            break;
                        } 
                    }
                }
                System.out.print((posloupne ? "" : "Toto neni vzestupne setridena posloupnost!" + "\n" + "\n"));
            } while (posloupne != true);
            
                System.out.println("Zadevej dalsi hodnoty (ukonči zadáním záporného čísla): ");
                do {
                    end = false;
                    cislo = sc.nextInt();
                    pridat = true;
                    if (cislo < 0) {
                        end = true;
                    } else {
                        for (int i = 0; i < posloupnost.length; i++) { // Čísla v posloupnosti se nebudou opakovat
                            if (cislo == posloupnost[i]) {
                                pridat = false;
                                break;
                            }
                        }
                        if (pridat == true) {  //metody pro přidání prvku do pole na pozici, na které řada zůstane vzestupná
                            pozice = binarSearchPosition(posloupnost, cislo);
                            posloupnost = pridaniPrvkuDoPole(posloupnost, cislo, pozice);
                        }
                    }
                } while (end != true);
                System.out.println("Vysledna posloupnost: ");
                if (pocet == 0) {
                    for (int i = 1; i < posloupnost.length; i++) {
                    System.out.print(posloupnost[i] + " ");
                }
                }
                else { for (int i = 0; i < posloupnost.length; i++) {
                    System.out.print(posloupnost[i] + " ");
                }
                }
                
                System.out.println("");
                    do {
                        System.out.println("Pokracovat ve zpracovani? (a/n): ");
                        odpoved = sc.next().charAt(0);
                        if ((odpoved == 'A') | (odpoved == 'a')) {
                            rightAnswer = true;
                        } else if ((odpoved == 'N') | (odpoved == 'n')) {
                            opakovat = true;
                            rightAnswer = true;
                        } else {
                            rightAnswer = false;
                        }
                    } while (!rightAnswer);
        } while (!opakovat);
    }

    /**
     * metoda pro zjištění indexu prvku, na který, když přidáme zadané číslo, tak řada zůstane vzestupná     
     * @param seřazenePole - pole, do kterého chceme přidat číslo
     * @param number - číslo, které chceme přidat
     * @return - vrací index původního pole, na který když zadané číslo přidáme, tak je řada stále vzestupná
     */
    private static int binarSearchPosition(int[] seřazenePole, int number) {
        int max = seřazenePole.length - 1;
        int min = 0;
        int position;
        if (number > seřazenePole[seřazenePole.length - 1]) {
            return seřazenePole.length;
        } else if (number < seřazenePole[0]) {
            return 0;
        }
        do {
            position = (min + max) / 2;
            if (number > seřazenePole[position] && number < seřazenePole[position + 1]) {
                return position + 1;
            } else {
                if (seřazenePole[position] < number) {
                    min = position + 1;
                } else if (seřazenePole[position] > number) {
                    max = position - 1;
                }
            }
        } while (true);
    }
    
    /* Test metody
    pole {2,4,6}, číslo 1, očekávaný index 0 - vysledek 0
    pole {1,3,4}, číslo 2, očekávaná index 1 - vysledek 1
    pole {1,4,5,6}, číslo 7, očekávaný index 3 - vysledek 3
     */
    
    /**
     * metoda pro přidání prvku do pole
     * parametry: pole, číslo a pozice (index), na kterou chceme dané číslo přidat
     * @param pole - pole, do kterého chceme přidat číslo
     * @param number - číslo, které se má přidat do pole
     * @param pozition - pozice, na kterou chceme číslo přidat
     * @return - vrací pole (rozměr pole = původní rozměr + 1)  
     */
    private static int[] pridaniPrvkuDoPole(int[] pole, int number, int pozition) {
        int[] temp = pole;
        pole = new int[pole.length + 1];  //přidání prvku do pole zvětšené o 1 na zjištěnou pozici
        for (int i = 0; i < pozition; i++) {
                pole[i] = temp[i];
        }
        pole[pozition] = number;
        for (int i = pozition+1; i < pole.length; i++) {
                pole[i] = temp[i-1];
        }
        return pole;
    }
    
    /* Test metody (pozice = index)
    pole {4,8,7,1}, číslo 5, pozice 3 - výstup {4, 8, 7, 5, 1}
    pole {0,0,0,0}, číslo 7, pozice 4 - výstup {0, 0, 0, 0, 7}
    pole {654,5,109,-74}, číslo -41, pozice 0 - výstup {-41, 564, 5, 109, -74}
     */
}
