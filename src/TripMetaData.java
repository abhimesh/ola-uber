import javax.xml.stream.Location;

public class TripMetaData {
    int driverRating;
    int riderRating;
    location src;
    location Dest;
    TripMetaData(int riderRating,location src,location Dest)
    {
        this.riderRating=riderRating;
        this.src=src;
        this.Dest=Dest;
    }

}
