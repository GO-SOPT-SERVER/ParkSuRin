package sopt.org.advance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sopt.org.advance.domain.wishList.WishList;

import java.util.ArrayList;

@SpringBootApplication
public class AdvanceApplication {

	public static ArrayList<WishList> wishListList;

	public static void main(String[] args) {

		SpringApplication.run(AdvanceApplication.class, args);

		wishListList = new ArrayList<>();
	}

}
