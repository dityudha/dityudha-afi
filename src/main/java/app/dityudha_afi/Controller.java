package app.dityudha_afi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value="/controller", method= RequestMethod.GET)
    public String controller() {
        return "Hello World";
    }
}
