public class Calculator {
    public static int add(int x, int y ){
        return x+y;
    }
    public static int subtract(int x, int y){
        return x-y;
    }
    public static int multiply( int x, int y){
        return x*y;
    }
    public static double divide(int x, int y) throws DivisionByZeroException {
        double z;
        if (y==0){
            throw new DivisionByZeroException("denominator == 0!");
        }
        z = (double) x/ (double) y;
        return z;
    }
}
