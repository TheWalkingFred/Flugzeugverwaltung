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
    System.out.print("\nVorname: ");
    vorname = Tastatur.liesString();
    System.out.print("Familienname: ");  
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
  
  public static String welcher_kunde (int Flugzeug[][], String Kunde[]) {
    int wahl = 0, id_int = 0;
    String id = "";
    String strid = "";
    String name = "";
    String menu[] = {"Namen zur ID"," ID zu Namen"};
    wahl = menukontrolle.auswahl_ohne_back(menu);
    switch (wahl) {
      case  1:
      System.out.print("Welche ID:");
      id_int = Tastatur.liesInt();
      if (id_int <= Kunde.length * 2) {
        name = suchen.get_id(Kunde, id_int);
        System.out.println("Name: " + name); 
      } else {
        Kunde = verwaltung.kundendaten(Kunde);
        id_int = 0;
        id = suchen.get_id(Kunde, id_int);
        
        System.out.println("ID: " + id);
        
        
      } // end of if-else
      
        break;
      case  2:
      id_int = 1000;
      id = suchen.get_id(Kunde, id_int);
      System.out.println("ID: "+ id);
        break;
      default:
      
    }
    return id;  
    }
    
  
  
  
  /*public static int[] buchen ( int Flugzeug[][], String kunde[] ) {  
    
      
  }                               
  public static String[] buchen (Flugzeug[], Kunde[]) {
    
    
    
    
    
  }
  
                                         */
  
  public static void main(String[] args) {
    
  } // end of main
 } 
 // end of class verwaltung
