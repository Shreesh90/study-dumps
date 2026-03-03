package ObserverPattern;

import ObserverPattern.Observable.IPhoneStockObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IPhoneStockObservable();

        NotificationAlertObserver observer1 = new MobileAlertObserverImpl(iphoneStockObservable, 11111111);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl(iphoneStockObservable, 9999999);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl(iphoneStockObservable, "abc@gmail.com");

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStock(10);
        iphoneStockObservable.setStock(0);
        iphoneStockObservable.setStock(20);


    }
    
}
