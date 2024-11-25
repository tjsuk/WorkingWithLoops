import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("This is number " + i);
//        }  // Time complexity is ON (Singled nested loop ON^2)

/*
        boolean student = true;
        boolean studentIsLate = false;
        boolean studentOnTime = true;
        while (studentOnTime) {
            System.out.println("Trevor is happy!");
            System.out.println("Is student late (true/false)?: ");
            Scanner scanner = new Scanner(System.in);
            studentIsLate = scanner.nextBoolean();
            if (studentIsLate) {
                studentIsLate = false;
            } else
                studentIsLate = true;
            if (studentIsLate)
                studentOnTime = false;
        }

        while(true) {
        }

 */
        /* Scanner reader = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println("""
        Main Menu
        1. Create user
        2. View user
        3. Edit user
        4. Delete user
        9. Exit program
        """);
            try {
                choice = reader.nextInt();
            }
            catch (Exception e) {
                reader.nextLine();
                choice = -1;
                System.out.println(choice);
            }
        } while (!(choice <= 4 && choice >= 1 || choice == 9));
        //if they enter any integer not listed it should loop again
        //use multiple conditions using OR (||), AND (&&) and NOT (!) [Logical operators]
        //use arithmetic operators (+ - / * < > <= >=)


         */
        //I need a condition where a user must enter a username when accessing a login script.

        // Login Menu
        // Enter username:
        // Enter password:
        Scanner reader = new Scanner(System.in);
        String username = "";
        String pwd = "";
        do {
            System.out.print("Enter your username: ");
            username = reader.nextLine();
        } while (username != null && username.isEmpty());
        System.out.print("Enter your password: ");
        pwd = reader.nextLine();


        }
    }
}
