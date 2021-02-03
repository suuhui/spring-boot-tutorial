package cn.suuhui.springTutorial;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({TutorialConfigBean.class})
@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringTutorialApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
//		SpringApplication.run(SpringTutorialApplication.class, args);
	}
	@RequestMapping("/hello")
	String hello() {
		return "Hello, world";
	}
}
