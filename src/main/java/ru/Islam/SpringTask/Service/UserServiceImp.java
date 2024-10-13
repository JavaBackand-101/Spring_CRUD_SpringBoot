package ru.Islam.SpringTask.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.Islam.SpringTask.DAO.UserDAO;
import ru.Islam.SpringTask.models.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserDAO userDao;

    @Autowired
    public UserServiceImp(UserDAO userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }


    @Transactional
    @Override
    public void addUser(User user){
        userDao.addUser(user);
    }


    @Transactional
    @Override
    public void updateUser(User user){
        userDao.updateUser(user);
    }


    @Transactional
    @Override
    public void deleteUser(User user){
        userDao.deleteUser(user);
    }





}

