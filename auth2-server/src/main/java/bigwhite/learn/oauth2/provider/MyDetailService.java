package bigwhite.learn.oauth2.provider;

import jakarta.annotation.Resource;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author bigwhite
 * @date 2023 -03 -10
 **/
@Service
public class MyDetailService implements UserDetailsService {

    @Resource
    DaoService daoService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails = daoService.loadUserByUsername(username);
        if (!userDetails.isEnabled()) {
            throw new DisabledException("该账户已被禁用!");
        }
        return userDetails;
    }
}
