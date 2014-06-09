/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 09.06.2014
  * @author 
  */

public class statistikneu {
  
  public static void einahmen (int flugzeug[][], String kunde[] ) {
    int wahl = 0;
    float einahmen = 0.0f, preis = 60.0f;
    String menu[] = {"Einahmen Insgesammt","Einnahmen pro Flugzeug","Einnahmen pro Kunde"};
    wahl = menukontrolle.submenu(menu);
    switch (wahl) {
      case  1: 
      
      for (int i = 0;i < flugzeug.length ;i++ ) {
        for (int i2 = 0;i2 < 24 ;i2++ ) {
          if (flugzeug[i][i2] != 0) {
             einahmen = einahmen + preis;
          } // end of if
        } // end of for
      } // end of for
      System.out.printf("\n\nDie Einahmen betragen bei einem Preis\nvon %3.2f Euro die Stunde insgesammt %6.2f Euro\n\n", preis, einahmen); 
        break;
      case  2: 
      int nummer = 1, index = 0;
      System.out.printf("\nEinnahmen pro Flugzeug:\n");
      for (index = 0;index < flugzeug.length ;index++ ) {
        einahmen = 0;
        System.out.printf("\nEinnahmen für Flugzeug Nummer %2d:", nummer);
        for ( int i = 0 ;i < 24 ;i++ ) {
          if (flugzeug[index][i] != 0) {
             einahmen = einahmen + preis;
          } // end of if
        } // end of for
        System.out.printf(" %6.2f Euro", einahmen);
        nummer++;
      } // end of for
        break;
      case  3:
      
       break;  
      default: 
        
    } // end of switch
    
    
    
    
    
    }
  
  
  
  
  public static void main(String[] args) {
    
  } // end of main

} // end of class statistikneu
