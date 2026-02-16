package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    
    StockObservable stockObservable;
    String email;
    public EmailAlertObserverImpl(StockObservable stockObservable, String email) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println(String.format( "Stock for %s has been updated: Message sent to email: %s", stockObservable.getStock(), this.email));
    }
}
