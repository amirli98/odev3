package com;

import com.entities.Instructor;
import com.managers.InstructorManager;
import com.managers.UserManager;

public class Main {
    public static void main(String[] args) {
        //don't uncomment following lines
       /* Instructor instructor = new Instructor(
                            1
                            , "Engin"
                            , "Demirog"
                            , "engin123@mail.ru"
                            , "test"
                            , "0 dan sektorun yukseklerine"
                            , 6d );*/
        Instructor instructor = new Instructor(1,"Engin", "Demirog", "kodlamaio@engin.com", "password","Java Programming",4.9d);
        UserManager manager = new InstructorManager();
        manager.printUserInfo(instructor);
    }
}
