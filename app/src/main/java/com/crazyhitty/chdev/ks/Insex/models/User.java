package com.crazyhitty.chdev.ks.Insex.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Author: Kartik Sharma
 * Created on: 9/1/2016 , 8:35 PM
 * Project: FirebaseChat
 */

@IgnoreExtraProperties
public class User {
    public String uid;
    public String email;
    public String firebaseToken;
    public String apelido;

    //NAO APAGAR ESTE METODO. ESTÁ SENDO USADO
    public User() {
    }

    public User(String uid, String email, String firebaseToken,String apelido) {
        this.uid = uid;
        this.email = email;
        this.firebaseToken = firebaseToken;
        this.apelido = apelido;

    }
}
