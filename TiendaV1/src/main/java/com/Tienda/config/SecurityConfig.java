package com.Tienda.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.Tienda.service.UsuarioService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public UsuarioService uServ;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	

	  @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(uServ).passwordEncoder(encoder);
	    }

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCPE = new BCryptPasswordEncoder();
		return bCPE;
	}

	@Override
    public void configure (HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
        .antMatchers("/css/", "/js/", "/images/**")
        .permitAll()
        .antMatchers("/login", "/", "/index")
        .hasAnyAuthority("entrenador")
        .antMatchers("/agregar", "/agregarAtencion")
        .hasAuthority("entrenador")
        .anyRequest()
        .authenticated()
        .and()
        .formLogin()
        .loginPage("/login")
        .permitAll()
        .and()
        .logout()
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        .logoutSuccessUrl("/login")
        ;
    }
	
}
