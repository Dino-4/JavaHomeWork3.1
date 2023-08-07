public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int priceOfOneMile = 20;
        int miles = ticketPrice / priceOfOneMile;

        return miles;
    }
}
