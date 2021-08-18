package academy.learnprogramming.Easy.WarmUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result5 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
            double positive=0;
            double negative=0;
            double zero=0;
            int length=arr.size();
            for(int i=0;i<length;i++){
                int value;
                if(arr.get(i)>0){
                    positive++;
                }
                else if(arr.get(i)<0){
                    negative++;
                }else{
                    zero++;
                }
            }
          System.out.println(positive/length);
        System.out.println(negative/length);
        System.out.println(zero/length);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result5.plusMinus(arr);

        bufferedReader.close();
    }
}

