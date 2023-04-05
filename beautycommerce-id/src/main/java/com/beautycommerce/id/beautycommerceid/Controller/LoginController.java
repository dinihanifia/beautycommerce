package com.beautycommerce.id.beautycommerceid.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

//@RestController
@Controller
public class LoginController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/login")
    public String loginPage(){
        return "form-login-and-register-seller";
    }
    @GetMapping("/products")
    public String products(){
        return "products";
    }
}
