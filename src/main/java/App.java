import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Book My Ride");
        ArrayList<Menu> menuArrayList = new ArrayList<>();
        menuArrayList.add(new Menu(1, "Chennai"));
        menuArrayList.add(new Menu(2, "Tiruvallur"));
        menuArrayList.add(new Menu(3, "Kanchipuram"));
        menuArrayList.add(new Menu(4, "Cheglpattu"));
        menuArrayList.forEach(id -> {
            System.out.println(id.getId() + " . " + id.getPlaces());
        });

        System.out.println("99. back");

        System.out.println("Select the Place");
        int choose = scanner.nextInt();
        Menu chooseMenu = menuArrayList.get(choose - 1);
        String menu = chooseMenu.getPlaces();
        System.out.println(menu);


        System.out.println("Car Details");
        ArrayList<Details> detailsArrayList = new ArrayList<>();
        detailsArrayList.add(new Details(1, "Hyundai", "Altis", "SJC2456", 500));
        detailsArrayList.add(new Details(2, "Toyota", "Vellfire", "SJGH458", 500));
        detailsArrayList.add(new Details(3, "Mahindra", "Altis", "TN2256", 500));
        detailsArrayList.add(new Details(4, "Tata Motors", "Altis", "TNC2456", 500));
        detailsArrayList.add(new Details(5, "Maruti Suzuki", "Altis", "TN2778D", 500));
        detailsArrayList.forEach(details -> {
            System.out.println(details.getId() + "." + details.getName());
        });

        System.out.println("Select the Car");
        int car = scanner.nextInt();
        Details carDetails = detailsArrayList.get(car - 1);
        String Details = carDetails.getName() + "," + carDetails.getModel() + "," + carDetails.getNo() + "," + carDetails.getCost();
        System.out.println(Details);


        System.out.println("Enter your details");
        ArrayList<Customer> userArrayList = new ArrayList<>();
        userArrayList.add(new Customer());
        System.out.println("Book the car(1.yes or 2.no):");
        int book = scanner.nextInt();
        if (book == 1) {

            System.out.println("Name :");
            String name = scanner.next();

            System.out.println("Phone no :");
            long phone = scanner.nextLong();

            System.out.println("Payment :");
            int pay = scanner.nextInt();

            System.out.println("Book Successfully");
            System.out.println("Receipt");
            System.out.println("\n" + name + "\n" + phone + "\n" + pay + "\n" + "Conform");
        } else {
            System.out.println("error");
        }
    }
}
