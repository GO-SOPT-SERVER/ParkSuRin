package sopt.org.SecondSeminar.controller.post;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.SecondSeminar.controller.post.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.service.post.PostService;

import static sopt.org.SecondSeminar.SecondSeminarApplication.postList;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/post")
    public String register(@RequestBody final RegisterRequestDto request) {

        Long postId = postService.register(request);
        System.out.println(postList.get(postId.intValue() - 1).toString());

        return postId + "번 게시글이 동록되었습니다!";
    }

    @GetMapping("/post/{postId}")
    public String getOne(@PathVariable final Long postId) {
        System.out.println("요청 게시글 아이디: " + postId);

        return "게시글 조회 성공";
    }

    @GetMapping("/post/search")
    public String search(@RequestParam final String name) {
        System.out.println("게시글 작성자 이름 검색 인자: " + name);

        return "작성자 검색 성공";
    }
}
