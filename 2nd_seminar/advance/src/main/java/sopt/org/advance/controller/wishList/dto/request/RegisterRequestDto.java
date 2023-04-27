package sopt.org.advance.controller.wishList.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RegisterRequestDto {
    private String name;
    private int price;
    private String reason;

}
