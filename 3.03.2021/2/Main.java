package pl.Skalinski;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setSize("36/38");
        shop.setAddress("Jelenia 5/1 12-345");
        System.out.println(shop.info());

        BookShop bookShop = new BookShop();

        bookShop.setSize("36/38");
        bookShop.setAddress("Jelenia 5/1 12-345");

        bookShop.setp1("book1");
        bookShop.setp2("book2");
        bookShop.setp3("book3");
        bookShop.setp4("book4");
        System.out.println(bookShop.info());

        Bakery bakery = new Bakery();
        bakery.setSize("36/38");
        bakery.setAddress("Jelenia 5/1 12-345");


        bakery.setP1("bread1");
        bakery.setP2("bread2");
        bakery.setP3("bread3");
        bakery.setP4("bread4");
        System.out.println(bakery.info());

    }
}
