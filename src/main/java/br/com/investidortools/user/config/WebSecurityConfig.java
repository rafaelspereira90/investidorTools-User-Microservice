//package br.com.investidortools.user.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
///*@EntityScan("br.com.investidortools.user.model")*/
//@EnableJpaRepositories("br.com.investidortools.user.repository")
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//    UserDetailsServiceImpl userDetailsService;
//	
//	@Autowired
//    AuthenticationEntryPointImpl authenticationEntryPoint;
//	
//	private static final String[] AUTH_WHITELIST = {
//            "/v1/auth/**"
//    };
//	
//	@Bean
//    public AuthenticationJwtFilter authenticationJwtFilter() {
//        return new AuthenticationJwtFilter();
//    }
//	
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .exceptionHandling().authenticationEntryPoint(authenticationEntryPoint)
//                .and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .authorizeRequests()
//                .antMatchers(AUTH_WHITELIST).permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .csrf().disable();
//        http.addFilterBefore(authenticationJwtFilter(), UsernamePasswordAuthenticationFilter.class);
//    }
//	
//	@Override
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//	
//	@Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService)
//                .passwordEncoder(passwordEncoder());
//    }
//	
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//	    return new BCryptPasswordEncoder();
//	}
//	
//}
