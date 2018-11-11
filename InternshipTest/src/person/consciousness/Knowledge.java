package person.consciousness;


public class Knowledge {

    private int level;

    public int getLevel(){                       // a simple getter for 'level' variable
        return this.level;
    }

    public Knowledge(int level) {
        if (0 <= level && level <= 100 )
        {                                        // check if entered level is in the margin
            this.level = level;
        }
        else System.out.println("Knowledge level out of bounds");
    }
}
