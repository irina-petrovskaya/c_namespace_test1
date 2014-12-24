package mybeans;

import x.y.Foo;

/**
 * Created by user on 24/12/14.
 */
public class A2 extends A1 {

    // str1
    String str1;

    public String getStr1() {
        return str1;}
    public A2(int myint) {
        super(myint);
    }


    public void setStr1(String str1) {
        this.str1 = str1;
    }

    // to String
    @Override
    public String toString() {
        return super.toString()+" overrided in A2{}";
    }
    public void setZoo(Foo zoo) {
    }
}
