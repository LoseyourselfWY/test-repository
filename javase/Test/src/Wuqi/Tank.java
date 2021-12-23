package Wuqi;

import Wuqi.Moveable;
import Wuqi.Shootable;

public class Tank extends Weapon implements Shootable, Moveable {

    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void Shoot() {
        System.out.println("坦克射击");
    }

    @Override
    public String toString() {
        return "Wuqi.Tank";
    }
}
