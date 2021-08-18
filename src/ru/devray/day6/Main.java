package ru.devray.day6;

import ru.devray.day6.generic.GenericBox;
import ru.devray.day6.generic.OldBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
        //int[]
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.setT("sdfsdf");

        OldBox oldBox = new OldBox();
        oldBox.setObject(new Integer(5));

        System.out.println(((String)oldBox.getObject()).getBytes()) ;
        System.out.println(  genericBox.getT().getBytes()   ) ;

    }

    public static void login(User user){
        //
        if (user.password.isEmpty()){
            throw new InvalidPasswordException("Password is empty");
        } else if (user.isSuspended) {
            throw new AccountSuspendedException("Account is blocked, please use another one.");
        }
        System.out.println("Logged on succesfully");
    }

}
