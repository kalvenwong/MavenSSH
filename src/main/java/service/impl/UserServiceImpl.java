package service.impl;

import com.entity.User;
import dao.UserDao;
import service.UserService;

/**
 * Created by 细潮 on 2014/11/28 0028.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public User login(String name) {
        if(userDao.login(name).size()>0){
           return  userDao.login(name).get(0);
        }
        return null;
    }


    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
