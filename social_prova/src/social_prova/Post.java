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
public class Post {
    
    // attributi
    long id;
    String title;
    String body;
    User autor; 
    protected ArrayList<String> tags = new ArrayList(); // arrayList dei tags;
    
    
    // Costruttori
    Post(){
        
        
    }
    // funzioni
    void show(){
    autor.showAvatar();
    System.out.println(this.title);
    System.out.println(this.body);
    }
    void addTag(String a){
      tags.add(a); // aggiunge un tag all arrayList <tags>
    }
}
