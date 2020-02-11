package io.sam.learning.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DifferenceBetweenDatesNestedLogic {


    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader (new InputStreamReader (System.in))) {
            String returned = br.readLine ( );
            String due = br.readLine ( );
            SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MM yyyy");
            Date returnedDate = dateFormat.parse (returned);
            Date dueDate = dateFormat.parse (due);
            final long diffDays = TimeUnit.DAYS.convert (Math.abs (returnedDate.getTime ( ) - dueDate.getTime ( )), TimeUnit.MILLISECONDS);
            if (diffDays >= 365) {
//                hack = 1000;
            } else if (diffDays < 365 && diffDays >= 30) {

            } else if (diffDays < 30 && diffDays > 0) {

            } else {

            }
        } catch (Exception ex) {
            System.out.println (ex);
        }
    }

}
