
package SemestralProject;

import java.util.Scanner;

public class VanocniUloha {

    static Scanner sc = new Scanner(System.in);
    static int headChoise;
    static int size;
    static char space = ' ';
    static int spaceNum = 0;
    static int face;
    static boolean end;

    public static void main(String[] args) {
        String name;

        System.out.println("►►►►   Vítej ve stavebnictví sněhuláků!    ◄◄◄◄");
        System.out.println("");
        System.out.println("❆❆❆❆    Napiš jméno nového sněhuláka!      ❆❆❆❆");
        name = sc.next();
        System.out.println("");
        System.out.println("    ❅❅❅❅❅       Zadej počet koulí      ❅❅❅❅❅");
        size = sc.nextInt();

        headCover();
        head();
        sizeOfSnowman();
        System.out.println("");
        System.out.println("");
        System.out.println(" ☃ ☃ ☃    Tohle je " + name + ".   ☃ ☃ ☃");
        System.out.println("");
        System.out.println("");
    }

    private static void headCover() {

        System.out.println("");
        System.out.println("    ❄❄❄❄❄    Vybrat sněhulákovi pokrývku hlavy  ❄❄❄❄❄");
        do {
            System.out.println("");
            System.out.println("0 Žádná pokrývka");
            System.out.println("1 Zimní čepice");
            System.out.println("2 Kšiltovka");
            System.out.println("3 Kloubouk");
            System.out.println("");
            headChoise = sc.nextInt();
            if (headChoise > 3 | headChoise < 0) {
                System.out.println("Neplatna volba");
                end = false;
            } else {
                end = true;
            }
        } while (!end);
        do {
            System.out.println("");
            System.out.println("Vyber sněhulákovi výraz:");
            System.out.println("0 Neutrální");
            System.out.println("1 Usměvavý");
            System.out.println("2 Zamračený");
            face = sc.nextInt();
            if (face > 2 | face < 0) {
                System.out.println("Neplatna volba");
            } else {
                break;
            }
        } while (true);
        switch (headChoise) {
            case 0:
                noCover();
                break;
            case 1:
                winterHat();
                break;
            case 2:
                cap();
                break;
            case 3:
                hat();
                break;
        }

    }

    private static void winterHat() {
        for (int j = 0; j < 35; j++) {
            System.out.print(space);
        }
        System.out.print("■");
        System.out.println("");

        for (int j = 0; j < 33; j++) {
            System.out.print(space);
        }
        for (int j = 0; j < 3; j++) {
            System.out.print("■");
        }
        System.out.println("");

        for (int j = 0; j < 31; j++) {
            System.out.print(space);
        }
        for (int j = 0; j < 5; j++) {
            System.out.print("■");
        }
        System.out.println("");

        for (int j = 0; j < 29; j++) {
            System.out.print(space);
        }
        for (int j = 0; j < 7; j++) {
            System.out.print("■");
        }
        System.out.println("");

        for (int j = 0; j < 27; j++) {
            System.out.print(space);
        }
        for (int j = 0; j < 9; j++) {
            System.out.print("■");
        }
        System.out.println("");

        for (int j = 0; j < 25; j++) {
            System.out.print(space);
        }
        for (int j = 0; j < 12; j++) {
            System.out.print("■");
        }
        System.out.println("");
    }

