import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zipRestriction {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of series required:");
        int n = in.nextInt();
        System.out.println("Enter start and end range for the series");

        zipCodeRange array[] = new zipCodeRange[n];
        for(int i = 0; i < array.length; i++){
            int first = in.nextInt();
            int last = in.nextInt();
            array[i] = new zipCodeRange(first,last);

        }
        solution.sortMergeIntervals(array);
    }
}
