package lesson3.hw;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class first {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ListMaker(list, 20);
        System.out.printf("List: ");
        System.out.println(list);
        list = (ArrayList<Integer>) RemoveEvenNumbers(list);
        System.out.printf("List without even numbers: ");
        System.out.println(list);
    }

    public static void ListMaker(ArrayList list, int size){
        for(int j = 0; j < size; j++){
            Random rn = new Random();
            int n = 100 + 1;
            int i = rn.nextInt() % n;
            list.add(i);
        }
    }

public static List<Integer> RemoveEvenNumbers(ArrayList<Integer> list) {
        List<Integer> toRemove = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) { toRemove.add(i); }
        }
        list.removeAll(toRemove);
        return list;
}
}
