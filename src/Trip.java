import javax.xml.stream.Location;

public class Trip {
    Driver driver;
    Rider Rider;
    location src;
    location dest;
    Double Price;
    PriceMatchingStrategy priceMatchingStrategy;
    DriverMatchingStrategy driverMatchingStrategy;

    //user
    //usermanager
    //file,folder

    //access
    //


    Trip(Driver driver,location src,Rider rider,
         location dest,Double Price,PriceMatchingStrategy priceMatchingStrategy,DriverMatchingStrategy driverMatchingStrategy)
    {
        this.driver=driver;
        this.src=src;
        this.dest=dest;
        this.Price=Price;
        this.priceMatchingStrategy=priceMatchingStrategy;
        this.driverMatchingStrategy=driverMatchingStrategy;
        this.Rider=Rider;
    }
}
