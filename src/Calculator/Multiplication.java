package Calculator;

public class Multiplication {
    public static RationalNumber multiply(RationalNumber r1, RationalNumber r2){
        int num = r1.getNumerator() * r2.getDenominator() * r2.getNumerator() * r1.getDenominator();
        int den = r1.getDenominator() * r2.getDenominator();

        return (new RationalNumber(num,den));
    }

}
