/**
  *
  * <b>Description:<\b><br/>
  *
  * @version 1.0 from 16.01.2014
  * @author 
  */

public class Datumspruefung {
  // Anfang Attribute
  // Ende Attribute
  
  // Anfang Methoden
  public static void main(String[] args) {
    char w  = 'j';
    do {
      
      int divrest, tag, monat, jahr, checkjahr = 0, schaltjahr = 0, tag30 = 30, tag31 = 31, februar = 28, februarschalt = 29;
      boolean schalt = false , tagmonat = false;
      
      do {
        System.out.print("Tag: ");
        tag = Tastatur.liesInt();
      } while ( tag < 1 || tag > 31);
      
      do {
        System.out.print("Monat: ");
        monat = Tastatur.liesInt();
      } while ( monat < 1 || monat > 12);
      
      do {
        System.out.print("Jahr (zwischen 1582 und 2499!!!): ");
        jahr = Tastatur.liesInt();
      } while ( jahr < 1582 || jahr > 2499 );
      
      
      schaltjahr = (jahr - checkjahr)/4;
      divrest = (jahr - checkjahr) - (schaltjahr * 4);
      if ( divrest != 0 || jahr == 1600 || jahr == 2000 || jahr == 2400) {
        schalt = false;
      } else if ( divrest == 0 || jahr == 1700 || jahr == 1800 || jahr == 1900 || jahr == 2100 || jahr == 2200 || jahr == 2300 ) {
        schalt = true;
        
      } // end of if-else
      
      if ( monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12) {
        tagmonat = true;
      }
      if ( monat == 4 || monat == 6 || monat == 9 || monat == 11) {
        if ( tag >= 30) {
          tagmonat = false;
        } else {
          
          tagmonat = true;
        } // end of if-else
      }
      
      if ( monat == 2) {
        if ( schalt == true) {
          if (  tag < 30 ) {
          tagmonat = true;
        } else  if ( tag > 29 ){
          tagmonat = false;
          
        } // end of if-else
        } else if ( schalt == false) {
          if ( tag <= 28 ) {
            tagmonat = true;
          } else if ( tag >= 28 )  {
            tagmonat = false;
            
          } // end of if-else
          
        } // end of if-else
      }
      
      
      if ( tagmonat == true) {
        System.out.println("Das Datum " + tag + "." + monat + "." + jahr + " ist richtig!" );
      } else if ( tagmonat == false ) {
        System.out.println("Das Datum " + tag + "." + monat + "." + jahr + " ist falsch!" );
        
      } // end of if-else
      
      System.out.print("Wiederholen (j/n): ");
      w = Tastatur.liesChar();
    } while ( w == 'j' || w == 'J' );
    
  }
  // Ende Methoden
}
