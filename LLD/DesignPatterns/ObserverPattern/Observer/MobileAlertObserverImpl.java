package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    StockObservable stockObservable;
    int mobile;
    public MobileAlertObserverImpl(StockObservable stockObservable, int mobile) {
        this.mobile = mobile;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println(String.format( "Stock for %s has been updated: Message sent to Mobile: %s", stockObservable.getStock(), this.mobile));
    }
    
}
