package factory;

public class CookieFactory {

    public Cookie makeCookie(String ingredient) {
        if (ingredient.equals("raisin")) {
            return new RaisinCookie();
        }
        if (ingredient.equals("chocolate")) {
            return new ChocolateCookie();
        }
        return null;
    }
}
