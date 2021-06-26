package kg.geehktech.les8.players;

import kg.geektech.les8.game.RPG_Game;

////Warrior каждый раз при атаке критует. Т.е. каждая атака умножается на случайное число от 2 до 4.
public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int criticalAttack = RPG_Game.random.nextInt(4)+2;
        for (int i = 0; i < heroes.length; i++) {
            boss.setHealth(boss.getHealth()-this.getDamage()*criticalAttack);
            System.out.println("Warrior нанес критический удар:"+this.getDamage()*criticalAttack);
            break;
        }
    }
}
