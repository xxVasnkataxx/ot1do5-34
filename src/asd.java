import java.util.Scanner;

public class asd {
}
import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class CarCollectionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character.

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] carInfo = line.split(" ");

            String brand, model;
            int horsepower;

            if (carInfo.length == 3) {
                brand = carInfo[0];
                model = carInfo[1];
                horsepower = Integer.parseInt(carInfo[2]);
            } else {
                brand = carInfo[0];
                model = "unknown";
                horsepower = -1;
            }

            Car car = new Car(brand, model, horsepower);
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println("The car is: " + car.carInfo());
        }
    }
}
