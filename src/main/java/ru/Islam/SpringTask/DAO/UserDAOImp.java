package ru.Islam.SpringTask.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.Islam.SpringTask.models.User;

import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<User> getAllUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }


    @Override
    public void addUser(User user) {
        em.persist(user);

    }

    @Override
    public void updateUser(User user) {
        em.merge(user);
    }


    @Override
    public void deleteUser(User user) {
        em.remove(user);
    }
}
