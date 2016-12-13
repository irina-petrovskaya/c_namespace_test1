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

    public AAAA1(int arg1, int arg2) {
        this.iii = arg1;

    }
}
