import java.util.Objects;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObserver(Object o); //observer에게 알림.
}
