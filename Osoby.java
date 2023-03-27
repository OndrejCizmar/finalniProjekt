
package cz.itnetwork.project;


public class Osoby {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonCislo;

    public Osoby(String jmeno, String prijmeni, int vek, String telCislo){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonCislo = telCislo;
     
}
public String getJmeno(){
    return jmeno;
}
public int getVek(){
    return vek;
}
public String getTelcislo(){
    return telefonCislo;
}
public String getPrijmeni(){
    return prijmeni;
}
public void setJmeno(String jmeno){
    this.jmeno = jmeno;
}
public void setPrijmeni(String prijmeni){
    this.prijmeni = prijmeni;
}
public void setVek(int vek){
    this.vek = vek;
}
public void setTelCislo(String telCislo){
    this.telefonCislo = telCislo;
}

@Override
public String toString(){
    return jmeno + " " + prijmeni + " " + vek + " " + telefonCislo;
}
}