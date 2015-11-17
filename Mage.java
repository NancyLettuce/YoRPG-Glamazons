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
    	return "Character: Mage \n\t HP = 125 \n\t Strength = 50 \n\t Defense = 100 \n\t Attack = .4 \n"
    }
    
}
