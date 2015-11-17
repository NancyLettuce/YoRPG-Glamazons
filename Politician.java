public class Politician extends Character {
    protected static String _type;

    public Politician() {
        super();
        _type="Politician";
    	_strength = 400;//strong voices
    	_defense = 20;//anti gun laws means no hypocrisy right?
    	_attack = .5;
    	_name= "swag";
	    
    }
    public Politician(String name) {
        this();
        _name = name;
    }

}
