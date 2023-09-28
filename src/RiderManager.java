import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class RiderManager {
    static RiderManager obj=null;
    private RiderManager(){}

    static ReentrantLock lock=new ReentrantLock();
    private Map<String,Rider> RiderMap=new HashMap<>();
    public static RiderManager getInstance()
    {
        if(obj==null)
        {
            lock.lock();
            if(obj==null) {
                obj = new RiderManager();
            }
            lock.unlock();
        }
        return obj;
    }
    public void addRider(String Name,Rider rider)
    {
        RiderMap.put(Name,rider);
    }
    public Rider getRider(String Name)
    {
        return RiderMap.get(Name);
    }

}
