import java.util.Scanner;

public class CinemaBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("               *********               *********                               ");
        System.out.println("           *****************       *****************                          ");
        System.out.println("        ********* **********      ********* *********                       ");
        System.out.println("       *******             *******              *******                     ");
        System.out.println("      *****                 *****                  *****                    ");
        System.out.println("     *****                   *****                   ****                    ");
        System.out.println("     ****                    ****                    ****                    ");
        System.out.println("     *****                  *****                   ****                    ");
        System.out.println("      *****                 ******                 ****                     ");
        System.out.println("       ****               *********           *********                      ");
        System.out.println("   ***********************************************************                 ");
        System.out.println(" ****************************************************************               ");
        System.out.println("******************************************************* *****              ");
        System.out.println("*************************************************************          **** ");
        System.out.println("*************************************************************  ************");
        System.out.println("************************************************************* *************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("************************************************************* *************");
        System.out.println("************************************************************* *************");
        System.out.println("*************************************************************  ************");
        System.out.println("*************************************************************              ");
        System.out.println("*************************************************************");
        System.out.println("*************************************************************");

        System.out.println("============================================================================");
        System.out.println();
        System.out.println();
        System.out.println("  ____ _____ ____         ____ ___ _   _ _____ __  __    _    ");
        System.out.println(" |  _ \\_   _/ ___|       / ___|_ _| \\ | | ____|  \\/  |  / \\   ");
        System.out.println(" | |_) || | \\___ \\      | |    | ||  \\| |  _| | |\\/| | / _ \\  ");
        System.out.println(" |  _ < | |  ___) | |     |___ | || |\\  | |___| |  | |/ ___ \\ ");
        System.out.println(" |_| \\_\\|_| |____/       \\____|___|_| \\_|_____|_|  |_/_/   \\_\\");
        System.out.println();
        System.out.println();
        System.out.println("============================================================================");
        System.out.print("Enter Date: ");
        String date = scanner.nextLine();

        System.out.print("Enter Location: ");
        String location = scanner.nextLine();

        System.out.println("     ___   ____    ____  ___       __   __          ___      .______    __       _______     _______  __   __      .___  ___.      _______.");
        System.out.println("    /   \\  \\   \\  /   / /   \\     |  | |  |        /   \\     |   _  \\  |  |     |   ____|   |   ____||  | |  |     |   \\/   |     /       |");
        System.out.println("   /  ^  \\  \\   \\/   / /  ^  \\    |  | |  |       /  ^  \\    |  |_)  | |  |     |  |__      |  |__   |  | |  |     |  \\  /  |    |   (----`");
        System.out.println("  /  /_\\  \\  \\      / /  /_\\  \\   |  | |  |      /  /_\\  \\   |   _  <  |  |     |   __|     |   __|  |  | |  |     |  |\\/|  |     \\   \\    ");
        System.out.println(" /  _____  \\  \\    / /  _____  \\  |  | |  `----./  _____  \\  |  |_)  | |  `----.|  |____    |  |     |  | |  `----.|  |  |  | .----)   |   ");
        System.out.println("/__/     \\__\\  \\__/ /__/     \\__\\ |__| |_______/__/     \\__\\ |______/  |_______||_______|   |__|     |__| |_______||__|  |__| |_______/    ");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();

        System.out.print("\t\t\t\t\t\t\t\t1) Movie 1 - Hall 1");
        System.out.println("\t\t\t\t\t\t\t2) Movie 2 - Hall 2");
        System.out.print("\t\t\t\t\t\t\t\t3) Movie 3 - Hall 3");
        System.out.println("\t\t\t\t\t\t\t4) Movie 4 - Hall 4");
        System.out.print("Enter Movie Number: ");
        int movieNumber = scanner.nextInt();

        System.out.println(".___________. __  .___  ___.  _______ ");
        System.out.println("|           ||  | |   \\/   | |   ____|");
        System.out.println("`---|  |----`|  | |  \\  /  | |  |__   ");
        System.out.println("    |  |     |  | |  |\\/|  | |   __|  ");
        System.out.println("    |  |     |  | |  |  |  | |  |____ ");
        System.out.println("    |__|     |__| |__|  |__| |_______|");
        System.out.println("===========================================");


        System.out.println("\t\t\t\t1) 9.00 A.M");
        System.out.println("\t\t\t\t2) 2.00 P.M");
        System.out.println("\t\t\t\t3) 7.00 P.M");
        System.out.print("Enter Time: ");
        int timeSelection = scanner.nextInt();

        scanner.nextLine();

        System.out.println("  ______  __    __       _______.___________.  ______   .___  ___.  _______ .______      ");
        System.out.println(" /      ||  |  |  |     /       |           | /  __  \\  |   \\/   | |   ____||   _  \\     ");
        System.out.println("|  ,----'|  |  |  |    |   (----`---|  |----`|  |  |  | |  \\  /  | |  |__   |  |_)  |    ");
        System.out.println("|  |     |  |  |  |     \\   \\       |  |     |  |  |  | |  |\\/|  | |   __|  |      /     ");
        System.out.println("|  `----.|  `--'  | .----)   |      |  |     |  `--'  | |  |  |  | |  |____ |  |\\  \\----.");
        System.out.println(" \\______| \\______/  |_______/       |__|      \\______/  |__|  |__| |_______|| _| `._____|");
        System.out.println("===================================================================================================");


        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Child OR Parent: ");
        String type = scanner.nextLine();

        System.out.print("Number of Tickets: ");
        int numberOfTickets = scanner.nextInt();

        double pricePerTicket = 90;
        double taxRate = 0.80;
        double totalAmount = numberOfTickets * pricePerTicket;
        double taxAmount = totalAmount * taxRate;
        double finalAmount = totalAmount + taxAmount;

        System.out.println("\t\t\t\t\t\t+====================================================================================+");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t||\t\t\t\t ____ _____ ____         ____ ___ _   _ _____ __  __    _            ||");
        System.out.println("\t\t\t\t\t\t||\t\t\t\t|  _ \\_   _/ ___|       / ___|_ _| \\ | | ____|  \\/  |  / \\           ||   ");
        System.out.println("\t\t\t\t\t\t||\t\t\t\t| |_) || | \\___ \\      | |    | ||  \\| |  _| | |\\/| | / _ \\          || ");
        System.out.println("\t\t\t\t\t\t||\t\t\t\t|_| \\_\\|_| |____/       \\____|___|_| \\_|_____|_|  |_/_/   \\_\\        ||");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t||   "+"Date:" + date+"\t\t\t\t\t\t                     Location:" + location+"   ||");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t||-----------------------------------------------------------------------------------||");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t||   "+"Name\t\t\t: " + name+"                                                          ||");
        System.out.println("\t\t\t\t\t\t||   "+"Phone Number\t: " + phoneNumber+"                                                     ||");
        System.out.println("\t\t\t\t\t\t||   "+"Tickets\t\t: " + numberOfTickets+"                                                              ||");
        System.out.println("\t\t\t\t\t\t||   "+"Type\t\t\t: " + type+"                                                         ||");
        System.out.println("\t\t\t\t\t\t||   "+"Time\t\t\t: " + (timeSelection == 1 ? "9.00 A.M" : timeSelection == 2 ? "2.00 P.M" : "7.00 P.M")+"                                                       ||");
        System.out.println("\t\t\t\t\t\t||   "+"Hall\t\t\t: " + movieNumber+" Hall"+"                                                         ||");
        System.out.println("\t\t\t\t\t\t||   "+"Tax\t\t\t: " + taxAmount+"                                                          ||");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t||   "+"\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Total: Rs." + finalAmount+"              ||");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t||                                                                                   ||");
        System.out.println("\t\t\t\t\t\t+=====================================================================================+");

    }
}

