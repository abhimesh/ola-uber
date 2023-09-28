import javax.xml.stream.Location;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class TripManager {
    static TripManager obj = null;

    private TripManager() {
    }

    static ReentrantLock lock = new ReentrantLock();
    private Map<Integer, Trip> Trips=new HashMap<>();
    static int tripId = 0;

    public static TripManager getInstance() {
        if (obj == null) {
            lock.lock();
            if (obj == null) {
                obj = new TripManager();
            }
            lock.unlock();
        }
        return obj;
    }

    int getTripId()
    {
        tripId++;
        return tripId;
    }
    public void addTrip(int tripId,Trip trip)
    {
        Trips.put(tripId,trip);
    }
    public Trip getDriver(int tripId)
    {
        return Trips.get(tripId);
    }
    public Map<Integer,Trip> getDriverMap(){
        return Trips;
    }

    public void createTrip(Rider rider, location src,location dest)
    {
        TripMetaData tripMetaData=new TripMetaData(rider.Rating,src,dest);
        StrategyManager strategyManager=StrategyManager.getInstance();
        PriceMatchingStrategy priceMatchingStrategy=strategyManager.determineMatchingPrice(tripMetaData);
        DriverMatchingStrategy driverMatchingStrategy=strategyManager.determineMatchingDriver(tripMetaData);

        Double Price=priceMatchingStrategy.calculatePrice(tripMetaData);
        Driver driver=driverMatchingStrategy.MatchingDriver(tripMetaData);
        System.out.println(Price);
        System.out.println(driver.Name);
        Trip trip=new Trip(driver,src,rider,dest,Price,priceMatchingStrategy,driverMatchingStrategy,tripId);
        Trips.put(getTripId(),trip);


    }
}
