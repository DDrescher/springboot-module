package academy.everyonecodes.steampurchases.DataClasses;

import java.util.Objects;

public class PurchaseDTO {
    private String buyerUsername;
    private String gameTitle;
    private String productId;
    private double price;

    public PurchaseDTO(String buyerUsername, String gameTitle, String productId, double price) {
        this.buyerUsername = buyerUsername;
        this.gameTitle = gameTitle;
        this.productId = productId;
        this.price = price;
    }

    public PurchaseDTO() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuyerUsername() {
        return buyerUsername;
    }

    public void setBuyerUsername(String buyerUsername) {
        this.buyerUsername = buyerUsername;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseDTO that = (PurchaseDTO) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(buyerUsername, that.buyerUsername) &&
                Objects.equals(gameTitle, that.gameTitle) &&
                Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyerUsername, gameTitle, productId, price);
    }
}
