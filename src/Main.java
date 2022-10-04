import java.sql.Array;
import java.util.ArrayList;
import java.util.logging.FileHandler;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("Welcome to the application for Meteorological Data Analysis.");
        ImportData turany = new ImportData() ;
        ArrayList<TempData> list =   turany.importFile("B2BTUR01_07_2019.csv");
        System.out.println("We have "+list.size()+" meteorological daily records to analyze.");
        System.out.println("Average temperature for the reporting period: "+turany.average(list));
        System.out.println("Maximum temperature for the reporting period: ");
    }
}