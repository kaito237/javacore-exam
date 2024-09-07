package org.example.vti.backend.bussinesslayer;

import org.example.vti.backend.datalayer.IUserRepository;
import org.example.vti.backend.datalayer.UserRepository;
import org.example.vti.entity.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {

    private IUserRepository userRepository;

    public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        userRepository = new UserRepository();
    }

    @Override
    public List<User> getListUsers() throws SQLException, ClassNotFoundException {
        return userRepository.getListUsers();
    }

    @Override
    public User getUserById(int id) throws SQLException, ClassNotFoundException {
        return userRepository.getUserById(id);
    }

    @Override
    public int deleteUser(int id) throws ClassNotFoundException, SQLException {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
        return userRepository.isUserIdExits(id);
    }

    @Override
    public User login(String email, String password) throws Exception {
        return userRepository.login(email, password);
    }

}