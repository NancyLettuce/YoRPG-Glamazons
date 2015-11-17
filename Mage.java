public class Mage extends Character {
    protected static String _type;
    
    //default constructor
    public Mage() {
        super();
        _type="Mage";
        _name="Dumbledor";
    	_strength = 50;
	    _defense = 100;//underdog 
    }
    
    //overloaded constructor
    public Mage(String name) {
        this();
        _name = name;
    }
    
    public void normalize() {
    	attack = .4;
    	defense = 100;
    }
    
    public void specialize() {
    	attack *= 2;
    	defense *= .5;
    }
    
    public String about() {
    	return "Character: Mage \n
    	HP = 125 \n
    	Strength = 50 \n
    	Defense = 100 \n
    	Attack = .4 \n"
    }
    
}
