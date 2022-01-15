import exceptions.WeaponException;

public class Example {
    public static void main(String[] args) throws WeaponException {
        Character warrior = new Warrior("Jean");
        Character mage = new Mage("Robert");
        mage.tryToAttack("screwdriver");
    try {
        warrior.attack("soap");
    }
    catch (WeaponException e) {
        System.out.println(e.getMessage());
    }
        warrior.moveRight();
        warrior.moveLeft();
        warrior.moveBack();
        warrior.moveForward();
        mage.moveRight();
        mage.moveLeft();
        mage.moveBack();
        mage.moveForward();
    }
}
