package lab365.security.service;

import lab365.security.security.TokenService;
import lab365.security.security.dto.LoginDto;
import lab365.security.security.dto.TokenDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

/*
 * Step 15 - Service de Login
 * Injeta a dependência do Gerenciador de autenticação e gera token
 */
@Service
public class LoginService {

    @Autowired private AuthenticationManager authenticationManager;

    @Autowired private TokenService tokenService;

    public TokenDto gerarToken(LoginDto login) {
        // Autentica o usuário no sistema
        Authentication auth = authenticationManager.authenticate(login.converter());
        return tokenService.gerarToken(auth);
    }

}
