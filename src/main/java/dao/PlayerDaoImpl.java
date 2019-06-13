package dao;

import models.Player;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateSessionFactoryUtil;

import java.util.List;

public class PlayerDaoImpl implements PlayerDao {
    public void add(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(player);
        tx.commit();
        session.close();
    }

    public Player getById(Integer id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Player player = session.get(Player.class, id);
        session.close();
        return player;
    }

    public List<Player> getAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Player> list = (List<Player>) session.createQuery("From Player").list();
        session.close();
        return list;
    }

    public void update(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(player);
        tx.commit();
        session.close();
    }

    public void updateAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Player> list = (List<Player>) session.createQuery("From Player").list();
        Transaction tx = session.beginTransaction();
        session.update(list);
        tx.commit();
        session.close();
    }

    public void remove(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(player);
        tx.commit();
        session.close();
    }

    public void removeAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Player> list = (List<Player>) session.createQuery("From Player").list();
        Transaction tx = session.beginTransaction();
        for (Player player : list) session.delete(player);
        tx.commit();
        session.close();
    }
}
