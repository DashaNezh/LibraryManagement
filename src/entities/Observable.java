package entities;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String message);
}
