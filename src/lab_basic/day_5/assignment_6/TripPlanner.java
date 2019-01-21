package lab_basic.day_5.assignment_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TripPlanner {
    static Scanner scanner = new Scanner(System.in);
    static Ticket ticket = new Ticket();
    public static void main(String[] args) throws ParseException {
        TripPlanner tripPlanner = new TripPlanner();
        int option;
        char quit;
        System.out.println("Welcome to D-Rail Inc");
        do {
            System.out.println("Choose from the below Services : ");
            System.out.println("Enter '1' to Purchase a Ticket");
            System.out.println("      '2' to Use Your Ticket");
            System.out.println("      '3' to View/Print Ticket");
            option = scanner.nextInt();
            switch (option)
            {
                case 1 :
                    tripPlanner.newTicket();
                    break;
                case 2 :
                    ticket.useTicket();
                    break;
                case 3 :
                    ticket.printTicket();
                    break;
                default: System.out.println("Choose only from these options : '1' or '2' or '3'");
            }
            System.out.println("Do you want to continue? 'Y' or 'N'");
            quit = scanner.next().toLowerCase().charAt(0);
        }while (quit=='y');
    }
    public void newTicket() throws ParseException {
        int type;
        String origin;
        String destination;
        String date;
        int number;
        System.out.println("Enter Origin : ");
        origin = scanner.next();
        ticket.setSource(origin);
        System.out.println("");
        System.out.println("Enter Destination : ");
        destination = scanner.next();
        ticket.setDestination(destination);
        System.out.println("");
        System.out.println("Enter Date in this Format : DD/MM/YYYY");
        date = scanner.next();
        ticket.setIssueDate(date);
        System.out.println("");
        System.out.println("Choose the Ticket type : ");
        System.out.println("Enter '1' for One Way Ticket");
        System.out.println("      '2' for Round Trip Ticket");
        System.out.println("      '3' for Multi Travel Ticket");
        type = scanner.nextInt();
        switch (type)
        {
            case 1 :
                ticket.setTicketType(Ticket.TicketType.OneWay);
                break;
            case 2 :
                ticket.setTicketType(Ticket.TicketType.RoundTrip);
                break;
            case 3 :
                ticket.setTicketType(Ticket.TicketType.MultiUse);
                System.out.println("Multi Use Ticket comes in 3 Variations : \n Enter : ");
                System.out.print("10 for 10 Trips");
                System.out.println("15 for 15 Trips");
                System.out.println("20 for 20 Trips");
                number = scanner.nextInt();
                ticket.setNumberOfTrips(number);
                break;
            default: System.out.println("Choose only from these options : '1' or '2' or '3'");
        }
        ticket.generateTicket();
    }
}
