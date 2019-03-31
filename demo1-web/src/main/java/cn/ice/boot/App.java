package cn.ice.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@ComponentScan("cn.ice.**")
//@EntityScan(basePackages = {"cn.ice.**"})
public class App
{

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        logger.debug("Test Request Mapping");
        return "Test String";
    }

    public static void main( String[] args )
    {
        logger.debug("Spring boot application starts");
        SpringApplication.run(App.class, args);
    }
}
