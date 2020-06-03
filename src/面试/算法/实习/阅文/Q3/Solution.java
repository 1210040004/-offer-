package 面试.算法.实习.阅文.Q3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        String pre = sc.next();
        String after = sc.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date pretime = simpleDateFormat.parse(pre);
        Date aftertime = simpleDateFormat.parse(after);


    }
}
