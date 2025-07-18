package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.SQLOutput;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();

//  dodawanie nowego usera do bazy
//        user.setUserName("Anna");
//        user.setEmail("anna@vp.pl");
//        user.setPassword("haslo");
//        userDao.create(user);

//        user.setUserName("Kasia");
//        user.setEmail("kasia@vp.pl");
//        user.setPassword("hasloo");
//        userDao.create(user);

//  czytanie obiektu user
//        User read = userDao.read(3);
//        System.out.println(read);

//  update usera
//        User userToUpdate = userDao.read(2);
//        userToUpdate.setUserName("marta");
//        userToUpdate.setEmail("marta@vp.pl");
//        userToUpdate.setPassword("coderslab");
//        userDao.update(userToUpdate);

//  findAll
//        User secondUser = new User();
//        secondUser.setUserName("marta");
//        secondUser.setEmail("marta@vp.pl");
//        secondUser.setPassword("coderslab");
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
