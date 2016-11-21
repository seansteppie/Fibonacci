package com.steel_eyed.Numeric;

/**
 * Fibonacci
 * <p>
 * @author Sean Steppie
 * @version 1.0.0        Date: 16/11/16     Initial Version
 */
public class Fibonacci {
    /**
     * Return the Fibonacci number of passed number
     * @param number long
     * @return long
     */
    public static long fibonacci( long number ) {
        if( number < 0 )
            throw new RuntimeException( number + ": out of bounds" );
        return number == 0 || number == 1 ? number :
                fibonacci( number - 1 ) + fibonacci( number - 2 );
    }

    /**
     * Return a sequence of positive Fibonacci numbers between zero and end.
     * @param end number
     * @return long[]
     */
    public static long[] fibonacciSequence( int end ) {
        return fibonacciSequence( 0, end );
    }

    /**
     * Return a sequence of positive Fibonacci numbers between start and end.
     * @param start int
     * @param end int
     * @return long[]
     */
    public static long[] fibonacciSequence( int start, int end ) {
       long[] results = new long[ end - start + 1 ];
        for( int counter = start; counter <= end; counter++ )
            results[ counter ] = fibonacci( counter );
        return results;
    }
}
