package cn.suuhui.springTutorial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TutorialProperties {

    @Value("${blog.tutorial.name}")
    private String name;

    @Value("${blog.tutorial.author}")
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
