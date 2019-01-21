package lab_basic.day_5.assignment_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Ticket {
    String source;
    String destination;
    Date issueDate,expiryDate;
    int numberOfTrips;
    enum TicketType{OneWay,RoundTrip,MultiUse};
    private String typeOfTicket;
    TicketType ticketType;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
    public void setSource(String source)
    {
        this.source = source;
    }
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    public void setIssueDate(String issueDate) throws ParseException {
        this.issueDate = simpleDateFormat.parse(issueDate);
    }
    public void setNumberOfTrips(int numberOfTrips)
    {
        this.numberOfTrips = numberOfTrips;
    }
    public void setTicketType(TicketType ticketType)
    {
        this.ticketType = ticketType;
    }
    public void generateTicket()
    {
        switch (ticketType)
        {
            case OneWay:
                expiryDate = issueDate;                         // Expiry date is same day
                setNumberOfTrips(1);
                typeOfTicket = "One Way Ticket";
                break;
            case RoundTrip:
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(issueDate);
                calendar.add(Calendar.DATE,7);          // Expiry date is 1 Week
                expiryDate = calendar.getTime();
                setNumberOfTrips(2);
                typeOfTicket = "Round Trip Ticket";
                break;
            case MultiUse:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(issueDate);
                calendar2.add(Calendar.MONTH,2);
                expiryDate = calendar2.getTime();
                typeOfTicket = "Multi Travel Ticket";
                break;
        }
    }
    public void printTicket()
    {
        System.out.println("Ticket Type : "+typeOfTicket);
        System.out.println("Ticket No: "+ (1000000+(new Random().nextInt(999999))));
        System.out.println("Origin: "+source+"\tDestination: "+destination);
        System.out.println("Valid from "+issueDate+" - "+expiryDate);
        System.out.println("Number of trips: "+numberOfTrips);
    }
    public void useTicket()
    {
        if (numberOfTrips==0)
        {
            System.out.println("All the Trips in your old ticket are used");
            System.out.println("Get a new Ticket....");
        }
        else
        {
            numberOfTrips--;
            System.out.println("Thanks for Travelling with D-Rail ");
            System.out.println("Trips remaining in your current ticket : "+numberOfTrips);
        }
    }

}
