public class Pumpkin {
    // class is like blueprints that will make things
    //instance variables
    //todo: turn these ideas into variables. What data types we need?
    //color
    //size
    //is Jackolantern

    public String color;
    //size
    public int size;
    //is jackolantern
    public boolean isJackolantern;

    //special method: constructor
    //name has to match the class name
    //do not use void
    public Pumpkin (int pSize, boolean pIsJackolantern, String  pColor){
        color = pColor;
        size = pSize;
        isJackolantern = pIsJackolantern;
    }

    public void printInfo (){
        System.out.println("the pumpkins color is " + color);
        System.out.println("How big is the pumpkin " + size );
        System.out.println("This pumpkin a jackolantern " + isJackolantern);

    }





}
