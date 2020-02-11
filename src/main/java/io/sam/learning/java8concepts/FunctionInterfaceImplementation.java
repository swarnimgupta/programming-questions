package io.sam.learning.java8concepts;

import java.util.IntSummaryStatistics;
import java.util.Random;

@FunctionalInterface
interface PrintLambdaFunction {
    void printMessage(String message);
}

public class FunctionInterfaceImplementation {

    public static void main(String[] args) {
        PrintLambdaFunction lambdaFunction = (message) -> {
            System.out.println ("Working with lambda expression " + message);
        };

        lambdaFunction.printMessage ("Testing");
        Random random = new Random ( );

        random.ints ( )
                .limit (5)
                .filter (i -> i > 0)
                .sorted ( )
                .forEach (System.out::println);

        IntSummaryStatistics intSummaryStatistics = random.ints ( )
                .limit (5)
                .filter (i -> i > 0)
                .sorted ( )
                .summaryStatistics ( );
        
        System.out.println (intSummaryStatistics.getCount ( ));
        System.out.println (intSummaryStatistics.getAverage ( ));
        System.out.println (intSummaryStatistics.getMax ( ));
        System.out.println (intSummaryStatistics.getMin ( ));
        System.out.println (intSummaryStatistics.getSum ( ));
    }

}
