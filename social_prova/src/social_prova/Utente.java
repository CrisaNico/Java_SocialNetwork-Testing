package social_prova;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utente
 */
public class Utente {
   int id;
   public String name;
   int birth;
   int avatar;
        public Utente(String name) {
            this.name = name ; 
        }
        public Utente() {
            this.name = "SENZANOME" ; 
        }
        
        public void showname(){
        System.out.println("il mio nome e' : "+this.name);
        }
}
