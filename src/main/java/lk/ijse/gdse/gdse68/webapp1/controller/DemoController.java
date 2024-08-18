package lk.ijse.gdse.gdse68.webapp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping(value = "/health")
    // @GetMapping(value = "/healt?") මෙහි අවසානයට ? දැමූ විට http://localhost:8080/webApp1/demo/healtx එවන්න පුළුවන්
    // @GetMapping(value = "/healt??") මෙහි අවසානයට ? දැමූ විට http://localhost:8080/webApp1/demo/healtxx? එවන්න පුළුවන්
    // @GetMapping(value = "/health/*") මෙහි අවසානයට ? දැමූ විට http://localhost:8080/webApp1/demo/health/xxx එවන්න පුළුවන්
    // @GetMapping(value = "/health/**") මෙහි අවසානයට ? දැමූ විට http://localhost:8080/webApp1/demo/health/xxx/yyy
                                                                        // ඕනෑම තරමක් පාත් සේග්මන්ට් එවන්න පුළුවන්
    public String healthCheck(){
        return "DemoController OK";
    }
    @GetMapping//defult >> http://localhost:8080/webApp1/demo
    public String otherText(){
        return "Other text";
    }

    @GetMapping(value = "/pattern/{name}")
    public String pathVariable(@PathVariable("name") String name) {
        return "DemoController run perfectly with :"+name;
    }
    @GetMapping(value = "/patternRegex/{id:C\\d{3}}")
    public String pathvariableWithRegex(@PathVariable("id") String id) {
        return "DemoController run perfectly with :"+id;
    }

    @GetMapping(params = "test=all")
    public String params(){
        return "All are tested";
    }
}
