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
public class Social_prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Utente ut_1 = new Utente("Pluto");
        Utente ut_2 = new Utente("Paperino");
        Utente ut_3 = new Utente();
        Utente ut_4 = new Utente("Elio");
        
       
        
        Utente ut_arr[] = new Utente[20];
        for (int x=0;x<ut_arr.length;x++){
           ut_arr[x]= new Utente("sonoIlNumero_"+x);
         }
        
        for (int x=0;x<ut_arr.length;x++){
            ut_arr[x].showname();
         }
         
        //System.out.println("nome utente: "+ ut_1.name);
        //System.out.println("nome utente: "+ ut_3.name);
        
        ut_4.showname();
        ut_3.showname();
        
        // studenti
        
         Utente ut_stud_1 = new Student(4,"sifone");
         
         System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
         ut_stud_1.showname();
         ((Student)ut_stud_1).showMatricle();
         System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
         
         ut_4.showname();
          System.out.println("<-<-<-<-<-");
         ut_stud_1.showname();


         
    }
    
}
