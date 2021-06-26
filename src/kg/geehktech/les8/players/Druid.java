package kg.geehktech.les8.players;

import kg.geektech.les8.game.RPG_Game;

////● Добавить игрока Друид, который имеет способность рандомно призывать помощника
////ангела героям или же ворона боссу на 1 раунд. "Ангел" увеличивает способность медика
////лечить героев на n кол-во. А ворон прибавляет агрессию (увеличивается урон на 50%),
////боссу если его жизнь менее 50%.
public class Druid extends Hero {
    public Druid(int health, int damage) {
        super(health, damage, SuperAbility.APPEAL);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int appeal = RPG_Game.random.nextInt(2) + 1;
        if (this.getHealth() > 0) {
            if (appeal == 1) {
                for (int i = 0; i < boss.getDamage(); i++) {
                    if (boss.getHealth() < 1000)
                        boss.setDamage(getDamage() + (getDamage() / 50));
                    System.out.println("Вы призвали [Ворона]");
                    break;
                }
            }
            if (appeal == 2) {
                int healBoost = RPG_Game.random.nextInt(5) + 1;
                
            }
        }
    }
}





