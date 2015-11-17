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
      _attack = .6;
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
    	_attack = .6;
    	_defense = 40;
    }
    
    public void specialize() {
    	_attack *= 2;
    	_defense *= .5;
    }
    
    public String about() {
        String retStr="";
        retStr+= "Welcome to class Warrior. Warriors have exceptional strength and attack rating, but due their egos have undertaken little defensive measures.";
        retStr+="\t Type:" + _type + "\n\t Strength:" + _strength + "\n\t Attack:" + _attack + "\n\t Defense" + _defense + "\n\t Life:" + _hitPts;
    	return retStr;
    }

}//end class Warrior
