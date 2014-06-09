/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 07.05.2014
  * @author 
  */

public class suchen {
  
  
  // Modul um ID zu bestimmen, wenn die letzte eingetragene ID bestimmt werden soll, dann muss id=0 eingefügt werden, wenn id über namen gesucht werden soll
  //dann id = 10000, und es werden namen abgefragt und id bestimmt
  public static String idzahl(String kunde[], int id)  {
    String strid = "";
    int i = 0, wahl = 0;
    String vorname = "", nachname = "";
    String auswahl[] = {"Suchen nach Vorname","oder Nachname"};
    
    if (id == 0) {
      id = kunde.length - 1;
      id = id / 2;
      
    } else if (id == 10000)  {
      wahl = menukontrolle.auswahl_ohne_back(auswahl);
      switch (wahl) {
        
        case  1: 
        System.out.print("Welcher Vorname:");
        vorname = Tastatur.liesString();
          for ( i = 1;i < kunde.length ; i = i + 2 ) {
          if (vorname.equalsIgnoreCase(kunde[i])==true) {
            id = i + 1;
            id = id / 2;
            i = kunde.length;
          } // end of if
        } // end of for
        break;
        
        case  2: 
        System.out.print("Welcher Nachname:");
        nachname = Tastatur.liesString();
        for ( i = 2;i < kunde.length ; i = i + 2 ) {
          if (nachname.equalsIgnoreCase(kunde[i])==true) {
            id = i + 1;
            id = id / 2;
            i = kunde.length;
          } // end of if
        } // end of for  
        break;
        
        default: 
        
      } // end of switch
    } // end of if-else
    
    strid = String.valueOf(id);
    return strid;
  }
  
  public static String get_id (String kunde[], int id) {
    String strid = "";
    
    if ( id == 0 || id == 10000) {
      strid = suchen.idzahl(kunde, id);
    }
    else {
      strid = suchen.idname(kunde, id);
      
    } // end of if-else
    return strid;
  }
  
  public static String idname (String kunde[], int id) {
    int indexvor, indexnach;
    String vorname = "", nachname = "", name = "";
    indexnach = id * 2;
    indexvor = indexnach - 1;
    vorname = kunde[indexvor];
    nachname = kunde [indexnach];
    name = vorname + " " + nachname;
    return name;
  }
  
  public static void main(String[] args) {
    
  } // end of main
  
  
   
  
  
  
  
} // end of class suchen
