package dts.com.digital.service;


import dts.com.digital.entity.Authentication;

import java.util.List;
import java.util.Optional;

public interface AuthenticationService {
    List<Authentication> fillAllAu();
    Optional<Authentication> getOneAu(String email);
    void deleteAllAu();
    void deleteOneAu(String email);
    void createAu(Authentication authentication);
    void editAu(String id,Authentication authentication);
}
