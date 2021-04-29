package com.steel_eyed.Numeric;

import org.junit.Test;

import static com.steel_eyed.Numeric.Fibonacci.fibonacci;
import static org.junit.Assert.*;

/**
 * FibonacciTest
 * <p>
 *
 * @author Sean Steppie
 * @version 1.0.0        Date: 29/04/2021     Initial Version
 */
public class FibonacciTest {
    private static final long[] VALUES = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 };
    private static final int VALUE_12 = 12;
    private static final int VALUE_2 = 2;
    private static final int VALUE_3 = 3;
    private static final int VALUE_9 = 9;

    @Test
    public void fibonacciSingleTest() {
        assertEquals( "Single value of " + VALUE_9 + " should equal " + VALUES[ VALUE_9 ],
                VALUES[ VALUE_9 ], fibonacci( VALUE_9 ) );
        assertEquals( "Single value of " + VALUE_2 + " should equal " + VALUES[ VALUE_2 ],
                VALUES[ VALUE_2 ], fibonacci( VALUE_2 ) );
        assertEquals( "Single value of " + VALUE_3 + " should equal " + VALUES[ VALUE_3 ],
                VALUES[ VALUE_3 ], fibonacci( VALUE_3 ) );
    }

    @Test
    public void FibonacciSequenceTest() {
        assertArrayEquals( VALUES, Fibonacci.fibonacciSequence( VALUE_12 ) );
    }
}