package it.tramways.commons.web.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class LoggedUserService {

    public TramwaysUserDetails getLoggedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof UsernamePasswordAuthenticationToken) {
            UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
            if (auth.getDetails() instanceof TramwaysUserDetails) {
                return (TramwaysUserDetails) auth.getDetails();
            } else if (auth.getPrincipal() instanceof TramwaysUserDetails) {
                return (TramwaysUserDetails) auth.getPrincipal();
            }
        }
        return null;
    }

}
