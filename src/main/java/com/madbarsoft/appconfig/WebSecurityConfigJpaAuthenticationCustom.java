package com.madbarsoft.appconfig;
//package com.madbarsoft.appconfig;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
//import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
//
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfigJpaCustomAuthentication extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private UserDetailsService customUserDetailsService;
//
//	@Autowired
//	private DataSource dataSource;
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
//	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/css/**")
//		              .antMatchers("/js/**")
//		              .antMatchers("/loginform/**")
//				      .antMatchers("/vendor/**");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/book/**").hasRole("USER").antMatchers("/admin/**").hasRole("ADMIN")
//				.antMatchers("/", "/home").permitAll().antMatchers("/login").permitAll().anyRequest().authenticated()
//				.and().formLogin().loginPage("/login").defaultSuccessUrl("/home").permitAll().and().logout()
//				.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/home").permitAll().and()
//				.exceptionHandling().accessDeniedPage("/403");
//	}
//	
//    PersistentTokenRepository persistentTokenRepository(){
//        JdbcTokenRepositoryImpl tokenRepositoryImpl = new JdbcTokenRepositoryImpl();
//        tokenRepositoryImpl.setDataSource(dataSource);
//        return tokenRepositoryImpl;
//       }
//
//}
