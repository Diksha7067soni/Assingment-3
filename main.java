import java.util.Scanner;
import java.util.Random;

public class UniqueUserID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your name or username: ");
        String name = scanner.nextLine();

        int randomNumber = 1000 + random.nextInt(9000);

        String uniqueID = name + randomNumber;

        System.out.println("Your unique user ID is: " + uniqueID);

        scanner.close();
    }
}
