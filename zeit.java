/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 09.05.2014
  * @author 
  */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
public class zeit {
  public static String datum() {
    SimpleDateFormat formatter = new SimpleDateFormat(
    "dd.MM.yyyy");
    Date currentTime = new Date();
    System.out.println(formatter.format(currentTime)); 
    String time = formatter.format(currentTime); 
    return time;     
  }
  
  public static String any_datum() {
    
    String time = "", strtag = "", strmonat = "";
    int divrest, tag, monat, jahr, checkjahr = 0, schaltjahr = 0, tag30 = 30, tag31 = 31, februar = 28, februarschalt = 29;
    boolean schalt = false , tagmonat = false;
    
    
    do {
      
      
      
      
      do {
        System.out.print("Tag: ");
        tag = Tastatur.liesInt();
      } while ( tag < 1 || tag > 31);
      
      do {
        System.out.print("Monat: ");
        monat = Tastatur.liesInt();
      } while ( monat < 1 || monat > 12);
      
      do {
        System.out.print("Jahr: ");
        jahr = Tastatur.liesInt();
      } while ( jahr < 2014 || jahr > 2030 );
      
      
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
        //System.out.println("Das Datum " + tag + "." + monat + "." + jahr + " ist richtig!" );
        strtag = String.valueOf(tag);
        if (strtag.length() < 2) {
          strtag = "0" + strtag;
        }
        
        strmonat = String.valueOf(monat);
        if (strmonat.length() < 2) {
          strmonat = "0" + strmonat;
        }
        
        time = strtag + "." + strmonat + "." + jahr;
        System.out.println(time);
      }
    } while (tagmonat == false);
    return time;
  }
  
  
  
  
  
  public static void main(String[] args) {
    
    
  } // end of main
  
} // end of class zeit
