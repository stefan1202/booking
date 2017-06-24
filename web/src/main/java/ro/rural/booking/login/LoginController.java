package ro.rural.booking.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stefan.durla on 24/06/2017.
 */
@RestController
@RequestMapping(value = "/test")
public class LoginController {
    @RequestMapping(value = "/login")
    public String login(){
        return "Hello";
    }
}
