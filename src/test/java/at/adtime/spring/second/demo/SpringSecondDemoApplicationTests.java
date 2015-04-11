package at.adtime.spring.second.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dominikangerer.spring.second.demo.SpringSecondDemoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringSecondDemoApplication.class)
@WebAppConfiguration
public class SpringSecondDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
