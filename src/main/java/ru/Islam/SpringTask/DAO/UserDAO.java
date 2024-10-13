package ru.Islam.SpringTask.DAO;

import ru.Islam.SpringTask.models.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
}