package kg.geektech.les8.game;
//Добавить в проект каждому классу героя свою уникальную способность
//Berserk должен получать от босса урон, и потом наносить ему свой урон + часть урона полученного от босса
//Magic должен увеличивать атаку каждого героя после каждого раунда на n-ное количество
//Warrior каждый раз при атаке критует. Т.е. каждая атака умножается на случайное число от 2 до 4.

//Создать героя Hacker, который будет через раунд забирать у Босса N-ое количество
//здоровья и переводить его одному из героев.
//● Добавить игрока Друид, который имеет способность рандомно призывать помощника
//ангела героям или же ворона боссу на 1 раунд. "Ангел" увеличивает способность медика
//лечить героев на n кол-во. А ворон прибавляет агрессию (увеличивается урон на 50%),
//боссу если его жизнь менее 50%.
public class Main {

    public static void main(String[] args) {
        RPG_Game.start();
    }
}
