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
    public void specialize(){
	_attack += .5;
	_defense -=20;
    }
    public void normalize(){
	_attack = .4;
	_defense = 60;
    }
    public String about(){
	String retStr="";
	retStr+="Welcome to Rogue. You are quick, sneaky and pretty good in a fight \n";
		retStr+="\t Type: " + _type + "\n\t Strength: " + _strength + "\n\t Attack: " + _attack + "\n\t Defense: " + _defense + "\n\t Life: " + _hitPts+"";
	return retStr;
    }

}
