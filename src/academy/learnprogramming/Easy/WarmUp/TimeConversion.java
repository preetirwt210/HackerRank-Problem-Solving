package academy.learnprogramming.Easy.WarmUp;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Res6 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) throws ParseException {
        // Write your code here
            DateFormat df = new SimpleDateFormat("hh:mm:ssa");
            DateFormat out = new SimpleDateFormat("HH:mm:ss");
            Date date = df.parse(s);
            System.out.println(out.format(date));

        return "date";
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Res6.timeConversion(s);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
