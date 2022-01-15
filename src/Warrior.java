import exceptions.WeaponException;

public class Warrior extends Character{

    public Warrior(String name) {
        super(name, "Warrior");
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;

        System.out.println(name + ": My name will go down in history !");
    }

    @Override
    public void attack( String weapon) throws WeaponException {
        if(weapon == "hammer" || weapon == "sword") {
            super.attack("Rrrrrrrr");
            System.out.println(name + ": I'll crush you with my " + weapon + "!");
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

    @Override
    public void moveRight(){
        super.moveRight();

        System.out.println(" like a bad boy.");
    }

    @Override
    public void moveLeft(){
        super.moveLeft();

        System.out.println(" like a bad boy.");
    }

    @Override
    public void moveBack(){
        super.moveBack();

        System.out.println(" like a bad boy.");
    }

    @Override
    public void moveForward(){
        super.moveForward();

        System.out.println(" like a bad boy.");
    }

    public static void main(String[] args) throws WeaponException {
        Warrior perso = new Warrior("jean");

        perso.attack("hammer");
    }
}
