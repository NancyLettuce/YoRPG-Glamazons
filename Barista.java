/*
Team Glamazons - Olivia Gallager, Nancy Li, Sean Bourke
APCS1 pd9
HW31 -- Ye Olde Role Playing Game, Unchained
2015-11-17
*/

public class Barista extends Character {
    protected static String _type;
    
    public Barista() {
        super();
        _type="Barista";
    	_strength = 200;//Baristas have mad guns from making lattes
	    _attack = .2;//weaker
    }
    public Barista(String name) {
        this();
        _name = name;
    }

}
