package com.steel_eyed.Numeric;

/**
 * Fibonacci
 * <p>
 * @author Sean Steppie
 * @version 1.0.0        Date: 16/11/16     Initial Version
 */
public class Fibonacci {
    public static long fibonacci( long number ) {
        if( number < 0 )
            throw new RuntimeException( number + ": out of bounds" );
        return number == 0 || number == 1 ? number :
                fibonacci( number - 1 ) + fibonacci( number - 2 );
    }

    public static void main( String[] args ) {
        System.out.println( fibonacci( 10 ) );
//        for( int counter = 0; counter <= 10; counter++ )
//            System.out.printf( "Fibonacci of %d is: %d\n", counter, fibonacci( counter
//            ) );
    }

}
