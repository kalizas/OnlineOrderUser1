package kg.itacademy.OnlineOrderUser.securityDetails;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        if(userName.contains("user")){
            return new User("user", "user", new ArrayList<>());
        }else
              return new User("client", "client", new ArrayList<>());
    }
}
