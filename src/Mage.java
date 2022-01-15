import exceptions.WeaponException;

public class Mage extends Character{

    public Mage(String name) {
        super(name, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;

        System.out.println(name + ": May the gods be with me.");
    }

    @Override
    public void moveRight(){
        super.moveRight();

        System.out.println(" furtively.");
    }

    @Override
    public void moveLeft(){
        super.moveLeft();

        System.out.println(" furtively.");
    }

    @Override
    public void moveBack(){
        super.moveBack();

        System.out.println(" furtively.");
    }

    @Override
    public void moveForward(){
        super.moveForward();

        System.out.println(" furtively.");
    }

    @Override
    public void attack(String weapon) throws WeaponException {
        if(weapon == "magic" || weapon == "wand") {
            super.attack("Rrrrrrrr");
            System.out.println(name + ": Feel the power of my " + weapon + "!");
        }
        else{
            throw new WeaponException(weapon, this.getClass(), this.getName());
        }
    }

    public void tryToAttack(String weapon){
        try {
            attack(weapon);
        }
        catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

    }


}
