/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social_prova;

import java.util.Date;

/**
 *
 * @author utente
 */
public class User {

// attributi
    static long prev_id = 0; // incrementazione automatica pt1
    long id;
    String name;
    Date birth;
    String avatar;
    
    // Costruttori
    User(String name, Date birth){
        prev_id ++; // incrementazione automatica pt2
    }
    // funzioni
    void age(){
    
    }
    void showAvatar(){
    System.out.println(this.avatar);
    }
    void showProfile(){
    System.out.println(this.name);
    System.out.println(this.birth);
    }
   
}
