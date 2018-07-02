package factory;

public class RaisinCookie extends Cookie {
    String taste = "bad";

    @Override
    public void eatCookie() {
        System.out.println("I hate raisins!");
    }
}
