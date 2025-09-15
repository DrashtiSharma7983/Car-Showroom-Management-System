import java.util.Scanner;
import java.util.UUID;

public class Cars extends Showroom implements Utility{

    String car_name;
    String car_color;
    String car_type;
    int car_price;

    @Override
    public void getDetails() {
        System.out.println("Car name: "+ car_name);
        System.out.println("Car color: "+ car_color);
        System.out.println("Car color: "+ car_type);
        System.out.println("Car price: "+ car_price);
        System.out.println("---------------------------------------");
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================* Enter Car Details *=========================");
        System.out.println("Car Name:");
        car_name = sc.nextLine();
        System.out.println("Enter car color:");
        car_color = sc.nextLine();
        System.out.println("Enter car type:");
        car_type = sc.nextLine();
        System.out.println("Enter car price:");
        car_price = sc.nextInt();
        total_cars++;
    }

}
