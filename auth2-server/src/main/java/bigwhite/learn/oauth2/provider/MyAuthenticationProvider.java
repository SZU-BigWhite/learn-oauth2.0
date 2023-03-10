package bigwhite.learn.oauth2.provider;

import jakarta.annotation.Resource;
import lombok.Data;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.HashSet;

/**
 * TODO
 *
 * @author bigwhite
 * @date 2023 -03 -10
 **/
@Data
public class MyAuthenticationProvider implements AuthenticationProvider {

    @Resource
    MyDetailService myDetailService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        MyAuthenticationToken authenticationToken = (MyAuthenticationToken) authentication;
        String username = (String) authenticationToken.getPrincipal();
        String password = (String) authenticationToken.getCredentials();

        UserDetails userDetails = myDetailService.loadUserByUsername(username);
        if (ObjectUtils.isEmpty(userDetails) || userDetails.getPassword().equals(password)) {
            throw new BadCredentialsException("Bad credentials");
        }
        MyAuthenticationToken res = new MyAuthenticationToken(new HashSet<>(), userDetails, authentication.getCredentials());
        res.setDetails(authentication.getDetails());
        return res;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return MyAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
