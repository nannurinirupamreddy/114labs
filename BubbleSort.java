import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        double[] list = new double[]{6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        boolean changed = true;
        do {
            changed = false;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    double temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                    changed = true;
                }
            }
        } while (changed);
        System.out.println(Arrays.toString(list));
    }
}
