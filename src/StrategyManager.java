import java.util.concurrent.locks.ReentrantLock;

public class StrategyManager {
    private static StrategyManager obj=null;
    private static ReentrantLock lock=new ReentrantLock();
    public static StrategyManager getInstance()
    {
        if(obj==null)
        {
            lock.lock();
            if(obj==null) {
                obj = new StrategyManager();
            }
            lock.unlock();
        }
        return obj;
    }

    public DriverMatchingStrategy determineMatchingDriver(TripMetaData tripMetaData)
    {
        return new minTimeBasedDriverStrategy();
    }
    public PriceMatchingStrategy determineMatchingPrice(TripMetaData tripMetaData)
    {
        return  new ratingBasedPriceStrategy();
    }

}
