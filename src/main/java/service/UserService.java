package service;

import com.entity.User;

/**
 * Created by 细潮 on 2014/11/28 0028.
 */
public interface UserService {
    /**
     * 登录
     * @param name
     * @return
     */
    public User login(String name);
}
