package sopt.org.SecondSeminar.service.post;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.controller.post.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.domain.post.Post;

import static sopt.org.SecondSeminar.SecondSeminarApplication.postList;
@Service
public class PostService {
    public Long register(RegisterRequestDto request) {

        Post newPost = new Post(
                request.getName(),
                request.getTitle(),
                request.getDescription()
        );

        postList.add(newPost);
        newPost.setId((long) postList.size());

        return newPost.getId();
    }
}
