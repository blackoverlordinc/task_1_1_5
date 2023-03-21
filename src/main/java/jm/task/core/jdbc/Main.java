package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        /*User user = new User("Zaur", "Tregulov", (byte)30);
        User user2 = new User("Sergey", "Kadushkin", (byte)24);
       *//* Session session = Util.getSessionFactory().openSession();
        session.save(user);*//*
       *//* Session session = Util.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.save(user2);
        session.getTransaction().commit();*//*
*/

      UserDao userDao = new UserDaoHibernateImpl();
      /*  userDao.saveUser("Sergey", "Kadushkin", (byte)34);
        userDao.saveUser("Leon", "Verdian", (byte)34);
        userDao.saveUser("Arsen", "Petrosov", (byte)34);
        userDao.saveUser("fverve", "rsvcevcec", (byte)34);
        userDao.saveUser("kukold", "ivanovich", (byte)20);
        userDao.saveUser("dcdsvs", "sfvcrsdc", (byte)20);*/
        //userDao.removeUserById(2);
       // userDao.createUsersTable();
        //userDao.dropUsersTable();
        //userDao.createUsersTable();
       // userDao.cleanUsersTable();
        userDao.getAllUsers();
    }

}
