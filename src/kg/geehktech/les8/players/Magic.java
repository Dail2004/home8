package kg.geehktech.les8.players;

import kg.geektech.les8.game.RPG_Game;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int randomBoost = RPG_Game.random.nextInt(5) + 1; // 1,2,3,4,5
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + randomBoost);
        }
    }
}
