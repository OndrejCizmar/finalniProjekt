
package cz.itnetwork.project;
import java.util.ArrayList;
import java.util.Scanner;

public class Zaevidovani {
    private Databaze databaze;
    private Scanner sc = new Scanner(System.in,"Windows-1250");
    
public Zaevidovani(){
        databaze = new Databaze();
    }
public void vypisSeznam(){
    databaze.vypisOsoby();
} 
public void vypisUvod(){
    System.out.println("=========================");
    System.out.println("Evidence pojištěných osob");
    System.out.println("=========================");
}
public void pridejOsobu(){
    System.out.println("Zadejte jméno pojištěného: ");
    String jmeno = sc.nextLine();
    System.out.println("Zadejte příjmení: ");
    String prijmeni = sc.nextLine();
    System.out.println("Zadejte věk: ");
    int vek = sc.nextInt();
    sc.nextLine();
    System.out.println("Zadejte telefonní číslo: ");
    String telCislo = sc.nextLine();
    
    databaze.pridaOsobu(jmeno,prijmeni,vek,telCislo);
}
public void vyhledejOsobu(){
    
    System.out.println("Zadejte jméno: ");
    String jmeno = sc.nextLine();
    System.out.println("Zadejte příjmení: ");
    String prijmeni = sc.nextLine();
    
    ArrayList<Osoby> osoby = databaze.najdiPojisteneho(jmeno, prijmeni);
    if (osoby.size()>0){
        for (Osoby o : osoby){
            System.out.println(o);
        }
     
    }else{
        System.out.println("Nenašly se žádné osoby");
    }
    
}
}
