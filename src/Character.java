import exceptions.WeaponException;

public abstract class Character implements Movable {

    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;

    protected String RPGClass = "CHARACTER";

    public Character(String name, String RPGClass){
        this.name = name;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
        this.RPGClass = RPGClass;

    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    @Override
    public void moveRight() {
        System.out.print(name +": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.print(name +": moves left");
    }

    @Override
    public void moveBack() {
        System.out.print(name +": moves back");
    }

    @Override
    public void moveForward() {
        System.out.print(name +": moves forward");
    }

    public void unsheathe(){
        System.out.print(name +": unsheathes his weapon.");
    }

    protected void attack( String argument) throws WeaponException {
        System.out.println(name +": " + argument);

    }
    protected void tryToAttack(String weapon){}

}
