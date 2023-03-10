package bigwhite.learn.oauth2.provider;

import jakarta.annotation.PostConstruct;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author bigwhite
 * @date 2023 -03 -10
 **/
@Service
public class DaoService implements UserDetailsService {
    List<MyDetail> dataList;

    @PostConstruct
    public void init() {
        MyDetail myDetail = new MyDetail();
        myDetail.setUsername("bigwhite");
        myDetail.setPassword("123456");
        dataList = new ArrayList<>();
        dataList.add(myDetail);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return dataList.get(0);
    }
}
