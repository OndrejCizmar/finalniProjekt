
package cz.itnetwork.project;

import java.util.Scanner;
public class Project {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Zaevidovani evidence = new Zaevidovani();
        String volba = ""; //Pro volbu - 2cyklus(?)
        while (!volba.equals("4")){
            evidence.vypisUvod();
            System.out.println();
            System.out.println("Vyber!:");
            System.out.println("1 - Přidat pojištěného.");
            System.out.println("2 - Výpis pojištěných");
            System.out.println("3 - Vyhledání pojištěného");
            System.out.println("4 - Konec");
            volba = sc.nextLine();
            System.out.println();
            switch (volba){
                case "1":
                    evidence.pridejOsobu();
                    System.out.println("Uživatel úspěšně pojištěný!");
                    break;
                case "2":
                    evidence.vypisSeznam();
                    break;
                case "3":
                evidence.vyhledejOsobu();
                    break;
                case "4":
                    System.out.println("Ukončeno, přeji hezký den!");
                break;
                default:
                    System.out.println("Pokračujte stiknutím libovolné klávesy");
                
            }
        }
    }

}