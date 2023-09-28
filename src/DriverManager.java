import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class DriverManager {
    static DriverManager obj=null;
    private DriverManager(){}

    static ReentrantLock lock=new ReentrantLock();
    private Map<String,Driver> DriverMap=new HashMap<>();
    public static DriverManager getInstance()
    {
        if(obj==null)
        {
            lock.lock();
            if(obj==null) {
                obj = new DriverManager();
            }
            lock.unlock();
        }
        return obj;
    }
    public void addDriver(String Name,Driver driver)
    {
        DriverMap.put(Name,driver);
    }
    public Driver getDriver(String Name)
    {
        return DriverMap.get(Name);
    }
    public Map<String,Driver> getDriverMap(){
        return DriverMap;
    }
}
