import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static ArrayList<String> arrayList = new ArrayList<>()
    {{
        add("Petr");
        add("Mihail");
        add("Sasha");
        add("Irina");
    }};


    public static void main (String[] args) {
        Collections.swap(arrayList, 0, 1);
        System.out.println(arrayList);

        ArrayList<Integer> arays = new ArrayList<>(Arrays.asList(1, 5, 6, 10));
        System.out.println(arays);

        Box<Apple> appleBox = new Box<>();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();

        appleBox.addFruit(a1);
        appleBox.addFruit(a2);
        appleBox.addFruit(a3);

        System.out.println("Вес коробки с яблоками: " + appleBox.getTotalWeight());

        Box<Orange> orangeBox = new Box<>();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();

        orangeBox.addFruit(o1);
        orangeBox.addFruit(o2);
        orangeBox.addFruit(o3);

        System.out.println("Вес коробки с апельсинами: " + orangeBox.getTotalWeight());

        System.out.println("Сравнение коробок: " + appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.replaceAllFruitsToOtherBox(newAppleBox);


        Apple a4 = new Apple();
        newAppleBox.addFruit(a4);
        System.out.println("Добавили одно яблоко: " + newAppleBox.getTotalWeight());
    }




}
