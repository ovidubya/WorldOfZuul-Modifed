import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game
 * 
 * Professor extends the player class and wanders rooms with the player randomly
 * 
 * @author Ovadia Shalom
 * @version 3.0 (final version)
 */
public class Professor extends Player
{
    // instance variables - replace the example below with your own
    private int x;
    private Random rand;
    private String pointingDirection;
    /**
     * Constructor for objects of class Professor
     */
    public Professor(Room initialRoom)
    {
        super(initialRoom);
        rand = new Random();
    }
    
    /**
     * gives you a number from 1-6 inclusive
     * @return Returns a number between 1 and 6.
     */
    public int throwDice()
    {
        int x = rand.nextInt(6) + 1;
        return x;
    }
    
    /**
     * When it hits number 6, the professor changes room IF there is a possible exit
     */
    public void act()
    {
        int y = throwDice();
        if(y == 6) {
            Room room = getRoom(); //from here
            ArrayList<String> rooms = room.getExitList();
            int exit = rooms.size(); 
            if(exit != 0) {
                int exits = rand.nextInt(exit);
                String newRoom = getRoom().getExitList().get(exits);
                room = getRoom().getExit(newRoom);
                setRoom(room);
                point();
            }
        }
    }
    
    /**
     * An array of directions for which the professor can point too
     * @return Return a random direction where the professor will point too.
     */
    private String point()
    {
        String[] directions = { "north", "south", "east", "west"};
        pointingDirection = directions[rand.nextInt(4)];
        return pointingDirection;
    }
    
    /**
     * tells you where the professor is and which exit he is pointing too
     * @returns Return the professor's room and which direction he is pointing too.
     */
    public String toString()
    {
        String direction = "There is a professor here. The professor is pointing " + point();
        return direction;
    }
}
