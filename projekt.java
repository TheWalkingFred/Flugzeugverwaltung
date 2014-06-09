/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 06.05.2014
  * @author 
  */

public class projekt {
  
  
  public static void main(String[] args) {
    
    
    
    int FlugANZ = 4, stunden = 24, Kundenanz = 1;
    int Flugzeug[][] = new int[FlugANZ][stunden];
    String Kunde[] = new String[Kundenanz];
    Kunde[0] = "Null";
    // Erst Initialisieren, dann Dateilesen und in Arrays schreiben  oder automatisch befüllen
    //RWData daten = new RWData();
    //Kunde = daten.laden();
    
    int wahl = 0;
    int subwahl = 0;
    String menu[] = {"Suchen", "Kundenverwaltung/ Buchung", "Statistiken"};
    do {
      
      System.out.println();
      wahl = menukontrolle.menu_end_hauptprogramm(menu);
      menukontrolle.leer();
      
      switch (wahl) {
        case  1: 
        String sub1[] = {"Flugzeug", "Zeit", "Eigenschaften"}; 
        //Flugzeug: Kunde möchte Flugzeug "Rosa" unabhängig vom Zeitpunkt, also wird für Flugzeig X an einem speziellen Datum  gesucht
        //Namen ausdenken: g 
        //Freddy Teil + lesen/speichern                                                                                                                                                                                      
        //Zeit: egal welches Flugzeug, Kunde möchte zu einem bestimmten Zeitpunkt wissen ob ein Flugzeug frei ist
        subwahl = menukontrolle.submenu(sub1); 
        switch (subwahl) {
          case  1: 
          
          break;
          case  2: 
          
          break;
          default: 
          
        } // end of switch
        break;
        
        
        // offenes Thema
        case  2:
        String sub2[] = {"Reservierung", "Storno", "Umbuchung", "Kunde anlegen"};
        subwahl = menukontrolle.submenu(sub2);
        // Reservierung: wir fragen nach namen oder id ( submenu in modul mit abfrage nach namens oder id- suche, auwahl ohne zurück) / wenn kunde nicht existiert,
        // dann wird verwaltung.kundendaten aufgerufen und kunde angelegt, id dazu rausgesucht ( über id = 0)/ Reservierung vornehmen durch extra Reservierungsmodul
        
        // extra-modularisierung von submenu zur abfrage nach namen oder id, für abfrage nach id muss ein weiteres modul geschrieben werden, für abfrage nach namen
        // muss suchen.id aufgerufen, wobei id = 10000
        
        // Storno: einfach abfrage nach wann er stornieren möchte, kundenid wird in array an der Stelle durch eine Null ersetzt
        
        
        
        
        
        
        int id_int = 0;
        String id = "";
        
        
        
        
        //Umbuchung: modul abfrage, modul storno, modul reservierung
        switch (subwahl) {
          case  1:
          boolean kunde_exist = true;
          id_int = 0;
          id = "";
          id = verwaltung.welcher_kunde(Kunde);
          id_int = Integer.valueOf(id);
          kunde_exist = verwaltung.kunde_exist(Kunde, kunde_exist, id_int);
          if (kunde_exist == false) {
            Kunde = verwaltung.kundendaten(Kunde);
            //daten.schreiben(Kunde);
            id_int = 0;
            id = suchen.get_id(Kunde, id_int);
            System.out.println("ID: " + id);
            id_int = Integer.valueOf(id);
          }
          
          Flugzeug = verwaltung.buchen(Flugzeug, Kunde, id_int);
          break;
          case  2:
          id_int = 0;
          id = "";
          
          System.out.print("Welcher Kunde (ID):");
          id_int = Tastatur.liesInt();
          if (id_int < 0 || id_int > Kunde.length / 2) {
            System.out.println("Kunde nicht vorhanden!!!");
            break;  
          } // end of if
          
          
          id = suchen.get_id(Kunde, id_int); 
          Flugzeug = verwaltung.storno(Flugzeug, id_int);
          
          break;
          case  3:
          id_int = 0;
          id = "";
          
          System.out.print("Welcher Kunde (ID):");
          id_int = Tastatur.liesInt();
          if (id_int < 0 || id_int > Kunde.length / 2) {
            System.out.println("Kunde nicht vorhanden!!!");
            break;  
          } // end of if
          
          
          id = suchen.get_id(Kunde, id_int); 
          Flugzeug = verwaltung.umbuchen(Flugzeug, id_int);
          break;
          case  4: 
          Kunde = verwaltung.kundendaten(Kunde);
          // 
          break;  
          default:
          
        }
        
        
        break;
        
        case  3:
        String sub3[] = {"Vorraussichtlichte Einnahmen", "Statistische Auslastungen"}; 
        subwahl = menukontrolle.submenu(sub3);
        switch (subwahl) {
          case  1: 
          statistikneu.einnahmen(flugzeug, kunde);
          break;
          case  2: 
          //statistikneu.auslastungen(flugzeug, kunde);
          break;
          default: 
          
        } // end of switch*/
        //statistik.auslastung();
        break;  
        default: 
        
      } // end of switch
      
      
      
      
      
    } while (wahl <= menu.length); // end of do-while// end of while
    
    //Datei speichern
    
    
  } // end of main
  
} // end of class projekt


//modul buchen(Kunde,Flugzeug) ---> submenu zur auswahl, gibt id zurück, zwischen idsuche nach namen oder id ---->  












