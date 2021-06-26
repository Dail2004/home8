package kg.geehktech.les8.players;
//Добавить еще игрока Witcher, не наносит урон боссу, но получает урон от босса.
//Имеет 1 шанс оживить первого погибшего героя, отдав ему свою жизнь, при этом
//погибает сам.
public class Witcher extends Hero {
    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.VICTIM);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()<0 && this.getHealth() > 0){
                heroes[i].setHealth(heroes[i].getHealth()+this.getHealth());
                this.setHealth(0);
                System.out.println("Wither использовал [Жертву]");
                }
            break;
        }
    }
}
