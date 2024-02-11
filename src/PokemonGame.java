import java.util.Scanner;

class Pokemon
{
    private static double additionalHP = 0;
    static
    {
        Scanner addHp = new Scanner(System.in);
        System.out.print("AddHp Pokemon1 : ");

        additionalHP = addHp.nextDouble();
    }
    String name, typ;
    double hp, atk = 3, def = 2, specAtk, specDef, spd;
    Pokemon(String name, String typ, int hp, int spd){
        this.name = name;
        this.typ = typ;
        this.hp = hp;
        this.spd = spd;

    }
    boolean fight(int dmg){


        this.hp = this.hp - dmg;
        if ( this.hp<=dmg)
        {
            System.out.println("You are dead!");
        }
        else
        {
         System.out.println("HP left : " + this.hp);
        }

        return true;

    }
    boolean sleep(int heal){
        this.hp = this.hp + heal;
        System.out.println("You have " + this.hp + " HP");
        return true;
    }
    void heal ()
    {

        this.hp = this.hp + additionalHP;

    }
}
public class PokemonGame {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Pokemon1", "Typ Tank", 15, 5);
        Pokemon p2 = new Pokemon("Pokemon2", "Typ Soldier", 10, 10);
        p1.fight(2);
        p1.sleep(1);
        p2.fight(11);
        p2.sleep(5);
        p1.heal();
        System.out.println(p1.hp);
        System.out.println(p2.hp);

    }
}
