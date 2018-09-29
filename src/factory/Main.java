package factory;

public class Main {
    public static void main(String[] args) {
        CookieFactory cookieFactory = new CookieFactory();
        Cookie teryzol = cookieFactory.makeCookie("chocolate");
        teryzol.eatCookie();

    }
}
