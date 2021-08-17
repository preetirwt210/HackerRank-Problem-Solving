package academy.learnprogramming.Easy.WarmUp;

import java.io.*;
import java.util.Scanner;

class Result2 {

    /*
     * Complete the 'compareTriplets' function below.
     *
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int[] compareTriplets(int[] a, int[] b) {
        // Write your code here
        int[] m = new int[2];
        m[0] = 0;
        m[1] = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] < b[i]) {
                m[1]++;
            } else {
                if (a[i] > b[i]) {
                    m[0]++;
                }
            }
        }
        return m;
    }
}



public class CompareTheTriplets {
    public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] a = new int[3];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] b = new int[3];

        String[] bItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b[i] = bItem;
        }

        int[] result = Result2.compareTriplets(a, b);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