    private static void cap() {

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 25; i++) {
                System.out.print(space);
            }
            for (int k = 0; k < 10; k++) {
                System.out.print("■");
            }
            System.out.println("");
        }

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 25; i++) {
                System.out.print(space);
            }
            for (int k = 0; k < 14; k++) {
                System.out.print("■");
            }
            System.out.println("");
        }
    }

    private static void hat() {

        for (int j = 0; j < 32; j++) {
            System.out.print(space);
        }
        for (int j = 0; j <= 2; j++) {
            System.out.print("■");
        }
        System.out.println("");

        for (int j = 0; j < 27; j++) {
            System.out.print(space);
        }
        for (int j = 0; j <= 8; j++) {
            System.out.print("■");
        }
        System.out.println("");

        for (int j = 0; j < 21; j++) {
            System.out.print(space);
        }
        for (int j = 0; j < 18; j++) {
            System.out.print("■");
        }
        System.out.println("");
    }

    private static void noCover() {
        for (int j = 0; j < 27; j++) {
            System.out.print(space);
        }
        for (int j = 0; j < 5; j++) {
            System.out.print(" ☐");
        }
        System.out.println("");
    }

    private static void sizeOfSnowman() {
        for (int p = 0; p < (size); p++) {
            for (int j = 0; j < 18; j++) {
                System.out.print(space);
            }
            for (int i = 0; i < 22; i++) {
                System.out.print("☐");
            }
            System.out.println("");

            for (int j = 0; j < 16; j++) {
                System.out.print(space);
            }
            for (int i = 0; i < 25; i++) {
                System.out.print("☐");
            }
            System.out.println("");
            for (int j = 0; j < 14; j++) {
                System.out.print(space);
            }
            for (int i = 0; i < 28; i++) {
                System.out.print("☐");
            }
            System.out.println("");

            if (p == ((size + 1) / 2) - 1) {
                System.out.print("     ■■     ");
                for (int i = 0; i < 30; i++) {
                    System.out.print("☐");
                }
                System.out.println("      ■■");

                System.out.print("      ■■   ");
                for (int i = 0; i < 32; i++) {
                    System.out.print("☐");
                }
                System.out.println("   ■■");

                System.out.print("       ■■");
                for (int i = 0; i < 35; i++) {
                    System.out.print("☐");
                }
                System.out.println("■■");

            } else {
                for (int j = 0; j < 13; j++) {
                    System.out.print(space);
                }
                for (int i = 0; i < 30; i++) {
                    System.out.print("☐");

                }
                System.out.println("");
                for (int j = 0; j < 12; j++) {
                    System.out.print(space);
                }
                for (int i = 0; i < 32; i++) {
                    System.out.print("☐");
                }
                System.out.println("");
                for (int j = 0; j < 10; j++) {
                    System.out.print(space);
                }
                for (int i = 0; i < 35; i++) {
                    System.out.print("☐");
                }
                System.out.println("");
            }
            for (int j = 0; j < 12; j++) {
                System.out.print(space);
            }
            for (int i = 0; i < 32; i++) {
                System.out.print("☐");
            }
            System.out.println("");
            for (int j = 0; j < 13; j++) {
                System.out.print(space);
            }
            for (int i = 0; i < 30; i++) {
                System.out.print("☐");
            }
            System.out.println("");
            for (int j = 0; j < 14; j++) {
                System.out.print(space);
            }
            for (int i = 0; i < 28; i++) {
                System.out.print("☐");
            }
            System.out.println("");
            for (int j = 0; j < 16; j++) {
                System.out.print(space);
            }
            for (int i = 0; i < 25; i++) {
                System.out.print("☐");
            }
            System.out.println("");
        }

    }

    private static void head() {
        int spaceN26 = 26;
        for (int j = 0; j < spaceN26; j++) {
            System.out.print(space);
        }
        System.out.print("☐            ☐");
        System.out.println("");

        int spaceN24 = 24;
        for (int j = 0; j < spaceN24; j++) {
            System.out.print(space);
        }
        System.out.print("☐                ☐");
        System.out.println("");

        int spaceN23 = 23;
        for (int j = 0; j < spaceN23; j++) {
            System.out.print(space);
        }
        System.out.print("☐    ▬        ▬    ☐");
        System.out.println("");

        int spaceN22 = 22;
        for (int j = 0; j < spaceN22; j++) {
            System.out.print(space);
        }
        System.out.print("☐                     ☐");
        System.out.println("");

        int spaceN21 = 21;
        for (int j = 0; j < spaceN21; j++) {
            System.out.print(space);
        }
        System.out.print("☐           ▙          ☐");
        System.out.println("");

        for (int j = 0; j < spaceN21; j++) {
            System.out.print(space);
        }
        System.out.print("☐                       ☐");
        System.out.println("");

        for (int j = 0; j < spaceN22; j++) {
            System.out.print(space);
        }
        if (face == 2) {
            System.out.println("☐      ▞ ▘▘▘▘▚     ☐");
        } else if (face == 0) {
            System.out.println("☐     ▗▗▗▗▗▗▗     ☐");
        } else {
            System.out.println("☐      ▚▗▗▗▗ ▞     ☐");
        }

        for (int j = 0; j < spaceN23; j++) {
            System.out.print(space);
        }
        System.out.print("☐                   ☐");
        System.out.println("");

        for (int j = 0; j < spaceN24; j++) {
            System.out.print(space);
        }
        System.out.print("☐                 ☐");
        System.out.println("");

        for (int j = 0; j < spaceN23; j++) {
            System.out.print(space);
        }
        for (int j = 0; j < 15; j++) {
            if (j % 2 == 0) {
                System.out.print("☐");
            } else {
                System.out.print("■");
            }
        }
        System.out.println("");
        for (int j = 0; j < 20; j++) {
            System.out.print(space);
        }
        for (int j = 3; j <= 21; j++) {
            if (j % 3 == 0) {
                System.out.print("■");
            } else {
                System.out.print("☐");
            }
        }
        System.out.println("");
    }
}
