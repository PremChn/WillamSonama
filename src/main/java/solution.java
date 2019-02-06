import java.util.Arrays;
import java.util.Comparator;

public class solution {
    public static void sortMergeIntervals(zipCodeRange arr[]) {
        Arrays.sort(arr, new Comparator<zipCodeRange>() {
            public int compare(zipCodeRange x1, zipCodeRange x2) {
                return x1.first - x2.first;
            }
        });

        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (index != 0 && arr[index - 1].first <= arr[j].last) {
                while (index != 0 && arr[index - 1].first <= arr[j].last) {
                    arr[index - 1].last = Math.max(arr[index - 1].last, arr[j].last);
                    arr[index - 1].first = Math.min(arr[index - 1].first, arr[j].first);
                    index--;
                }
            } else
                arr[index] = arr[j];
                index++;

        }
            System.out.println("Final output");
            for (int k = 0; k < index; k++)
                System.out.print("[" + arr[k].first + "," + arr[k].last + "]");


    }
}