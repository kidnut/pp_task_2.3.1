package web.dao;

import web.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
        return query.getResultList();
    }

//    @Override
//    public List<User> getCarUser(String model, int series) {
//        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery(
//                "from User where userCar.model=:model and userCar.series=:series");
//                "select distinct u from User u join fetch u.userCar c where c.model = :model and c.series = :series", User.class);
//        query.setParameter("model", model);
//        query.setParameter("series", series);
//        return query.getResultList();
//    }
}