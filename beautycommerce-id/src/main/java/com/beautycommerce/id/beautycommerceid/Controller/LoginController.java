package com.beautycommerce.id.beautycommerceid.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@Controller
public class LoginController {

    @PostMapping("/")
    public String loginPage(Model model){
        return "home.html";
    }
    @GetMapping("/")
    public String Login(Model model, WebRequest request){
        return "home.html";
    }

    @GetMapping("/login-register")
    public String registerPage(Model model){
        return "register-seller.html";
    }
}
