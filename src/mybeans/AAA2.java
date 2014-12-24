package mybeans;

import x.y.Foo;


public class AAA2 extends AAA1 {

    /*str1*/
    String str1;

    public String getStr1() {
        return str1;}
    public AAA2(int myint) {
        super(myint);
    }


    public void setStr1(String str1) {
        this.str1 = str1;
    }

   /**
    *to String
    * @see AAA1
    **/
    @Override
    public String toString() {
        return super.toString()+" overrided in A2{}";
    }
    public void setZoo(Foo zoo) {
    }
}
