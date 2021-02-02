package cn.suuhui.springTutorial;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "blog.tutorial")
public class TutorialConfigBean {
    private String name;
    private String author;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    };

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
