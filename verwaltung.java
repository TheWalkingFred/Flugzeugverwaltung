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
    System.out.print("Familienname:");  
    nachname = Tastatur.liesString();
    for (int i = 0 ;i < kunde.length ;i++ ) {
      kundemodul[i] = kunde[i];
      //nachnameint = i + 1;
      //kundemodul[nachnameint] = kunde[nachnameint]; 
    } // end of for
    kundemodul[neuvor] = vorname;
    kundemodul[neunach] = nachname;
    System.out.println(kundemodul[neuvor] + " " + kundemodul[neunach]);
    //id = suchen.id(kunde,id);
    //System.out.println(id);
    return kundemodul;
  }
  
  public static boolean kunde_exist (String kunde[], boolean kunde_exist, int id )  {
    if ( id > kunde.length / 2) {
      kunde_exist = false;
    } // end of if
    return kunde_exist;
  }
  
  public static String welcher_kunde (String Kunde[]) {
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
      if (id_int <= Kunde.length / 2) {
        name = suchen.get_id(Kunde, id_int);
        System.out.println("Name: " + name);
        id = String.valueOf(id_int); 
      } else {
        System.out.printf("\nBitte neuen Kunden anlegen!\n\n");
        id = String.valueOf(id_int);
        //Kunde = verwaltung.kundendaten(Kunde);
        //id_int = 0;
        //id = suchen.get_id(Kunde, id_int);
        
        //System.out.println("ID: " + id);
        
        
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
  
  public static void show_flugzeuge ( int flugzeug[][]) {
    int airplane = 0, airindex = 0;
    int index = 0;
    for ( airindex = 0; airindex < flugzeug.length ; airindex++ ) { 
      airplane++; 
      System.out.println("Flugzeug " + airplane + ":");
      System.out.print("Uhrzeit: ");
      for (index = 0; index < flugzeug[airindex].length ; index++ ) {
        System.out.print( index + " |");
      } // end of for
      System.out.printf("\nBuchung: ");
      for (index = 0; index < flugzeug[airindex].length ; index++ ) {
        System.out.print(flugzeug[airindex][index] + " |");
      } // end of while
      
      
    }
  }
  
  public static void show_einzelnes_flugzeug (int flugzeug[][], int nummer) {
    int airindex = nummer - 1;
    
    System.out.println("Flugzeug " + nummer + ":");
    System.out.print("Uhrzeit: ");
    for (int index = 0; index < flugzeug[airindex].length ; index++ ) {
      System.out.print( index + " |");
    } // end of for
    System.out.printf("\nBuchung: ");
    for ( int index = 0; index < flugzeug[airindex].length ; index++ ) {
      System.out.print(flugzeug[airindex][index] + " |");
    } // end of while
    
    
  }
  
  
  public static int[][] buchen_aktion (int flugzeug[][], int id) {
    int nummer = 0, anfang = 0, ende = 0, check = 0;
    boolean frei = true;
    do { 
      frei = true;
      do { 
        System.out.print("Welches Flugzeug (1 - " + flugzeug.length + "):");
        nummer = Tastatur.liesInt();
      } while ( nummer < 1 || nummer > flugzeug.length );
      System.out.println("Welche Uhrzeit (8 - 19 Uhr)?");
      
      do { 
        System.out.print("Von:");
        anfang = Tastatur.liesInt();
      } while ( anfang < 8 || anfang > 18 );
      
      do { 
        System.out.print("Bis:");
        ende = Tastatur.liesInt();
      } while ( ende < 9 || ende > 19);
      
      for (int i = anfang;i < ende ;i++ ) {
        check = flugzeug[nummer -1][i];
        if (check != 0) {
          frei = false;
          i = ende;
          System.out.printf("Das Flugzeug ist teilweise oder ganz belegt!\n Bitte anderen Zeitraum oder anderes Flugzeug wählen!\n\n");
          verwaltung.show_flugzeuge(flugzeug);
          
        } // end of if
      } // end of for
      
    } while (frei == false);
    
    for (int i = anfang; i < ende ;i++ ) {
      flugzeug[nummer - 1][i] = id;
    } // end of for
    
    verwaltung.show_einzelnes_flugzeug(flugzeug, nummer);
    return flugzeug;
  }
  
  
  
  public static int[][] buchen ( int flugzeug[][], String kunde[], int id ) {  
    
    //String id_string = "";
    //id_string = verwaltung.welcher_kunde(kunde);
    //id = Integer.valueOf(id_string);
    //verwaltung.show_flugzeuge(flugzeug);
    flugzeug = verwaltung.buchen_aktion(flugzeug, id);
    
    return flugzeug;  
  }                               
  
  public static int[][] storno ( int flugzeug[][], int id ) {
    int wahl = 0, nummer = 0, stunde = 0, count = 0;
    String menu[] = {"Teilweise Stornieren","Ganz Stornieren"};
    wahl = menukontrolle.submenu(menu);
    switch (wahl) {
      case  1: 
      
      for (int i = 0;i < flugzeug.length ;i++ ) {
        for (int i2 = 0;i2 < 24 ;i2++ ) {
          if (flugzeug[i][i2] == id ) {
            nummer = i + 1;
            System.out.println();
            verwaltung.show_einzelnes_flugzeug(flugzeug, nummer);
            System.out.println();
            
          } // end of if
        } // end of for
      } // end of for
      if ( nummer > 0) {
        System.out.printf("\nWelche Zeit soll storniert werden?\n");
        System.out.println(); 
        
        System.out.print("Welches Flugzeug?:");
        nummer = Tastatur.liesInt();
        nummer = nummer - 1;
        
        char weiter;
        do { 
          
          System.out.printf("\nWelche Stunde");
          stunde = Tastatur.liesInt();
          if (flugzeug[nummer][stunde] == id) {
            flugzeug[nummer][stunde] = 0;
            verwaltung.show_einzelnes_flugzeug(flugzeug, nummer + 1);
          } else {
            System.out.printf("\nFlugzeug ist zu diesem Zeitpunkt bereits nicht von Kunden belegt!\n");
          } // end of if-else
          System.out.printf("\n\nSoll eine weitere Stunde storniert werden(J)?");
          weiter = Tastatur.liesChar();
        } while (weiter == 'j' || weiter == 'J' );
        
      } else {
        System.out.println("Keine Buchung eingetragen!");
      } // end of if-else
       
        break;
      case  2:
      verwaltung.show_flugzeuge(flugzeug);
      System.out.println();
      System.out.println(); 
      for (int i = 0;i < flugzeug.length ;i++ ) {
        for (int i2 = 0;i2 < 24 ;i2++ ) {
          if (flugzeug[i][i2] == id) {
            flugzeug [i][i2] = 0;
          } // end of if
        } // end of for
      } // end of for
      verwaltung.show_flugzeuge(flugzeug);
      System.out.println();
      System.out.println();
        break;
      default: 
        
    } // end of switch
    return flugzeug;
  }
  
  public static int[][] umbuchen (int flugzeug[][], int id ) { 
    System.out.printf("\nStorno:\n");
    flugzeug = verwaltung.storno(flugzeug, id);
    System.out.printf("\nNeue Buchung:\n");
    flugzeug = verwaltung.buchen_aktion(flugzeug, id);
    return flugzeug;
  }
  
  
  public static void main(String[] args) {
    
  } // end of main
} 
  // end of class verwaltung
