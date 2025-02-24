package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageAppController {
    //UC1
    @GetMapping("/hello")
    public String sayhello(){
        return "Hello From BridgeLabz";
    }
   
}
