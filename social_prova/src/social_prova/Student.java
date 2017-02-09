/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social_prova;

/**
 *
 * @author utente
 */
public class Student extends Utente {
    
    double matricola;
    double crediti = 4 ;
    Student (double matricola, String name){
        super (name);
        this.matricola = matricola + 4;
        
    }
    public void showMatricle(){
    System.out.println("io sono la matricola : "+this.matricola);
    }
  // super.showname();
    
    
           // @Override
    public void showname(){
         super.showname();
        //System.out.println("il mio nome e' : "+this.name+", sono uno studente e ho "+crediti+" crediti");
        }
    
    

      // super (public void showname());
       
}
