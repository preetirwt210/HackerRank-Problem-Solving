package academy.learnprogramming.Easy.WarmUp;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Res2 {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max=candles.get(0);
        for(int i=1;i<candles.size();i++){
            if(max<candles.get(i)){
                max=candles.get(i);
            }
        }
        int count=0;
        for(int j=0;j<candles.size();j++){
            if(candles.get(j)==max){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Res2.birthdayCakeCandles(candles);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
}
}
