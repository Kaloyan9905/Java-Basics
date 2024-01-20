import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFoodCount = Integer.parseInt(scanner.nextLine());
        int catFoodCount = Integer.parseInt(scanner.nextLine());

        double dogFoodPrice = 2.5;
        double catFoodPrice = 4.0;
        double totalPrice = (dogFoodCount * dogFoodPrice) + (catFoodCount * catFoodPrice);
        System.out.printf("%f lv.", totalPrice);
    }
}
