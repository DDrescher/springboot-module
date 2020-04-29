package academy.everyonecodes.languagebarriers.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.List;

@Configuration
public class SecurityConfiguration
        extends WebSecurityConfigurerAdapter {
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        UserDetails userOne = User.withUsername("michael")
                .password(encoder.encode("geheim"))
                .authorities("ROLE_USER", "ROLE_LANGUAGE_GERMAN")
                .build();
        UserDetails userTwo = User.withUsername("stacey")
                .password(encoder.encode("secret"))
                .authorities("ROLE_USER", "ROLE_LANGUAGE_ENGLISH")
                .build();
        UserDetails admin = User.withUsername("admin")
                .password(encoder.encode("admin"))
                .authorities("ROLE_ADMIN", "ROLE_USER", "ROLE_LANGUAGE_ENGLISH", "ROLE_LANGUAGE_GERMAN")
                .build();
        List<UserDetails> users = List.of(userOne, userTwo, admin);
        return new InMemoryUserDetailsManager(users);
    }


    @Override
    protected void configure(HttpSecurity http)
            throws Exception {
        http.cors().and().csrf().disable()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }
}
