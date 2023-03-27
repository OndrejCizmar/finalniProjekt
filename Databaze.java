
package cz.itnetwork.project;
import java.util.ArrayList;


public class Databaze {
    private ArrayList<Osoby> osoby;

    public Databaze(){
        osoby = new ArrayList<>();
    }
    public void pridaOsobu(String jmeno, String prijmeni, int vek, String telCislo){
        osoby.add(new Osoby(jmeno, prijmeni, vek, telCislo));
    }

public ArrayList<Osoby> najdiPojisteneho(String jmeno, String prijmeni){
    
    ArrayList<Osoby> nalezeno = new ArrayList<>();
    for (Osoby o : osoby){
        if ((o.getJmeno().equals(jmeno)) && (o.getPrijmeni().equals(prijmeni))){
            nalezeno.add(o);  
        } 
    }
    return nalezeno;
}
    public void vypisOsoby(){
        for (int i = 0; i < osoby.size();i++){
            System.out.println(osoby.get(i));
        }
    }
}
