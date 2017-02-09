/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social_prova;

import java.util.ArrayList;

/**
 *
 * @author utente
 */
public class Circle {
    
    
    // attributi
   long id;
   String title;
   protected ArrayList<User> us = new ArrayList(); // arrayList che conterra' gli utenti apparteneti alla cerchia;
   protected ArrayList<Post> posts = new ArrayList(); // arrayList che conterra' i posts appartenenti alla cerchia;
    // Costruttori
    Circle(String titlee){
        this.title = titlee;   
    }
    // funzioni
    void publish(Post p){
        posts.add(p); // aggiunge un posts all arrayList <posts>
    }
    void withdraw(long post_id){
        for (int i = 1; i < us.size(); i++){ 
                Post psCorr = posts.get(i);
                if (psCorr.id == post_id){
                    posts.remove(i);
                    break;
                    }
                }
    }
    void add(User u){
        us.add(u); // aggiunge un utente all arrayList <us>
    }
    void remove(User u){ // devo eliminare l'utente in ingresso dall arrayList <us>;
        for (int i = 1; i < us.size(); i++){ 
            User usCorr = us.get(i);
            if (usCorr.id == u.id){
                us.remove(i);
                break;
                }
            }
    }
    void showWall(){
        System.out.println("-"+this.title+"-");
        /*
        for (int a = 0; a < posts.size(); a++){
            
        }
        */
    }
    void showUserList(){
        for (int x = 0; x < us.size(); x++){
            User usCorr = us.get(x);
            if(usCorr != null)
            usCorr.showProfile();
        }
    }           
}
