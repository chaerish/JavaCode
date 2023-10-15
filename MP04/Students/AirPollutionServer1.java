import java.util.ArrayList;
import java.util.Objects;

public class AirPollutionServer1 implements Runnable,Subject {
    private int pollution = 50;
    private boolean stop = false;
    private int sleepDuration;
    private ArrayList <Observer> observers;
    public AirPollutionServer1(int duration) {
        sleepDuration = duration;
        observers = new ArrayList<>();
    }

    @Override
    public void run() {
        while (!stop) {
            int plusMinus = RandIntInRange.nextInt(0, 1);
            int pollutionDiff = RandIntInRange.nextInt(1, 10);
            if (plusMinus == 1) {
                pollution += pollutionDiff;
            }
            else {
                pollution -= pollutionDiff;
                if (pollution < 0) {
                    pollution = 0;
                }
            }
            System.out.printf("Server: pollution = %d\n", pollution);
            notifyObserver(pollution);
            try {
                Thread.sleep(sleepDuration); // sleepDuration밀리초 멈춤
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int getPollution() { return pollution; }
    public void stopThread() { stop = true; }

    @Override
    public void registerObserver(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObserver(Object o) {
        for(Observer observer:observers){
            observer.update(o);
        }
    }
}