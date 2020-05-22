import java.time.LocalDate;

interface Reservable {
    boolean availableToReserve();
    int allotedDaysToReserve();
    LocalDate dayReserved();
}