package academy.everyonecodes.steampurchases.DataClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class GameData {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Column(unique = true)
    private String productId;
    private double price;

    public GameData() {
    }

    public GameData(String title, String productId, double price) {
        this.title = title;
        this.productId = productId;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameData gameData = (GameData) o;
        return Double.compare(gameData.price, price) == 0 &&
                Objects.equals(title, gameData.title) &&
                Objects.equals(productId, gameData.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, productId, price);
    }
}
