package database;

import domain.User;

/**
 * Created by User on 2016.11.29..
 */
public interface UserDAO {
    void create(User user) throws DBException;
}
