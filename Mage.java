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
    	_attack = .4;
    	_defense = 100;
    }
    
    public void specialize() {
    	_attack *= 2;
    	_defense *= .5;
    }
    
    public String about() {
    	String retStr = "";
    	retStr += "Welcome to class Mage. You have above average defenses and attack rating, but are woefully lacking in the strength department"\n;
    	retStr+="\t Type: " + _type + "\n\t Strength: " + _strength + "\n\t Attack: " + _attack + "\n\t Defense: " + _defense + "\n\t Life: " + _hitPts+"";
    	return retStr;
    }
    
}
