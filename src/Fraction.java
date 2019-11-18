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
    public void multiplication (int numerator1, int denominator1){
        int numerator_ans = numerator*numerator1;
        int denominator_ans = denominator*denominator1;
        System.out.println(numerator_ans + "/" + denominator_ans);
    }
    public void division(int numerator2, int denominator2) {
        int numerator_ans = numerator*denominator2;
        int denominator_ans = denominator*numerator2;
        System.out.println(numerator_ans + "/" + denominator_ans);
    }
    public void subtraction (int numerator3, int denominator3) {
        if (denominator == denominator3) {
            int numerator_ans = numerator-numerator3;
            int denominator_ans = denominator;
            System.out.println(numerator_ans + "/" + denominator_ans);
        } else {
            int numerator_ans = numerator * denominator3 - numerator3 * denominator;
            int denominator_ans = denominator * denominator3;
            System.out.println(numerator_ans + "/" + denominator_ans);
        }
    }
    public void addition (int numerator4, int denominator4) {
        if (denominator == denominator4) {
            int numerator_ans = numerator+numerator4;
            int denominator_ans = denominator;
            System.out.println(numerator_ans + "/" + denominator_ans);
        } else {
            int numerator_ans = numerator * denominator4 + numerator4 * denominator;
            int denominator_ans = denominator * denominator4;
            System.out.println(numerator_ans + "/" + denominator_ans);
        }
    }
}
