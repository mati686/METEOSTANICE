public class TempData implements Comparable<TempData>{
    int year;
    int month;
    int day;
    double averageTemp;
    double maxTemp;
    double minTemp;
    double pressure;
    double windSpeed;
    int humidity;
    double rain;

    public TempData(int year,int month, int day, double averageTemp, double maxTemp, double minTemp, double pressure, double windSpeed, int humidity, double rain){
        this.year = year;
        this.month = month;
        this.day = day;
        this.averageTemp = averageTemp;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.humidity = humidity;
        this.rain = rain;
    }

    public int compareTo(TempData day){
        if(averageTemp==day.averageTemp)
            return 0;
        else if(averageTemp>day.averageTemp)
            return 1;
        else
            return -1;
    }
}
}
