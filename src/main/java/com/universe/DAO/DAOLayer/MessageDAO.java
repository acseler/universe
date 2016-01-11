package com.universe.DAO.DAOLayer;

import com.universe.Entity.Account;
import com.universe.Entity.Dialog;
import com.universe.Entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by boduill on 04.01.16.
 */
@Repository
public class MessageDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<Message> getMessages(Long dialogId) {
        return (List<Message>) hibernateTemplate.find("FROM Message WHERE dial_id = ? ORDER BY message_time ASC", dialogId);
    }
}
