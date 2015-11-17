/*
Team Glamazons - Olivia Gallager, Nancy Li, Sean Bourke
APCS1 pd9
HW31 -- Ye Olde Role Playing Game, Unchained
2015-11-17
*/
//og was hur
public class Barista extends Character {
    protected static String _type;
    
    public Barista() {
        super();
        _type="Barista";
    	_strength = 200;//Baristas have mad guns from making lattes
	    _attack = .2;//weaker in battle :(
    }
    
    public void normalize() {
    	_attack*=.5;
    	_defense*=1.25;
    }
    public void specialize() {
    	_attack*=2;
    	_defense*=.8;
    	
    }
    
    public String about() {
    	String retStr="";
    	retStr+= "Welcome to class Barista! the creator of this role playing game happens to appreciate you very much. You got mad gunz \n from making those wonderful holiday lattes.\n";
    	retStr+="\t Type:" + _type + "\n\t Strength:" + _strength + "\n\t Attack:" + _attack + "\n\t Defense" + _defense + "\n\t Life:" + _hitPts+"";
    }
    
    
    
    public Barista(String name) {
        this();
        _name = name;
    }

}
