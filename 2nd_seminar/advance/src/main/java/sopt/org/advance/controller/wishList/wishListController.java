package sopt.org.advance.controller.wishList;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.advance.controller.wishList.dto.request.RegisterRequestDto;
import sopt.org.advance.service.wishList.WishListService;
import static sopt.org.advance.AdvanceApplication.wishListList;

@RestController
@RequiredArgsConstructor
public class wishListController {

    private final WishListService wishListService;

    @PostMapping("/wishList")
    public String register(@RequestBody final RegisterRequestDto request) {

        // 서비스 계층에 위시리스트를 등록하는 메서드 호출
        Long wishListId = wishListService.register(request);
        System.out.println(wishListList.get(wishListId.intValue() - 1).toString());

        return wishListId + "번 위시리스트가 동록되었습니다!";
    }

    @GetMapping("/wishList/{wishListId}")
    public String getOne(@PathVariable final long wishListId) {
        System.out.println("위시리스트 아이디: " + wishListId);

        // service 위시리스트 상품 아이디 찾는 로직 호출

        return "위시리스트 조회 성공!";
    }

    @GetMapping("/wishList/search")
    public String search(@RequestParam final String name) {
        System.out.println("위시리스트 이름 검색 인자: " + name);

        // 서비스 계층에서 위시리스트 이름을 찾는 메서드 호출

        return "위시리스트 검색 조회 성공!";
    }

    @DeleteMapping("/delete/{wishListId}")
    public String deleteWish(@PathVariable final long wishListId) {
        System.out.println("삭제할 위시리스트 아이디" + wishListId);

        // 서비스 계층에서 위시리스트 삭제하는 메서드 호출

        return "위시리스트 삭제 성공!";
    }

    @PutMapping("/put/{wishListId}")
    public String putWish(@PathVariable final long wishListId, @RequestBody final RegisterRequestDto request) {
        System.out.println("수정할 위시리스트 아이디" + wishListId);

        // 서비스 계층에서 수정하는 메서드 호출

        return "위시리스트 수정 성공!";
    }
}
