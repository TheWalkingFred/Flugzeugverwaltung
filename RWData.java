/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 08.06.2014
  * @author 
  */
import java.io.*;
public class RWData {
  //FileWriter operation;
  //File datei;
  
  //Schreibt letzten angelegten Kunden in eine Datei mit der ID als Namen (ID.txt)
  public static void schreiben(String kunde[]){
    FileWriter operation;
    File datei;
    String id = suchen.idzahl(kunde, 0);
    String pfad = ("C:\\projects\\Flugzeugverwaltung\\Kunden\\" + id + ".txt");
    datei = new File(pfad);
    
    String vorname = kunde[kunde.length - 2];
    String nachname = kunde[kunde.length - 1];
    
    try {
      operation = new FileWriter(datei);
      operation.write(vorname);
      operation.write("\n");
      operation.write(nachname);
      operation.flush();
      operation.close();
    } catch(IOException e) {
      System.out.println("\nCould't write file!");
    } finally {
      System.out.println("\nKunde angelegt!");
    } // end of try
  }
  
  
  //Wenn Kundendateien vorhanden sind, werden sie geladen und an das Array Kunde[] im Hauptprogramm zurückgegegben.
  public static String[] laden(){ 
    String kundenArray[] = new String[1000];
    kundenArray[0] = "Null";
    
    FileReader fr;
    BufferedReader br;
    
    boolean check = false;
    
    int idInt = 1;
    String id = Integer.toString(idInt);
    int counter = 1;
    
    File file;
    String pfad = ("C:\\projects\\Flugzeugverwaltung\\Kunden\\" + id + ".txt");
    file = new File(pfad);
    
    while (file.isFile()) { 
      pfad = ("C:\\projects\\Flugzeugverwaltung\\Kunden\\" + id + ".txt");
      file = new File(pfad);
      try {
        fr = new FileReader(pfad);
        br = new BufferedReader(fr);
        String zeile;
        zeile = br.readLine();
        while (zeile != null) {
          kundenArray[counter] = zeile;
          counter++;
          zeile = br.readLine();
          kundenArray[counter] = zeile; 
        }
        fr.close();
        br.close();
      }
      catch (IOException e){
        System.out.println("Kundendaten wurden geladen!\n");
      }
      idInt++;
      id = Integer.toString(idInt);
    }
    
    int groesse = 1;
    while (!check) { 
      for (int i = 1;i < 1000 ;i++ ) {
        if (kundenArray[i] != null) {
          groesse++; 
        } 
        else {
          check = true;
          //i = 1000;
          break;
        } 
      } 
    } 
    String neuArray[] = new String[groesse];
    neuArray[0] = "Null";
    
    for (int i = 1; i < neuArray.length ;i++ ) {
      neuArray[i] = kundenArray[i];
    } 
    return neuArray;
  }
}