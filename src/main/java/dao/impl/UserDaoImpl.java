package dao.impl;

import com.entity.User;
import dao.UserDao;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by 细潮 on 2014/11/28 0028.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public List<User> login(String name) {
        String sql="from User where name='"+name+"'";
        return (List<User>) this.getHibernateTemplate().find(sql);
    }
}
