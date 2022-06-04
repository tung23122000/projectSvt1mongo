package dts.com.digital.service.impl;

import dts.com.digital.Repository.AuthenticationRespository;
import dts.com.digital.entity.Authentication;
import dts.com.digital.service.AuthenticationService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final AuthenticationRespository authenticationRespository;
//    private final PasswordEncoder passwordEncoder;


    public AuthenticationServiceImpl(
            AuthenticationRespository authenticationRespository)
//            , PasswordEncoder passwordEncoder)
            {this.authenticationRespository = authenticationRespository;
//        this.passwordEncoder =  new BCryptPasswordEncoder();
    }

    @Override
    public List<Authentication> fillAllAu() {
        return authenticationRespository.findAll();
    }

    @Override
    public Optional<Authentication> getOneAu(String email) {
//        List<Authentication> list = authenticationRespository.findAll();
//        Authentication authentication = new Authentication();
//        for (Authentication aut : list) {
//            if (aut.getEmail().equalsIgnoreCase(email)) {
//                authentication = aut;
//                break;
//            }
//        }
        return authenticationRespository.findById(email);
//                authenticationRespository.findByEmail(email);
    }

    @Override
    public void deleteAllAu() {
        authenticationRespository.deleteAll();
    }

    @Override
    public void deleteOneAu(String email) {
        List<Authentication> list = authenticationRespository.findAll();
        Authentication authentication = new Authentication();
        for (Authentication aut : list) {
            if (aut.getEmail().equals(email)) {
                authenticationRespository.delete(aut);
                break;
            }
        }
    }

    @Override
    public void createAu(Authentication authentication) {

//        authentication.setPassword(this.passwordEncoder.encode(authentication.getPassword()));
         this.authenticationRespository.save(authentication);

    }

    @Override
    public void editAu(String email, Authentication authentication) {
        List<Authentication> list = authenticationRespository.findAll();
        for (Authentication aut : list) {
            if (aut.getEmail().equals(email)) {
                authenticationRespository.delete(aut);
                authenticationRespository.save(authentication);
                break;
            }
        }
    }
}
