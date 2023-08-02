public class Main {
    /* public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int result = service.calculate(10000, 20);
         System.out.println(result);
     } */
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10_000;
        int priceOfOneMile = service.calculate(ticketPrice); // должно получиться 500
        System.out.println(priceOfOneMile);
    }
}