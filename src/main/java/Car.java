import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book My Ride");
        ArrayList<Menu> menuArrayList = new ArrayList<>();
        menuArrayList.add(new Menu(1,"Chennai"));
        menuArrayList.add(new Menu(2,"Tiruvallur"));
        menuArrayList.add(new Menu(3,"Kanchipuram"));
        menuArrayList.add(new Menu(4,"Cheglpattu"));
        menuArrayList.forEach(id -> {
            System.out.println(id.getId() + " . " + id.getPlaces());
        });
        System.out.println("Select the Place");
        int choose = scanner.nextInt();
        Menu chooseMenu = menuArrayList.get(choose - 1);
        String menu = chooseMenu.getPlaces();
        System.out.println(menu);


        System.out.println("Car Details");
        ArrayList<Details> detailsArrayList = new ArrayList<>();
        detailsArrayList.add(new Details("Hyundai","Altis","SJC2456",500));
        detailsArrayList.add(new Details("Toyota","Vellfire","SJGH458",500));
        detailsArrayList.add(new Details("Mahindra","Altis","TN2256",500));
        detailsArrayList.add(new Details("Tata Motors","Altis","TNC2456",500));
        detailsArrayList.add(new Details("Maruti Suzuki","Altis","TN2778D",500));
        detailsArrayList.forEach(details -> {
            System.out.println(details.getName() + "\n" + details.getModel() + "\n" + details.getNo() + "\n" + details.getCost());
        });

        System.out.println("Select the Car");
        int car = scanner.nextInt();
        Details carDetails = detailsArrayList.get(car - 1);
        String Details = carDetails.getName();
        System.out.println(Details);


        System.out.println("Book a Car (yes or no)");
        String book = scanner.nextLine();
        System.out.println("Enter your details" + "\n" + "Name :");
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User());
        String name = scanner.nextLine();
        System.out.println("Phone no :");
        long phone = scanner.nextLong();
        System.out.println("Payment :");
        int pay = scanner.nextInt();
        System.out.println("Book Successfully");
        System.out.println("Receipt");
        System.out.println(name + "\n" + phone + "\n" + pay + "\n" + "Conform");
    }

}
