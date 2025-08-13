package Operations;
import Calculator.*;

public class Operations {
    public void run(){

        RationalNumber r1 = new RationalNumber(10,20);
        RationalNumber r2 = new RationalNumber(15,20);

        addition a = new addition();
        RationalNumber sum = a.add(r1,r2);

        Subtraction s = new Subtraction();
        RationalNumber difference = s.subtract(r1,r2);

        Multiplication m = new Multiplication();
        RationalNumber product = m.multiply(r1,r2);

        Division d = new Division();
        RationalNumber divide = d.divide(r1,r2);

    }
}
