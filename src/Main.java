import javax.xml.stream.Location;

public class Main {
    public static void main(String[] args) {
        Rider r1=new Rider("Ram",4);
        Rider r2=new Rider("shyam",4);
        Rider r3=new Rider("sita",3);
        Rider r4=new Rider("gita",2);
        RiderManager riderManager= RiderManager.getInstance();
        riderManager.addRider("Ram",r1);
        riderManager.addRider("shyam",r2);
        riderManager.addRider("sita",r3);
        riderManager.addRider("gita",r4);

        Driver d1=new Driver("nobody ",4);
        Driver d2=new Driver("shyam",4);
        Driver d3=new Driver("sita",3);
        Driver d4=new Driver("gita",2);

        DriverManager driverManager= DriverManager.getInstance();
        driverManager.addDriver("Ram",d1);
        driverManager.addDriver("shyam",d2);
        driverManager.addDriver("sita",d3);
        driverManager.addDriver("gita",d4);

        TripManager tripManager=TripManager.getInstance();
        tripManager.createTrip(r1, new location(10,10), new location(10,10));



    }
}