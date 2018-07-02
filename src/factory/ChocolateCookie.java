package factory;

public class ChocolateCookie extends Cookie {
    String taste = "chocolate";

    @Override
    public void eatCookie() {
        System.out.println("Mmm, chocolate cookie, I love chocolate!");
    }
}
