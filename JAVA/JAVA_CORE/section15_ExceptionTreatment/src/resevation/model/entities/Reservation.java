package resevation.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;


    public static DateTimeFormatter fmtc = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        this.roomNumber = roomNumber;
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration() {
        return ChronoUnit.DAYS.between(getCheckIn(), getCheckOut());
    }

    public  void updateDates(LocalDate updatedCheckIn, LocalDate updatedCheckOut) {
        if(!updatedCheckIn.isBefore(updatedCheckOut) || updatedCheckOut.isBefore(LocalDate.now())){
             throw new IllegalArgumentException("Reservation dates for updates must be future dates");
        } if(!updatedCheckOut.isAfter(updatedCheckIn)){
            throw new IllegalArgumentException("Reservation dates Check-Out date must be after Check-In");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reservation: ");
        sb.append("Room: ").append(getRoomNumber()).append(", ");
        sb.append("check-In: ").append(fmtc.format(getCheckIn())).append(", ");
        sb.append("check-Out: ").append(fmtc.format(getCheckOut())).append(", ");
        sb.append(duration());
        if (duration() < 2) {
            sb.append(" night");
        } else {
            sb.append(" nights");
        }
        return sb.toString();
    }


}
