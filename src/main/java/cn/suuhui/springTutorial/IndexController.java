package cn.suuhui.springTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private TutorialProperties tutorialProperties;

    private TutorialConfigBean tutorialConfigBean;

    private TestPropertiesBean testPropertiesBean;

    @Autowired
    public IndexController(TestPropertiesBean testPropertiesBean) {
        this.testPropertiesBean = testPropertiesBean;
    }

    @Autowired
    public void setTutorialProperties(TutorialProperties tutorialProperties) {
        this.tutorialProperties = tutorialProperties;
    }

    @Autowired
    public void setTutorialConfigBean(TutorialConfigBean tutorialConfigBean) {
        this.tutorialConfigBean = tutorialConfigBean;
    }

    @RequestMapping("/index")
    String index() {
        return tutorialProperties.getName() + "-" + tutorialProperties.getAuthor();
    }

    @RequestMapping("/config-bean")
    String configBean() {
        return tutorialConfigBean.getName() + "-" + tutorialConfigBean.getAuthor() + "--config-bean";
    }

    @RequestMapping("/test-property")
    String testProperty() {
        return testPropertiesBean.getName() + ":" + testPropertiesBean.getAge();
    }
}
