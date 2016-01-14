package com.example.yunus.trakyadepo.Model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by yunus on 11.01.2016.
 */


@Table(name = "Auth")
public class Auth extends Model {

    // Notice how we specifie-d the name of our column here
    @Column(name = "Kullanici_adi")
    public String kullanici_adi;

    // Notice how we specified the name of our column here
    @Column(name = "sifre")
    public int sifre;

    public Auth() {
        // Notice how super() has been called to perform default initialization
        // of our Model subclass
        super();
    }

    public Auth(String Kullanici_adi, int sifre) {
        super();

        this.kullanici_adi = Kullanici_adi;
        this.sifre = sifre;
    }
}
