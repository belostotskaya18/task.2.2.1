public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one :)");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void multiplication(Fraction n) {
        numerator = numerator * n.numerator;
        denominator = denominator * n.denominator;
    }

    public void division(Fraction n) {
        numerator = numerator * n.denominator;
        denominator = denominator * n.numerator;
    }

    public void subtraction(Fraction n) {
        if (denominator == n.denominator) {
            numerator = numerator - n.numerator;
            denominator = denominator;
        } else {
            numerator = numerator * n.denominator - n.numerator * denominator;
            denominator = denominator * n.denominator;
        }
    }

    public void addition(Fraction n) {
        if (denominator == n.denominator) {
            numerator = numerator + n.numerator;
            denominator = denominator;
        } else {
            numerator = numerator * n.denominator + n.numerator * denominator;
            denominator = denominator * n.denominator;
        }
    }

    @Override
    public String toString() {
        return new StringBuilder().append(numerator).append("/").append(denominator).toString();
    }
}
