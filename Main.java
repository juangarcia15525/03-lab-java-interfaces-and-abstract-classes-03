import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== BIGDECIMAL OPERATIONS ===");
        BigDecimal num1 = new BigDecimal("4.2545");
        BigDecimal num2 = new BigDecimal("1.2345");
        BigDecimal num3 = new BigDecimal("-45.67");

        System.out.println("Rounded to nearest hundredth: " +
                BigDecimalOperations.roundToNearestHundredth(num1));

        System.out.println("Reverse sign and round to nearest tenth (1.2345): " +
                BigDecimalOperations.reverseSignAndRoundToNearestTenth(num2));

        System.out.println("Reverse sign and round to nearest tenth (-45.67): " +
                BigDecimalOperations.reverseSignAndRoundToNearestTenth(num3));

        System.out.println();
        System.out.println("=== CAR INVENTORY SYSTEM ===");

        Car sedan = new Sedan("VIN001", "Toyota", "Corolla", 50000);
        Car suv = new UtilityVehicle("VIN002", "Jeep", "Cherokee", 30000, true);
        Car truck = new Truck("VIN003", "Ford", "F-150", 45000, 3500.5);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());

        System.out.println();
        System.out.println("=== VIDEO STREAMING SERVICE ===");

        Video series = new TvSeries("Breaking Bad", 50, 62);
        Video movie = new Movie("Inception", 148, 8.8);

        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());

        System.out.println();
        System.out.println("=== INTLIST INTERFACE ===");

        IntList arrayList = new IntArrayList();
        IntList vector = new IntVector();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        vector.add(100);
        vector.add(200);
        vector.add(300);

        System.out.println("IntArrayList element at index 1: " + arrayList.get(1));
        System.out.println("IntVector element at index 2: " + vector.get(2));
    }
}