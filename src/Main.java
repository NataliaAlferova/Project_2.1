public class Main {
    public static void main(String[] args) {
        double bonusThreshold = 20;
        double ticketPrice = 6550.45;
        int bonusMiles = (int) (ticketPrice / bonusThreshold);
        System.out.println(bonusMiles);
    }
}