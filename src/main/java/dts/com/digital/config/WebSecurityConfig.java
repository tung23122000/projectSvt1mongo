package dts.com.digital.config;

import dts.com.digital.service.impl.AuthenticationAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    AuthenticationAuthService authenticationAuthService;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http
//                .cors().and()
//                .csrf().disable()
//                .httpBasic().and()
//                .authorizeRequests()
//                .antMatchers( "/position/findAllPo",
//                              "/position/findOnePo/**","/authentication/findAllAu","/authentication/findOneAu/**",
//                              "/department/findAllDep","/department/findOneDep/**").hasRole("ADMIN")// Cho phép  truy
//
//                .antMatchers("/v3/api-docs/**",
//                             "/swagger-ui/**", "/swagger-ui.html","/authentication/createAu","/department/createDe","/leaveInformation/createLe","/position/createPo").permitAll()// Cho phép  truy cập vào  địa chỉ
//                .antMatchers(
//                        "/authentication/editAu/**","/authentication/deleteAllAu","/authentication/deleteOneAu/**").hasRole("USER")
//                .antMatchers(
//                        "/department/editDe/**","/department/deleteAllDe","/department/deleteOneDe/**").hasRole("ADMIN")
//                .antMatchers(
//                        "/leaveInformation/editAu/**","/leaveInformation/deleteAllLe","/leaveInformation/deleteOneLe/**").hasRole("ADMIN")
//                .antMatchers(
//                        "/position/editPo/**","/position/deleteAllPo","/position/deleteOnePo/**").hasRole("ADMIN").and()
////                .anyRequest().authenticated().and()
//                .formLogin().permitAll();//t cả các request khác đều cần phải xác
//
//
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(authenticationAuthService).passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
}
