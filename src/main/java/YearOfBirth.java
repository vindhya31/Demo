import java.util.Calendar;
import java.util.Scanner;

public class YearOfBirth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the age:");
        String age = scanner.nextLine();

        YearOfBirth yearCalculator = new YearOfBirth();
        int birthYear = yearCalculator.calculateBirthYear(name, age);
        yearCalculator.greeting(name, birthYear);
    }

    public int calculateBirthYear(String name, String age) {
        int birthYear = 0;

        try {
            int ageNum = Integer.parseInt(age);

            if (ageNum <= 0) {
                System.out.println("Invalid age, provide a positive number");
                return birthYear;
            }

            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            birthYear = currentYear - ageNum;

        } catch (NumberFormatException e) {
            System.out.println("Invalid input for age. Please enter a positive number.");
        }

        return birthYear;
    }

    public void greeting(String name, int birthYear) {
        System.out.println("Hello " + name + "! Your year of birth is: " + birthYear);
    }
}
