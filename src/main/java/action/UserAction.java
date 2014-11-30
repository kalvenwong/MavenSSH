package action;

import com.entity.User;
import service.UserService;

/**
 * Created by 细潮 on 2014/11/28 0028.
 */
public class UserAction extends BaseAction {
    private UserService userService;
    private User user;

    public String login(){
       User u= userService.login(user.getName());
        if(u!=null){
            if(u.getPassword().equals(user.getPassword())) {
                return SUCCESS;
            }
        }
        return "fail";
    }







    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
