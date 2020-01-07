package com.jsp.dao;

import com.jsp.user.User;

/**
 * @author
 */
public class UserDao {
    public boolean  userLogin(User user) {
        return "admin".equals(user.getUsername()) & "admin".equals(user.getPassword());
    }
}
