package lesson3.hw;
import java.util.ArrayList;
import java.util.Random;

public class fourth {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ListMaker(list, 20);
        System.out.printf("List: ");
        System.out.println(list);
        System.out.printf("Average number: %.2f", CalculationAverageValue(list));
    }

    public static void ListMaker(ArrayList list, int size){
        for(int j = 0; j < size; j++){
            Random rn = new Random();
            int n = 100 + 1;
            int i = rn.nextInt() % n;
            list.add(i);
        }
    }

    public static double CalculationAverageValue(ArrayList list){
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += (Integer)list.get(i);
        }
        return (double) sum / list.size();
    }
}
