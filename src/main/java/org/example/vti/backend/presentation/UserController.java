package org.example.vti.backend.presentation;

import org.example.vti.backend.bussinesslayer.IUserService;
import org.example.vti.backend.bussinesslayer.UserService;
import org.example.vti.entity.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserController {
    private IUserService userService;

    public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        userService = new UserService();
    }

    public List<User> getListUsers() throws SQLException, ClassNotFoundException {

        return userService.getListUsers();
    }

    public User getUserById(int id) throws SQLException, ClassNotFoundException {
        return userService.getUserById(id);
    }

    public int deleteUser(int id) throws ClassNotFoundException, SQLException {
        return userService.deleteUser(id);
    }

    public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
        return userService.isUserIdExits(id);
    }

    public User login(String email, String password) throws Exception {
        return userService.login(email, password);
    }

}