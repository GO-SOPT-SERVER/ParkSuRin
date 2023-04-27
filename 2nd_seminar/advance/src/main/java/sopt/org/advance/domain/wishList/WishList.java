package sopt.org.advance.domain.wishList;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class WishList {
    private Long id;
    private String name;
    private int price;
    private String reason;

    public WishList(String name, int price, String reason) {
        this.name = name;
        this.price = price;
        this.reason = reason;

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\n" +
                "name: " + this.name + "\n" +
                "contact: " + this.price + "\n" +
                "age: " + this.reason;
    }

}
