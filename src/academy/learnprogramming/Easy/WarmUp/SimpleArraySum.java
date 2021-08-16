package academy.learnprogramming.Easy.WarmUp;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
             int sum=0;
             for (int i=0;i<ar.size();i++){
                 sum+= ar.get(i);
             }
        System.out.println(sum);
             return sum;

    }

}

public class SimpleArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .collect(toList());


        int result = Result.simpleArraySum(ar);
        bufferedReader.close();
    }
}
