/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 06.05.2014
  * @author 
  */

public class projekt {
  
  
  public static void main(String[] args) {
    
    RWData daten = new RWData();
    int FlugANZ = 4, stunden = 24, Kundenanz = 1;
    int Flugzeug[][] = new int[FlugANZ][stunden];
    String Kunde[] = new String[Kundenanz];    
    Kunde[0] = "Null";
    //String alleKunden[] = new String[1000];
    //alleKunden = daten.laden();
    Kunde = daten.laden();
    System.out.println(Kunde[0]);// + Kunde[1]);// + Kunde[2] + Kunde[3] + Kunde[4] + Kunde[5] + Kunde[6]);
    System.out.println(Kunde.length);
    // Erst Initialisieren, dann Dateilesen und in Arrays schreiben  oder automatisch befüllen
    
    int wahl = 0;
    int subwahl = 0;
    String menu[] = {"Suchen", "Kundenverwaltung/ Buchung", "Statistiken"};
    do {
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
        
        //Umbuchung: modul abfrage, modul storno, modul reservierung
        switch (subwahl) {
          case  1:
          
          //Flugzeug = verwaltung.buchen(Flugzeug, Kunde);
          break;
          case  2:
          //Flugzeug = verwaltung.storno(Flugzeug, Kunde);
          break;
          case  3:
          //Flugzeug = verwaltung.umbuchen(Flugzeug, Kunde);
          break;
          case  4: 
          Kunde = verwaltung.kundendaten(Kunde);
          daten.schreiben(Kunde);
          // 
          break;  
          default:
          
        }
        
        break;
        
        case  3:
        String sub3[] = {"Auslastung nach Flugzeugen", "Auslastung nach Zeit"}; 
        subwahl = menukontrolle.submenu(sub3);
        switch (subwahl) {
          case  1: 
          
          break;
          case  2: 
          
          break;
          default: 
          
        } // end of switch
        break;  
        default: 
        
      } // end of switch
      
    } while (wahl < menu.length); // end of do-while// end of while
    
    //Datei speichern
    
  } // end of main  
} // end of class projekt

//modul buchen(Kunde,Flugzeug) ---> submenu zur auswahl, gibt id zurück, zwischen idsuche nach namen oder id ---->  












