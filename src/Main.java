import java.util.Scanner;

interface Utility{
    void getDetails();
    void setDetails();
}

class Menu{
    public static void main_menu(){
        System.out.println("---------------------------------");
        System.out.println("....Welcome to the Car Showroom Management System.....");
        System.out.println("1. Add Showroom");
        System.out.println("2. Add Employees");
        System.out.println("3. Add Cars");
        System.out.println("4. Get Showroom");
        System.out.println("5. Get Employees");
        System.out.println("6. Get Cars");
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employees[] = new Employees[5];
        Cars cars[] = new Cars[5];
        int showroom_counter = 0;
        int employee_counter = 0;
        int car_counter = 0;

        int choice = 50;
        while (choice!=0){
            Menu.main_menu();
            System.out.println("-----------------------------------------------");
            System.out.println("Enter choice");
            choice = scan.nextInt();

            while (choice!=10 && choice!=0){
                switch (choice){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].setDetails();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1.Add showroom");
                        System.out.println("10.Go Back to main menu");
                        System.out.println("choose any one");
                        choice = scan.nextInt();
                        break;
                    case 2:
                        employees[employee_counter] = new Employees();
                        employees[employee_counter].setDetails();
                        employee_counter++;
                        System.out.println();
                        System.out.println("2.Add new employee");
                        System.out.println("10.Go Back to main menu");
                        System.out.println("choose any one");
                        choice = scan.nextInt();
                        break;
                    case 3:
                        cars[car_counter] = new Cars();
                        cars[car_counter].setDetails();
                        car_counter++;
                        System.out.println();
                        System.out.println("3.Add car");
                        System.out.println("10.Go Back to main menu");
                        System.out.println("choose any one");
                        choice = scan.nextInt();
                        break;
                    case 4:
                        for(int i=0; i<showroom_counter;i++){
                            showroom[i].getDetails();
                        }
                        System.out.println();
                        System.out.println("0.Exit");
                        System.out.println("10.Go Back to main menu");
                        System.out.println("choose any one");
                        choice = scan.nextInt();
                        break;
                    case 5:
                        for(int i=0; i<employee_counter;i++){
                            employees[i].getDetails();
                        }
                        System.out.println();
                        System.out.println("0.Exit");
                        System.out.println("10.Go Back to main menu");
                        System.out.println("choose any one");
                        choice = scan.nextInt();
                        break;

                    case 6:
                        for(int i=0; i<car_counter;i++){
                            cars[i].getDetails();
                        }
                        System.out.println();
                        System.out.println("0.Exit");
                        System.out.println("10.Go Back to main menu");
                        System.out.println("choose any one");
                        choice = scan.nextInt();
                        break;

                    default:
                        System.out.println("Please enter valid choice");
                        break;
                }
            }

        }



    }
}