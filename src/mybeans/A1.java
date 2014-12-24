package mybeans;

/**
 * Created by user on 24/12/14.
 */
public class A1 {

    public void a1_method1(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "A1{}";
    }


    int iii;

    public A1(int iii) {
        this.iii = iii;
    }
}
