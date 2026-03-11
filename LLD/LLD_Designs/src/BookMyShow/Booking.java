package BookMyShow;

import VehicleRentalSystem.Payment;

import java.util.List;

public class Booking {
    int booking_id;
    Show show;
    List<Seat> booked_seats;
    Payment payment;
}
