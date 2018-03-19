package demo.helloworld.service;

import act.ActComponent;
import act.db.sql.tx.Transactional;
import demo.helloworld.dao.UserDao;
import demo.helloworld.model.User;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by a on 2018/3/19.
 */
@Transactional
public class UserService{

    @Inject
    private UserDao userDao;

    public List<User> getAll(){

        return userDao.all();
    }
}
