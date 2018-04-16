import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.lang.Iterable;

public class Legocsv {
    //Holds all lego items
    public static LegoItem[] itemsArray;

    public Legocsv(){
        //holds items form the csv file
        itemsArray = new LegoItem[6172];
        //This method reads the file, creates objects with the appropriate fields and stores them into an arraylist
        try{
            readFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Legocsv newReader = new Legocsv();
    }

    public void readFile() throws IOException{
        //Reads file, and sets it to an excel format with the first line as the header
        Reader csvFile = new FileReader("lego.csv");
        Iterable<CSVRecord> itemsCsv = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(csvFile);
        //For each line it creates an LegoItem object and it gets added to the array
        int i = 0;
        for(CSVRecord item: itemsCsv){
            LegoItem newItem = new LegoItem(item.get("Item_Number"), item.get("Name"), item.get("Year"),
                    item.get("Theme"), item.get("Subtheme"), item.get("Pieces"), item.get("Minifigures"),
                    item.get("Image_URL"), item.get("GBP_MSRP"), item.get("USD_MSRP"), item.get("CAD_MSRP"),
                    item.get("EUR_MSRP"), item.get("Packaging"), item.get("Availability"));
            itemsArray[i] = newItem;
            i++;
        }
    }
}