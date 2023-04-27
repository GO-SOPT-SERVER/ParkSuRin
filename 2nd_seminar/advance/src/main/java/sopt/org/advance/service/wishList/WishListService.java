package sopt.org.advance.service.wishList;

import org.springframework.stereotype.Service;
import sopt.org.advance.controller.wishList.dto.request.RegisterRequestDto;
import sopt.org.advance.domain.wishList.WishList;

import static sopt.org.advance.AdvanceApplication.wishListList;

@Service
public class WishListService {
    public Long register(RegisterRequestDto request) {

        //받아온 request 데이터를 토대로 실제 WishList 객체 생성
        WishList newWishList = new WishList(
                request.getName(),
                request.getPrice(),
                request.getReason()
        );

        // 데이터베이스에 저장
        wishListList.add(newWishList);
        newWishList.setId((long) wishListList.size());

        //저장한 유저 아디이 값 반환
        return newWishList.getId();
    }
}
