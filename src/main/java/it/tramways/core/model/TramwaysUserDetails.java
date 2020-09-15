package it.tramways.core.model;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class TramwaysUserDetails extends User {

    private String uuid;

    public TramwaysUserDetails(String uuid, String username, String password,
        Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }
}
