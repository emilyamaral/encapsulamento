/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author IFSC
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class Agenda {
        
    
    private int dia;
    private int mes;
    int ano;
    string anotacao;
    
   private void anote(int d,int m, String nota){
        dia= d;
        mes= m;
        anotacao= nota;
    }
    private void validaData(){
        if((dia<1)||(dia>31)||(mes<1)||(mes<12))
            dia=0;
        mes=0;
        anotacao="Anotação não inserida"
                +"Devido a data invalida";
    }
    
    public void mostraAnotacao(){
        System.out.println(dia+"/"+mes" i"+anotacao);
        
}
