package com.universe.DAO.Registry;

import com.universe.Entity.Account;
import com.universe.Entity.Friend;
import com.universe.Tools.DAOTools;
import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by boduill on 15.12.15.
 */
@Repository
public class FriendsDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Autowired DAOTools daoTools;

    public void addFriend() {

    }

    @Transactional
    public List<Account> getAccountFriends(final Account account) {
        long id = account.getId();
        List<Friend> list = (List<Friend>) hibernateTemplate.find("FROM Friend " +
                "WHERE acc_id = ? OR friend = ?", id, id);

        return daoTools.getFriendsAccountsFromFriendList(list);
    }
}
