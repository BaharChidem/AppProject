package com.example.degreeplanner;

import android.view.View;

import java.util.ArrayList;

public interface Contract {
    public interface Model{

//        public boolean ru_there(String email);
////      public boolean check_null();
//        public int data(String email);
//        public void addtoArrL();
        public int login_btn(String email,String pass);
    }
    public interface View2 {

        void OnError(String email_required);
//        public void doWork();
////        public void display();
//      public String get_email();
//      public String get_pass();

//        void onClick(android.view.View view);
//    }
    }
    public interface Presenter{
//        public int log(String email);
//        public boolean ruthere(String email);
        public int isAdm(String email);
        public int login(String email,String pass);

        public int error_msg(String email_str, String pass_str);
        public int error_toast(String email_str, String pass_str);

    }
}
