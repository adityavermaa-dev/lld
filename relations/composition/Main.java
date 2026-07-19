package relations.composition; 
import java.util.*; 

class Room { 
    public String type; 
    public Room(String type) { 
        this.type = type; 
    } 
} 

class House { 
    public String name; 
    public List<Room> rooms; 
    public House(String name) { 
        this.name = name; 
        this.rooms = new ArrayList<>(); 
        rooms.add(new Room("Bedroom")); 
        rooms.add(new Room("Dining room")); 
    } 
} 

public class Main { 
    public static void main(String[] args) { 
        House h = new House("Mannat"); 
        
        // MOVED INSIDE THE MAIN METHOD:
        for (Room s : h.rooms) { 
            System.out.println(s.type); 
        } 
        h = null;
        for (Room s : h.rooms) { 
            System.out.println(s.type); 
        } 
    }
} 
