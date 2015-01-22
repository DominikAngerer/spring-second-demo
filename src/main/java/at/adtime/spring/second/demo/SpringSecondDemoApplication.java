package at.adtime.spring.second.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import at.adtime.spring.second.demo.model.Account;
import at.adtime.spring.second.demo.model.Bookmark;
import at.adtime.spring.second.demo.repositories.AccountRepository;
import at.adtime.spring.second.demo.repositories.BookmarkRepository;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SpringSecondDemoApplication {

	@Bean
	CommandLineRunner init(AccountRepository accountRepository,
			BookmarkRepository bookmarkRepository) {
		return (evt) -> Arrays.asList(
				"jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
				.forEach(
						a -> {
							Account account = accountRepository.save(new Account(a,
									"password"));
							bookmarkRepository.save(new Bookmark(account,
									"http://bookmark.com/1/" + a, "A description"));
							bookmarkRepository.save(new Bookmark(account,
									"http://bookmark.com/2/" + a, "A description"));
						});
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecondDemoApplication.class, args);
	}
}