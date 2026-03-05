import java.util.Scanner;

public class SupportResources {

    public static void showResources(Scanner scanner) {
        while (true) {
            System.out.println("\n============= Support Resources ==============");
            System.out.println("1. Suicide Hotline/Emergency Support");
            System.out.println("2. College Resources");
            System.out.println("3. Outside Links/Resources");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            System.out.println("\n==============================================");

            int choice = scanner.nextInt();
            scanner.nextLine(); // flush newline

            switch (choice) {
                case 1:
                    printSuicideResources();
                    pause(scanner);
                    break;
                case 2:
                    printCollegeResources();
                    pause(scanner);
                    break;
                case 3:
                    printOutsideResources();
                    pause(scanner);
                    break;
                case 4:
                    return; // back to main menu
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void printSuicideResources() {
    	 System.out.println("Suicide Support Resources");
        System.out.println("Call or text 988 if you are experiencing thoughts of suicide, have substance use");
        System.out.println("concerns, are experiencing relationship problems, job loss or financial distress.");
        System.out.println("In the case of emergency: Call 911");
    }

    private static void printCollegeResources() {
        System.out.println("Campus and Local Support Resources");
        System.out.println("Contact EvCC Counseling Support at Counseling@everettcc.edu");
        System.out.println("You can also contact by phone at (425) 388-9263");
        System.out.println("Consider joining clubs at EvCC, to expand your support network!");
        System.out.println("A list of these organizations can be found at https://www.everettcc.edu/campus-life/clubs-and-organizations/");
    }

    private static void printOutsideResources() {
        System.out.println("Outside Resources");
        System.out.println("You can view an event calander for Everett at https://www.liveineverett.com/eventshttps://www.liveineverett.com/events");
        System.out.println("These events can be especially helpful in building your support network outside of your life as a student.");
        System.out.println("For cultural events visit https://www.eventbrite.com/d/wa--everett/cultural-events/?msockid=02f03ce83a4f60533cff28ea3b6261b7");
    }

    private static void pause(Scanner scanner) {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }
}
