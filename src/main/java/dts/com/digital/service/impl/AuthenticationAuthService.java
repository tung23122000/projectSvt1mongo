package dts.com.digital.service.impl;

import dts.com.digital.Repository.AuthenticationRespository;

import dts.com.digital.entity.Authentication;
import dts.com.digital.entity.CumstomAuthenticationDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//@Service
public class AuthenticationAuthService implements UserDetailsService {
    @Autowired
    AuthenticationRespository authenticationRespository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Authentication inDB = authenticationRespository.findByEmail(email);
        if (inDB == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CumstomAuthenticationDetails(inDB);
    }
}
