package VehicleRentalSystem;

import java.sql.Time;
import java.util.Date;

public class Reservation {
    Vehicle vehicle;
    User user;
    Date reservationDate;
    Date bookingFrom;
    Date bookingTill;
    int amount;
    ReservationStatus reservationStatus;
    PaymentStatus paymentStatus;
}
