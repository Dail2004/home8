package kg.geehktech.les8.players;

import kg.geektech.les8.game.RPG_Game;

//Berserk должен получать от босса урон, и потом наносить ему свой урон + часть урона полученного от босса
public class Berserk extends Hero {

    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int contreAttack = RPG_Game.random.nextInt(25) + 11;
        boss.setHealth(boss.getHealth() - contreAttack);{
            System.out.println("Berserk контратаковал босса на:" + contreAttack);
        }
    }
}
