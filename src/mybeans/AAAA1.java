package mybeans;

/**
 * Created by user on 24/12/14.
 */
public class AAAA1 {

    public void a1_method1(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "A1{}";
    }

    public void a1_method2(){}

    int iii;

    public AAAA1(int iii) {
        this.iii = iii;
    }
    public static class InnerC1{

        /**
         * @param a1
         * @param a2
         * @param a3
         * @return
         */
        public static String inner$Method(int a1, int a2, int a3){
            int foo = a1+a2+a3;
            return "i'm inner! sum is "+foo;
        }
    }
}
