package app.content.prd.service;


import app.content.prd.dto.UserRegistrationDto;
import app.content.prd.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}