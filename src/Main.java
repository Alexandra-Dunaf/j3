import java.util.ArrayList;
import java.util.Arrays;


public class Main {



    static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    static void swapElements(Object[] array, int firstIndex, int secondIndex) {
        Object oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }

    public static void main (String[] args) {
        String[] string = {"Sasha", "Pasha", "Masha"};

        swapElements(string, 1, 2);

        convertToList(string);




    }




}
