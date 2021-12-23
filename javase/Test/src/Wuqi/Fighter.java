package Wuqi;

import Wuqi.Moveable;
import Wuqi.Shootable;

public class Fighter extends Weapon implements Shootable, Moveable {

    @Override
    public void move() {
        System.out.println("战斗机移动");
    }

    @Override
    public void Shoot() {
        System.out.println("战斗机射击");
    }

    @Override
    public String toString() {
        return "Wuqi.Fighter";
    }
}

