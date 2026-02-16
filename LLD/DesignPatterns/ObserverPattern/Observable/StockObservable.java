package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStock(int stockCount);
    public String getStock();
    
}
