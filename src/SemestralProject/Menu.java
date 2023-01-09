
package SemestralProject;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("Semestrální práce byla spuštěna" + "\n" + "Vyber si jakou úlohu chceš spustit: ");
        Scanner sc = new Scanner(System.in);
        int choise;
        boolean end;
        boolean znova = true;
        do {
            System.out.println("1: Semestralni uloha" + "\n" + "2: Vanocni uloha" + "\n" + "0: konec");
            choise = sc.nextInt();
            do {
                end = true;
                switch (choise) {
                    case 1:
                        SemestralniUloha.main(args); break;
                    case 2:
                        VanocniUloha.main(args); break;
                    case 0 :
                        end = true; znova = false; break;
                    default:
                        System.out.println("Neplatna volba");
                        end = false; break;
                }
            } while (!end);
        } while (znova);
    }
}
