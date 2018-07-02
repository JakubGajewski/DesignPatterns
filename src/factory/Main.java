package factory;

public class Main {
    public static void main(String[] args) {
        CookieFactory cookieFactory = new CookieFactory();
        Cookie myCookie = cookieFactory.makeCookie("chocolate");
        myCookie.eatCookie();

    }
}
