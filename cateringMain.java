import java.util.*;
public class cateringMain {
    
    static eventPricing events = new eventPricing();
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        while (true){  
            System.out.println("""
            -----------===============[[[ Main Menu ]]]===============-----------
            Welcome to Pipay Catering Services! Here we have our list of services.""");
            System.out.println("Events: ");
            System.out.println("\t[1] Baptism");
            System.out.println("\t[2] Birthday");
            System.out.println("\t[3] Celebration");
            System.out.println("\t[4] Graduation");
            System.out.println("\t[5] Wedding");
            System.out.println("\t[0] Exit ");
            System.out.print("Enter the event you want us to cater: ");
            try{
                choice = input.nextInt();
                System.out.println();
                if (choice == 1){
                    Baptism();
                }
                else if (choice == 2){
                    Birthday();
                }
                else if (choice == 3){
                    Celebration();
                }
                else if (choice == 4){
                    Graduation();
                }
                else if (choice == 5){
                    Wedding();
                }
                else if (choice == 0){
                    System.out.println("-----------===============[[[ EXIT ]]]===============-----------");
                    System.out.println("\nThank you for booking our catering service! See you again soon!\n");
                    System.exit(0);
                }
                else{
                    System.out.println("Choice is not in the menu.\n");
                    main(null);
                }
            }
            catch(Exception e){
                System.out.println("Invalid input!\n");
                main(null);
            }
            input.close();
        }
    } // end of Main()   

    public static void Baptism(){
        String Venue;
        Scanner input = new Scanner(System.in);

        System.out.print("Do you have a venue? (Y/N): ");
        if (input.hasNextLine()){
            Venue = input.nextLine().toUpperCase();

            if (Venue.equals("Y")){
                PackagesWithVenue(1);
            }
            else if (Venue.equals("N")){
                PackagesWithOutVenue(1);
            }
            else{
                System.out.println("Invalid input!\n");
                Baptism();
            }
        }
        else{
            System.out.println("Invalid input!\n");
            Baptism();
        }

        input.close();
    } // end of Baptism

    public static void Birthday(){
        String Venue;
        Scanner input = new Scanner(System.in);

        System.out.print("Do you have a venue? (Y/N): ");
        if (input.hasNextLine()){
            Venue = input.nextLine().toUpperCase();

            if (Venue.equals("Y")){
                PackagesWithVenue(2);
            }
            else if (Venue.equals("N")){
                PackagesWithOutVenue(2);
            }
            else{
                System.out.println("Invalid input!\n");
                Birthday();
            }
        }
        else{
            System.out.println("Invalid input!\n");
            Birthday();
        }

        input.close();
    } // end of Birthday()

    public static void Celebration(){
        String Venue;
        Scanner input = new Scanner(System.in);

        System.out.print("Do you have a venue? (Y/N): ");
        if (input.hasNextLine()){
            Venue = input.nextLine().toUpperCase();

            if (Venue.equals("Y")){
                PackagesWithVenue(3);
            }
            else if (Venue.equals("N")){
                PackagesWithOutVenue(3);
            }
            else{
                System.out.println("Invalid input!\n");
                Celebration();
            }
        }
        else{
            System.out.println("Invalid input!\n");
            Celebration();
        }

        input.close();
    } // end of Celebration()

    public static void Graduation(){
        String Venue;
        Scanner input = new Scanner(System.in);

        System.out.print("Do you have a venue? (Y/N): ");
        if (input.hasNextLine()){
            Venue = input.nextLine().toUpperCase();

            if (Venue.equals("Y")){
                PackagesWithVenue(4);
            }
            else if (Venue.equals("N")){
                PackagesWithOutVenue(4);
            }
            else{
                System.out.println("Invalid input!\n");
                Graduation();
            }
        }
        else{
            System.out.println("Invalid input!\n");
            Graduation();
        }
        
        input.close();
    } // end of Graduation()
    
    public static void Wedding(){
        String Venue;
        Scanner input = new Scanner(System.in);

        System.out.print("Do you have a venue? (Y/N): ");
        if (input.hasNextLine()){
            Venue = input.nextLine().toUpperCase();

            if (Venue.equals("Y")){
                PackagesWithVenue(5);
            }
            else if (Venue.equals("N")){
                PackagesWithOutVenue(5);
            }
            else{
                System.out.println("Invalid input!\n");
                Wedding();
            }
        }
        else{
            System.out.println("Invalid input!\n");
            Wedding();
        }

        input.close();
    } // end of Wedding()
    
    public static void PackagesWithVenue(int eventNum){
        int choice;
        int event = eventNum;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("""
            -----------===============[[[ Packages Menu ]]]===============-----------
            Here we have our list of packages.""");
        System.out.println("Packages with Venue: ");
        System.out.println("\t[1] 3 Meals, 1 Appertizer, 1 Dessert, 1 Beverage -> P 320 per person (Min 50 pax) Additional of P 320 per person if more than 50 pax.");
        System.out.println("\t[2] 2 Meals, 1 Appertizer, 1 Dessert, 1 Beverage -> P 280 per person (Min 50 pax) Additional of P 280 per person if more than 50 pax.");
        System.out.println("\t[3] 1 Meal, 1 Appertizer, 1 Dessert, 1 Beverage -> P 250 per person (Min 50 pax) Additional of P 250 per person if more than 50 pax.");
        System.out.println("\t[0] Return to choosing of event");
        System.out.print("Enter choice: ");

        if (input.hasNextInt()){
            choice = input.nextInt();
        
            if (choice == 1) {
                paxInput(event, 320);
            }
        
            else if (choice == 2) {
                paxInput(event, 280);
            }
    
            else if (choice == 3) {
                paxInput(event, 250);
            }
            
            else if (choice == 0){
                System.out.println();
                main(null);
            }
    
            else {
                System.out.println("Invalid input!\n");
                PackagesWithVenue(eventNum);
            }
        }
        else{
            System.out.println("Invalid input!\n");
            PackagesWithVenue(eventNum);
        }

        input.close();
    } // end of Packages w/ Venue   

    public static void PackagesWithOutVenue(int eventNum){
        int choice;
        int event = eventNum;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("""
            -----------===============[[[ Packages Menu ]]]===============-----------
            Here we have our list of packages.""");
        System.out.println("Packages without Venue: ");
        System.out.println("\t[1] 3 Meals, 1 Appetizer, 1 dessert, 1 Beverage -> P 250 per person (Min 50 pax) Additional of P250 per person if more than 50 pax.");
        System.out.println("\t[2] 2 Meals, 1 Appertizer, 1 Dessert, 1 Beverage -> P 210 per person (Min 50 pax) Additional of P 210 per person if more than 50 pax.");
        System.out.println("\t[3] 1 Meal, 1 Appertizer, 1 Dessert, 1 Beverage -> P 180 per person (Min 50 pax) Additional of P 180 per person if more than 50 pax.");
        System.out.println("\t[0] Return to choosing of event");
        System.out.print("Enter choice: ");
        
        if (input.hasNextInt()){
            choice = input.nextInt();
            if (choice == 1) {
                paxInput(event, 250);
            }
            else if (choice == 2) {
                paxInput(event, 210);
            }

            else if (choice == 3) {
                paxInput(event, 180);
            }
            else if (choice == 0){
                System.out.println();
                main(null);
            }
            else {
                System.out.println("Invalid input!\n");
                PackagesWithOutVenue(eventNum);
            }
        }
        else{
            System.out.println("Invalid input!\n");
            PackagesWithOutVenue(eventNum);
        }
        input.close();
    }
    // end of Packages w/o Venue  
    
    public static void paxInput(int event, int rate){
        int PAX;
        Scanner input = new Scanner(System.in);

        System.out.print("How many persons are going to the event? ");
        if (input.hasNextInt()){
            PAX = input.nextInt();
            events.setValues(PAX, rate);
            events.setEvent(event);
        }
        else{
            System.out.println("Invalid input!\n");
            paxInput(event, rate);
        }

        System.out.printf("\nThe total price for the catering of your event is P%,.2f", (events.getEventTotalPrice() - (events.getEventTotalPrice() * events.getDiscount())));
        System.out.println();
        repeatMenu();
        input.close();
    } // PAXINPUT

    public static void repeatMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n-----------===============[[[ End of Inquiry ]]]===============-----------\n");
        System.out.print("Do you want to return to the main menu? (Y/N): ");
        
        if (input.hasNextLine()){
            String repeat = input.nextLine().toUpperCase();
            if (repeat.equals("Y")){
                main(null);
            }
            else if (repeat.equals("N")){
                System.out.println("Thank you for booking our catering service!");
                System.exit(0);
            }
            else{
                System.out.println("Invalid input! Please input again.\n");
                repeatMenu();
            }
        }
        else{
            System.out.println("Invalid input! Please input again.\n");
                repeatMenu();
        }
        input.close();
    } //REPEATMENU
}// end of class