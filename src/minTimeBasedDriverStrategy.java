import java.util.Map;

public class minTimeBasedDriverStrategy implements DriverMatchingStrategy{

    @Override
    public Driver MatchingDriver(TripMetaData tripMetaData) {
        DriverManager objDriverManager=DriverManager.getInstance();
        Map<String,Driver> DriverMap=objDriverManager.getDriverMap();
        for(Map.Entry<String,Driver> entry : DriverMap.entrySet())
        {
            if(entry.getValue().Rating>=tripMetaData.riderRating)
            {
                return entry.getValue();
            }
        }
        return null;
    }
}
