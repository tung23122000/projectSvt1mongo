package dts.com.digital.entity;


import dts.com.digital.entity.Authentication;
import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//@Data
//@AllArgsConstructor
public class CumstomAuthenticationDetails implements UserDetails {
    private String email;
    private String password;
    private boolean active;
    private List<GrantedAuthority> authorities;

    public CumstomAuthenticationDetails(Authentication authentication){
        this.email = authentication.getEmail();
        this.password = authentication.getPassword();
        this.active = authentication.getIsNew();
        this.authorities = Arrays.stream(authentication.getRoles().split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {return true;}//tài khoản hết hạn chưa để xác thực

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }//người dùng có bị khóa hay không

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }//thông tin đăng nhập ngăn chặn xác thực

    @Override
    public boolean isEnabled() {
        return active;
    }// cho biết người dùng còn dùng hay không //  tắt ko cho xác thực
}
