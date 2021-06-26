package kg.geehktech.les8.players;

import kg.geektech.les8.game.RPG_Game;

//Создать героя Hacker, который будет через раунд забирать у Босса N-ое количество
//здоровья и переводить его одному из героев.
public class Hacker extends Hero {
    public Hacker(int health, int damage) {
        super(health, damage, SuperAbility.HACK);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int hack = RPG_Game.random.nextInt(50) + 1;
        for (int i = 0; i < heroes.length; i++) {
            boss.setHealth(boss.getHealth()-hack);
            heroes[i].setHealth(heroes[i].getHealth()+hack);
            System.out.println("Hacker отнял у босса [" + hack + "]");
            break;
        }
    }
}
