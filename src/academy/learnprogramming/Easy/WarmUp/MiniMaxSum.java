package academy.learnprogramming.Easy.WarmUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Res1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long[] temp=new long[arr.size()];
      long sum=0;
      for(int i=0;i<arr.size();i++){
          sum+= arr.get(i);
      }
      for(int j=0;j<arr.size();j++){
          temp[j]= sum- arr.get(j);
      }
      long min=temp[0];
      long max=temp[0];

      for(int k=1;k< temp.length;k++){
          if(temp[k]<min){
              min=temp[k];
          }else if(temp[k]>max){
              max=temp[k];
          }
      }
      System.out.println(min + " " + max);

    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
//        Scanner sc=new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//          int[] arr=new int[5];
//          String[] arrItem=sc.nextLine().split(" ");
//          sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Res1.miniMaxSum(arr);

        bufferedReader.close();
    }
}
