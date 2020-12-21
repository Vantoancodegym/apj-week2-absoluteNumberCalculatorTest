public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        boolean isNagative=number<0;
        if (isNagative){
            return -number;
        }else return number;
    }
}


