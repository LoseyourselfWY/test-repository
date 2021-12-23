package Wuqi;

public class ArmyTest {
    public static void main(String[] args) {
        Army army = new Army(5);

        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        YunShuJi yunShuJi = new YunShuJi();

        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(yunShuJi);
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }
        army.moveAll();
        army.attackAll();
    }
}
