package mybeans;

/**
 * Created by user on 24/12/14.
 */
public class A2 extends A1 {
    String sss;

    public String getSss() {
        return sss;
    }

    public void setSss(String sss) {
        this.sss = sss;
    }
    @Override
    public String toString() {
        return super.toString()+" overrided in A2{}";
    }
}
