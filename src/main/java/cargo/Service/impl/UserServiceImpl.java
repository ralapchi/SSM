package cargo.Service.impl;

import cargo.Dao.IUserDao;
import cargo.Model.User;
import cargo.Service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}