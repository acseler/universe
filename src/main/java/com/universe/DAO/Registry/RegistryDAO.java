package com.universe.DAO.Registry;

import com.universe.Entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boduill on 23.09.15.
 * DAO class for user registration
 */
@Repository
public class RegistryDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    /**
     * Method which add info about new account, universe, login into database
     * @param login - login entity
     */
    @Transactional
    public void createAccount(Login login) {
        hibernateTemplate.persist(login);

    }

    /**
     * Method which check, whether there is the same login int the database
     * @param name - Login value
     * @return - Line, which contains true or false
     * */
    @Transactional
    public String checkLoginName(String name) {
        List<?> logins = new ArrayList<>();
        logins = hibernateTemplate.find("from Login where login = ?", name);
        return logins.isEmpty() ? "true" : "false";
    }
}
