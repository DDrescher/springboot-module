package academy.everyonecodes.basket.DataClasses;

import java.util.Objects;

public class ItemSelection {
    private String userEmail;
    private String itemName;
    private Double itemPrice;

    public ItemSelection(String userEmail, String itemName, Double itemPrice) {
        this.userEmail = userEmail;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    ItemSelection() {
    }

    public String getItemName() {
        return itemName;
    }

    void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemSelection that = (ItemSelection) o;
        return Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemPrice, that.itemPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userEmail, itemName, itemPrice);
    }
}
