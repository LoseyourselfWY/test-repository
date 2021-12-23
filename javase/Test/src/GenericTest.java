import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {

     /*   List myList = new ArrayList();
        Cat c = new Cat();
        Bird b = new Bird();

        myList.add(c);
        myList.add(b);

        Iterator it = myList.iterator();

        while (it.hasNext()){
            Object obj = it.next();
            if(obj instanceof  Cat){
                obj = (Cat)obj;
                ((Cat) obj).catchMouse();
            }
            else if (obj instanceof Bird){
                obj = (Bird)obj;
                ((Bird) obj).fly();
            }
        }*/
        List<Animal> myList = new ArrayList<Animal>();

        Cat c = new Cat();
        Bird b = new Bird();

        myList.add(c);
        myList.add(b);

        Iterator<Animal> it = myList.iterator();

        while (it.hasNext()){
            Animal animal = it.next();
            animal.move();
        }

    }
}

class Animal {
public void move(){
    System.out.println("动物在移动");
}
}

class Cat extends Animal {
    public void move() {
        System.out.println("猫抓老鼠!");
    }
}

class Bird extends Animal {
    public void move() {
        System.out.println("鸟儿在飞翔！");
    }
}
