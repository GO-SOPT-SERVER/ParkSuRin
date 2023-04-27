package sopt.org.SecondSeminar.domain.post;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Post {

    private Long id;
    private String name;

    private String title;

    private String description;

    public Post(String name, String title, String description) {
        this.name = name;
        this.title = title;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\n" +
                "title: " + this.title + "\n" +
                "description: " + this.description + "\n";
    }
}
