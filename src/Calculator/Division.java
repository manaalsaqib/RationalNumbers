package Calculator;

public class Division {
    public static RationalNumber divide(RationalNumber r1, RationalNumber r2){
        int num = r1.getNumerator() * r2.getDenominator() / r2.getNumerator() * r1.getDenominator();
        int den = r1.getDenominator() * r2.getDenominator();
        return (new RationalNumber(num,den));
    }
}
