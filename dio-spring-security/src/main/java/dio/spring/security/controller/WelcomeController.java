package dio.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Welcome to Spring Security";
    }

    @GetMapping("/users")
//  @PreAuthorize("hasAnyRole('MANAGERS','USERS')") -> configuration security
    public String users() {
        return "Authorized user";
    }

    @GetMapping("/managers")
//  @PreAuthorize("hasRole('MANAGERS')") -> configuration security
    public String managers() {
        return "Authorized manager";
    }

}
