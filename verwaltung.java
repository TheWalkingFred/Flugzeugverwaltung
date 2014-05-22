/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 06.05.2014
  * @author 
  */

public class verwaltung {
  public static String[] kundendaten(String kunde[]){
    
    int id = 0, anz = kunde.length + 2, nachnameint = 0;
    String kundemodul[] = new String[anz];
    String vorname = "", nachname = "";
    int neuvor = kundemodul.length - 2, neunach = kundemodul.length - 1;
    
    System.out.println("Kunde:");
    System.out.print("Vorname:");
    vorname = Tastatur.liesString();
    System.out.print("Familienname");  
    nachname = Tastatur.liesString();
    for (int i = 1 ;i < kunde.length ;i = i + 2 ) {
      kundemodul[i] = kunde[i];
      nachnameint = i + 1;
      kundemodul[nachnameint] = kunde[nachnameint]; 
    } // end of for
    kundemodul[neuvor] = vorname;
    kundemodul[neunach] = nachname;
    System.out.println(kundemodul[neuvor] + " " + kundemodul[neunach]);
    //id = suchen.id(kunde,id);
    //System.out.println(id);
    return kundemodul;
    }
  
  /*public static int[] buchen ( int Flugzeug[][], String kunde[] ) {  
    
    //id = suchen.id(Kunde,id);  
  }                               */
  /*public static String[] buchen (Flugzeug[], Kunde[]) {
    
    
    
    
    
  }
  
                                         */
  
  public static void main(String[] args) {
    
  } // end of main
  
} // end of class verwaltung
