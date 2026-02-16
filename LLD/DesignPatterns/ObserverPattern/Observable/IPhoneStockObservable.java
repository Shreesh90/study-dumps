package DesignPatterns.ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class IPhoneStockObservable implements StockObservable {

    List<NotificationAlertObserver> observers = new ArrayList<>();
    int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer: observers) {
            observer.update();
        }
    }

    @Override
    public void setStock(int stockCount) {
        if(this.stockCount == 0) {
            notifySubscribers();
        }
        this.stockCount = stockCount;
    }

    @Override
    public String getStock() {
        return "IPhone";
    }

}
