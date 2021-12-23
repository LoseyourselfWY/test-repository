package Wuqi;

import Wuqi.Moveable;

public class YunShuJi extends Weapon implements Moveable {
    @Override
    public void move() {
        System.out.println("运输机移动");
    }

    @Override
    public String toString() {
        return "Wuqi.YunShuJi";
    }
}
