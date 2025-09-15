import java.util.Scanner;

public class Showroom implements Utility{

    String showroom_name;
    String showroom_address;
    int total_employes;
    int total_cars;
    String manager_name;


    @Override
    public void getDetails() {
        System.out.println("Showroom Name: "+ showroom_name);
        System.out.println("Showroom Address: "+ showroom_address);
        System.out.println("Total Employees: "+ total_employes);
        System.out.println("Total Cars: "+ total_cars);
        System.out.println("Manager Name: "+ manager_name);
        System.out.println("---------------------------------------");
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================== Enter Below Details ===================");
        System.out.println("Enter showroom name:");
        showroom_name = sc.nextLine();
        System.out.println("Enter showroom address:");
        showroom_address = sc.nextLine();
        System.out.println("Enter total employees:");
        total_employes = sc.nextInt();
//        sc.nextLine();
        System.out.println("Enter total cars:");
        total_cars = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter showroom manager name:");
        manager_name = sc.nextLine();

    }
}
