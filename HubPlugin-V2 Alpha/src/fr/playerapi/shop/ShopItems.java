package fr.playerapi.shop;

public enum ShopItems {
    //  OBJECT(ID, NAME, PRICE)
    VIP(1, "Grade Vip", 2000),
    VIPX(2, "Grade Vip +", 5000),
    MVP(3, "Grade Mvp", 7000),
    MVPX(4, "Grade Mvp+", 12000),
    MVPXX(5, "Grade Mvp++", 20000);

    private int id;
    private String name;
    private int price;

    ShopItems(int id, String name, int prix) {
        this.id = id;
        this.name = name;
        this.price = prix;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
