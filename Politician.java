public class Politician extends Character {
    protected static String _type;

    public Politician() {
        super();
        _type="Politician";
    	_strength = 250;//strong voices
    	_defense = 20;//anti gun laws means no hypocrisy right?
    	_attack = .5;
    	_name= "swag";
	    
    }
    public void normalize() {
    	_attack*=.66;
    	_defense*=1.33;
    }
    public void specialize() {
    	_attack*=1.5;
    	_defense*=.75;
    	
    }
    
    
    public String about() {
    	String retStr="";
   	retStr+="Welcome to class Politician! Your strong voice and the power you hold means you have the most strength of any character \n Yet, your opposition to guns in this game mean you lack defense. #feelthebern";
    	retStr+="\t Type:" + _type; + "\n\t Strength:" + _strength + "\n\t Attack:" + _attack + "\n\t Defense" + _defense + "\n\t Life:" + _hitPts;
    }
    public Politician(String name) {
        this();
        _name = name;
    }

}
