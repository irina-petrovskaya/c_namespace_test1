package x.y;

/**
 * by Irina.Petrovskaya, on 24.03.11, 16:13
 */
public class Foo {
    private Bar bar;
    private Baz baz;
    private String e_mail;

    public Foo(Bar barr, Baz baz, String string_prop, Boo boo) {
        this.bar = barr;
        this.baz = baz;
        this.e_mail = string_prop;
    }

    public Bar getBar() {
        return bar;
    }

    public Baz getBaz() {
        return baz;
    }

    public String getE_mail() {
        return e_mail;
    }
}
