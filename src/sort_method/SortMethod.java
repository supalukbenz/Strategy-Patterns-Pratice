package sort_method;

public class SortNumber {
    public static void sort(int[] a, Comparator cmp){
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (cmp.compare(a[j], a[minPos]) < 0) {
                    minPos = j;
                }
            }
            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

}
