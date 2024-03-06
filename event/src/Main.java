import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) throws ParseException {  
        Scanner scanner = new Scanner(System.in);  
        event event = new event();  
  
        System.out.print("Enter the event ID: ");  
        event.setEventVenue(scanner.nextLine());  
  
        System.out.print("Enter the event name: ");  
        event.setEventName(scanner.nextLine());  
  
        System.out.print("Enter the event venue: ");  
        event.setEventVenue(scanner.nextLine());  
  
        System.out.print("Enter the event date (yyyy-MM-dd): ");  
        String dateString = scanner.nextLine();  
        event.setEventID(new SimpleDateFormat("yyyy-MM-dd").parse(dateString));  
  
        System.out.println("Enter the names of the attendees (enter 'done' to finish):");  
        while (true) {  
            String name = scanner.nextLine();  
            if (name.equalsIgnoreCase("done")) {  
                break;  
            }  
            event.addEventAttendee(name);  
        }  
  
        System.out.println("Event Details:");  
        System.out.println("Event ID: " + event.getEventID());  
        System.out.println("Event Name: " + event.getEventName());  
        System.out.println("Event Venue: " + event.getEventVenue());  
        System.out.println("Event Date: " + (event.getEventDate()));  
        System.out.println("Total Attendees: " + event.getTotalAttendees());  
  
        System.out.println("Attendees:");  
        for (String attendee : event.getEventAttendees()) {  
            System.out.println(attendee);  
        }  
  
        scanner.close();  
    }  
}  