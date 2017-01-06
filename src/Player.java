import java.util.HashSet;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private Room currentRoom;
    private HashSet<Item> bag;
    
    /**
     * Constructs the objects to the class Player
     * Consructs a new HashSet of type Item called bag
     * 
     * @param sets intial room to the current room
     * 
     */
    public Player(Room initialRoom)
    {
        currentRoom = initialRoom;
        bag = new HashSet<Item>();
    }
    
    /**
     * @returns the current room
     */
    public Room getRoom()
    {
        return currentRoom;
    }
    
    /**
     * Changes the current room
     * 
     * @param the room in which you want to change too.
     */
    public void setRoom(Room chooseRoom)
    {
        currentRoom = chooseRoom;
    }
    
    /**
     * This method is used to print out the description of the current room. 
     */
    public String look()
    {
        return currentRoom.getLongDescription();
    }
    
    /**
     * Player can go a different room within the exists of his current room.
     * 
     * @param the direction in which the room exists
     * @return the current room description.
     */
    public String goRoom(String direction)
    {
        //Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);
        
        if (nextRoom == null) {
            return "There is no door!";
        }
        else {
            currentRoom = nextRoom;
            return currentRoom.getLongDescription();
        }
    }
    
    /**
     * Adds an item to the bag
     * 
     * @param takes the item that is being added to the bag
     */
    public void addToBag(Item item)
    {
        bag.add(item);
    }
    
    /**
     * Removes an item from your bag
     * 
     * @param the item in which you are removing
     * @return if the item found, return it else return null
     */
    public Item removeFromBag(Item item)
    {
        if(bag.contains(item)) {
            bag.remove(item);
            return item;
        }
        else {
            return null;
        }
            
    }
    
    /**
     * Displays the items in the bag.
     * 
     * @return returns all the items in the bag
     */
    public String getInventory()
    {
        String result = "These are the items: ";
        if(bag.isEmpty()) {
            return "You are not carrying anything";
        }
        
        for(Item item : bag) {
            result = result + item.getName() + ": " + item.getDescription() + "\n";
        }
        return result;
    }
    
    /**
     * Search the HashSet Bag for "itemName"
     * 
     * @param search bag for itemName
     * @return return the item if found, else return null
     */
    public Item searchBag(String itemName)
    {
        for(Item item : bag) {
            if(item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }
}
