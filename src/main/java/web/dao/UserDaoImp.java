package web.dao;

import web.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }


    @Override
    public List<User> getUsers() {
        return entityManager.createQuery(
                "SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public void removeUserById(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}