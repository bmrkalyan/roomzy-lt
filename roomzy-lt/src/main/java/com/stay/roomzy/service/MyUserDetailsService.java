package com.stay.roomzy.service;

import com.stay.roomzy.dto.User;
import com.stay.roomzy.dto.UserDetailsImpl;
import com.stay.roomzy.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    public UserRepo userrepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userrepo.findByUsername(username);
        if(user==null){
          System.out.println("404 user not found");
          throw new UsernameNotFoundException(("404 user not found"));
        }
        return new UserDetailsImpl(user);

    }
}
