package academy.everyonecodes.fleamarket.DataClasses;

public class Item {
    private String name;
    private Double price;

    public void setname(String name) {
        this.name = name;
    }

    public void setprice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
