package lesson3.hw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class second {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ListMaker(list, 20);
        System.out.printf("List: ");
        System.out.println(list);
        System.out.printf("Maximal number: %d", Collections.max(list));
    }

    public static void ListMaker(ArrayList list, int size){
        for(int j = 0; j < size; j++){
            Random rn = new Random();
            int n = 100 + 1;
            int i = rn.nextInt() % n;
            list.add(i);
        }
    }
}