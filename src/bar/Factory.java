package bar;

public class Factory {

    public static IBar get() {
        return new Goo();
    }

}
