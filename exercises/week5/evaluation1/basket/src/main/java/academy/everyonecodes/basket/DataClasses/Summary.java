package academy.everyonecodes.basket.DataClasses;

import java.util.Objects;

public class Summary {
    private String userEmail;
    private String itemName;
    private Double itemPrice;
    private Double deliveryCost;
    private Double totalPrice;

    public Summary(String userEmail, String itemName, Double itemPrice, Double deliveryCost, Double totalPrice) {
        this.userEmail = userEmail;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.deliveryCost = deliveryCost;
        this.totalPrice = totalPrice;
    }

    Summary() {
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getUserEmail() {
        return userEmail;
    }

    void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getItemName() {
        return itemName;
    }

    void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getDeliveryCost() {
        return deliveryCost;
    }

    void setDeliveryCost(Double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Summary summary = (Summary) o;
        return Objects.equals(userEmail, summary.userEmail) &&
                Objects.equals(itemName, summary.itemName) &&
                Objects.equals(itemPrice, summary.itemPrice) &&
                Objects.equals(deliveryCost, summary.deliveryCost) &&
                Objects.equals(totalPrice, summary.totalPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userEmail, itemName, itemPrice, deliveryCost, totalPrice);
    }
}
