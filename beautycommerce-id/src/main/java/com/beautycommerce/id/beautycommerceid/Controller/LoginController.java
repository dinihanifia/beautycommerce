package com.beautycommerce.id.beautycommerceid.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class LoginController {
    
    @GetMapping("/")
    public String loginPage(Model model){
        return "home.html";
    }

    @GetMapping("/login-register")
    public String registerPage(Model model){
        return "register-seller.html";
    }
}
