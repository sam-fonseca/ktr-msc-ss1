package exceptions;

public class WeaponException extends Exception{

    public WeaponException(String weaponError, Class classe, String name){
        super("");
        if(weaponError == ""){
            System.out.print("I refuse to fight with my bare hands.");
        }
        else {
            if (classe.getName() == "Warrior") {
                System.out.print(name + ": A " + weaponError + "?? What should I do with this ?! ");
            }
            if (classe.getName() == "Mage") {
                System.out.print(name + ": I don't need this stupid " + weaponError + "! Don't misjudge my powers! ");
            }
        }

    }
}
