public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction(5,6);
        Fraction n = new Fraction(3,5);
        f.multiplication(n);
        System.out.println(f.toString());
        f.division(n);
        System.out.println(f.toString());
        f.subtraction(n);
        System.out.println(f.toString());
        f.addition(n);
        System.out.println(f.toString());

    }
}
