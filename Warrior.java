public class Warrior extends Character {
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
    protected static String _type;
    // other attribs inherited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Warrior() {
      _hitPts = 125;
      _strength = 100;
      _defense = 40;
      _attack = .5;
      _type= "Warrior";
    }

    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Warrior( String name ) {
        this();
    _name = name;
    }

    public void normalize() {
    	attack = .5;
    	defense = 40;
    }
    
    public void specialize() {
    	attack *= 2;
    	defense *= .5;
    }
    
    public String about() {
    	return "Character: Warrior \n \t HP = 125 \n\t Strength = 100 \n\t Defense = 40 \n\t Attack = .5 \n"
    }

}//end class Warrior
