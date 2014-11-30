package dao;

import com.entity.User;

import java.util.List;

/**
 * Created by 细潮 on 2014/11/28 0028.
 */
public interface UserDao {
    /**
     * 登录
     * @param name
     * @return
     */
    public List<User> login(String name);
}
