package br.dev.spring.demo.auth.service;

import br.dev.spring.demo.auth.model.CustomUserDetails;
import br.dev.spring.demo.auth.model.User;
import br.dev.spring.demo.auth.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.function.Supplier;

public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public JpaUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Supplier<UsernameNotFoundException> s = () -> new UsernameNotFoundException("Problemas durante a autenticação!");
        User user = userRepository.findUserByUsername(username).orElseThrow(s);

        return new CustomUserDetails(user);
    }
}
