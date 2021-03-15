package za.ac.cput.calculator;



/**
 * author Sindy
 */
public class Division {
    /**
     * Return result of integer
     * numerator
     * denominator
     */
    public static int integerDivision(int numerator, int denominator){
        if (denominator < 1) return 0;
        return numerator/denominator;
    }
}
