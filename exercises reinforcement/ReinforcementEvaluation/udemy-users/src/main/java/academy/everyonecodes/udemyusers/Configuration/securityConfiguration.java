package academy.everyonecodes.udemyusers.Configuration;


import academy.everyonecodes.udemyusers.Data.UserPrincipal;
import academy.everyonecodes.udemyusers.Repositories.UserRepository;
import academy.everyonecodes.udemyusers.Service.StudentCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class securityConfiguration extends WebSecurityConfigurerAdapter {
    private final StudentCreator studentCreator;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public securityConfiguration(StudentCreator studentCreator, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.studentCreator = studentCreator;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }

    @Bean
    DaoAuthenticationProvider authenticationProvider(UserDetailsService userDetailsService) {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(bCryptPasswordEncoder);
        return authProvider;
    }

    @Bean
    UserDetailsService userDetailsService(
            UserRepository userRepository) {
        return username ->
                userRepository.findOneByUsername(username)
                        .map(UserPrincipal::new)
                        .orElseThrow(() ->
                                new UsernameNotFoundException(username));
    }


}


