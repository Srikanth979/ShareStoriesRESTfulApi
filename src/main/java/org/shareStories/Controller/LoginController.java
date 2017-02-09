package org.shareStories.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.shareStories.form.models.LoginForm;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class LoginController {
    
    @GetMapping("/spring")    
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/greeting", method = RequestMethod.POST, headers = "content-type=application/json;Access-Control-Allow-Origin=*")
    public String greetingSubmit(@RequestBody LoginForm  loginForm) {
        return "result2"; 
    }
    
}
