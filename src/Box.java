import java.util.ArrayList;

public class Box<F extends Fruit> {


    private ArrayList<F> fruits;
    private float totalWeight;

    public Box() {
        fruits = new ArrayList<>();
    }

    public float getTotalWeight() {
        if (fruits.size() != 0) {
            int i = 0;
            totalWeight = fruits.size() * fruits.get(i).getWeight();
        } else {
            System.out.println("We don't have fruits in a box (Коробка пуста) ");
        }
        return totalWeight;
    }


    public boolean compare(Box<?> otherBox) {
        return getTotalWeight() == otherBox.getTotalWeight();
    }

    public void replaceAllFruitsToOtherBox(Box<F> otherBox) {
        otherBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public void addFruit(F fruitToAdd) {
        fruits.add(fruitToAdd);
    }
}