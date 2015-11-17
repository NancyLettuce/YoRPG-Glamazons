public class Rogue extends Character {
	protected static String _type;
    
    public Rogue() {
        super();
        _type="Rogue";
	    _defense = 60;//when you go Rogue you better be prepared
    }
    public Rogue(String name) {
        this();
        _name = name;
    }

}
