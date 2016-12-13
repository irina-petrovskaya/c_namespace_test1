package mybeans;

import x.y.Foo;


public class AAAA2 extends AAAA1 {

    /*str1*/
    String str1;

    public AAAA2() {
        super(0,0);
    }

    public String getStr1() {
        return str1;}
    public AAAA2(int myint) {
        super(myint,myint);
    }


    public void setStr1(String str1) {
        this.str1 = str1;
    }

   /**
    *to String
    * @see AAAA1
    **/
    @Override
    public String toString() {
        return super.toString()+" overrided in A2{}";
    }
    public void setZoo(Foo zoo) {
    }
}
