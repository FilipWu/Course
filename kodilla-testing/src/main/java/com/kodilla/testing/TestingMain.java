package com.kodilla.testing;

import calculator.Calculator;
import com.kodilla.testing.learning.Calculating;
import com.kodilla.testing.learning.ForumUser;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;

public class TestingMain {

    public static void main(String[] args) {
        Calculating calculating = new Calculating();
        Double resulting = calculating.addAtoB(5.23,5.17);
        System.out.println(resulting);

        ForumUser newUser = new ForumUser("cukiernik", 12,true,"Filip",
                "waroch","male",26,"f.waroch@gmial.com");
        String username = newUser.getUserName();
        int numberPosts = newUser.getNumberOfPosts();
        boolean isUserLogged = newUser.isLogged();
        String firstName = newUser.getName();
        String secondName = newUser.getSurname();
        String userSex = newUser.getSex();
        int userAge = newUser.getAge();
        String userMail = newUser.getEmail();
        String space = " ";

        System.out.println(username + space + numberPosts + space + isUserLogged +
                space + firstName + space + secondName + space + userSex + space + userAge + space + userMail);
    }
}
