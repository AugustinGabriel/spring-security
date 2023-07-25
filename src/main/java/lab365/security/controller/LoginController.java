package lab365.security.controller;

import lab365.security.security.dto.LoginDto;
import lab365.security.security.dto.TokenDto;
import lab365.security.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Step 16 - Criar endpoint para realizar login
 */
@RestController
@RequestMapping(value = "login")
public class LoginController {

    @Autowired private LoginService loginService;

    @PostMapping
    public TokenDto post(@RequestBody LoginDto login) {
        return loginService.gerarToken(login);
    }

}
