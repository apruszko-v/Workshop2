package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.SQLOutput;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();

//  dodawanie nowego usera do bazy
//        user.setUserName("an");
//        user.setEmail("apruszko@v.pl");
//        user.setPassword("pass");
//        userDao.create(user);

//  czytanie obiektu user
//        User read = userDao.read(3);
//        System.out.println(read);

//  update usera
//        User userToUpdate = userDao.read(3);
//        userToUpdate.setUserName("martaa");
//        userToUpdate.setEmail("apruszkoapruszko@vp.pl");
//        userToUpdate.setPassword("coderslabb");
//        userDao.update(userToUpdate);

//  findAll
//        User secondUser = new User();
//        secondUser.setUserName("marta");
//        secondUser.setEmail("marta@v.pl");
//        secondUser.setPassword("password");
//
//        userDao.create(secondUser);
//
//        User[] all = userDao.findAll();
//
//        for(User u : all) {
//            System.out.println(u);
//        }
//  usuwanie
//        userDao.delete(2);
    }
}
