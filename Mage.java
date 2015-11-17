public class Mage extends Character {
    protected static String _type;
    
    public Mage() {
        super();
        _type="Mage";
        _name="Dumbledor";
    	_strength = 50;
	    _defense = 100;//underdog 
    }
    public Mage(String name) {
        this();
        _name = name;
    }

}
