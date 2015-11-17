/*=============================================
  class Monster -- Represents random incarnations of 
  the adventurer's natural enemy in Ye Olde RPG
  =============================================*/

public class Monster extends Character {
  protected static String _type;

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // inherited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
      
    public String about() {
      return "hello";
    }  
    public Monster() {
      super();
      _hitPts = 150;
      _strength = 20 + (int)( Math.random() * 45 ); // [20,65)
      _defense = 20;
      _attack = .9;
      _type="Monster";
   }


}//end class Monster
