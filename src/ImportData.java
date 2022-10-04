import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ImportData {
    String data;
    public ArrayList<TempData> importFile(String filename) {
        ArrayList<TempData> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(filename));
            sc.useLocale(Locale.US);
            sc.useDelimiter(",|\n");
            sc.nextLine();
            while (sc.hasNext()) {
                //String data = sc.next();
                int year = sc.nextInt();
                int month = sc.nextInt();
                int day = sc.nextInt();
                double averageTemp = sc.nextDouble();
                double maxTemp = sc.nextDouble();
                double minTemp = sc.nextDouble();
                double pressure = sc.nextDouble();
                double windSpeed = sc.nextDouble();
                int humidity = sc.nextInt();
                double rain = sc.nextDouble();
                list.add(new TempData(year, month, day, averageTemp, maxTemp, minTemp, pressure, windSpeed, humidity, rain));
            }
        } catch (Exception ex) {
            System.err.println("Error while reading file: " + filename + "!");
            System.err.println("Error message: " + ex.getMessage());
        }
        return list;
    }

    public double average(ArrayList<TempData> dates){
        double avr = 0;
        for (TempData date : dates){
            avr += date.averageTemp;
        }
        return avr / dates.size();
    }
}
