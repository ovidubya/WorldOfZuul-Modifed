
/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.
 * 
 * Item class is a new concept to the game zuul. This allow the user to pick up item(s)
 * with a name, description, and weight provided. 
 * 
 * @author Ovadia Shalom
 * @version 1.0
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;
    private double weight;
    
    /**
     * Constructor for objects of class Item
     * 
     * @param itemName sets the name for the item.
     * @param itemDescription sets the description for the item.
     * @param itemWeight sets the weight for the item.
     */
    public Item(String itemName, String itemDescription, double itemWeight)
    {
        name = itemName;
        description = itemDescription;
        weight = itemWeight;
    }
    
    /**
     * @return returns the name field.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return the description field.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * @return the weight field.
     */
    public double getWeight()
    {
        return weight;
    }
}
