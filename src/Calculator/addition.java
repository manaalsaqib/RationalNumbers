package Calculator;
import Calculator.RationalNumber;

public class addition {
    public static RationalNumber add(RationalNumber r1, RationalNumber r2){
        int num = (r1.getNumerator() * r2.getDenominator() + r2.getNumerator() * r1.getNumerator());
        int den = r1.getDenominator() * r2.getDenominator();
        return (new RationalNumber(num, den));
    }
}
