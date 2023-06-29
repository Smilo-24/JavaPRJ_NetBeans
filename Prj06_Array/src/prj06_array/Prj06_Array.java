

package prj06_array;


public class Prj06_Array {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double[]arrDouble= new double[5];
        
        arrDouble[0]=1.5;
        arrDouble[1]=2.5;
        arrDouble[3]=3.5;
        
        System.out.println(arrDouble[4]);
        
        
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.println(arrDouble[i]);
            
        }
        
        for (double elementi: arrDouble) {
            System.out.println(elementi);
        }
        /******************************************************/
        int []arr=new int[5];
        //popoliamo l'array con l indice del for
        for (int contatore = 0; contatore < 10; contatore++) {
            arr[contatore]=contatore;
        }
        //lo stampiamo
        for (int valori : arr) {
            System.out.println(valori);
        }
        
        
        
        String[]animali={
            "cane","gatto","criceto","giorgio"
        };
        //òunghezza del primo elemento
        int lungh=animali[0].length();
       System.out.println(lungh);
       //calcolare la stringa più lunga  
        String piuLunga=animali[0];
        //s è l indice dell array:i singoli animali all interno del array
        for (String s : animali) {
            if(s.length()>piuLunga.length()){
                piuLunga=s;
            }
        }
        
        System.out.println("la piu lunga e' "+piuLunga);
        
        
        /////////////////////////////////////////////////////////
        
        String stringa="ciao come stai?";
        //come trasformo una stringa in un carattere?
        char[]caratteri=stringa.toCharArray();
        
        for (int i = 0; i < caratteri.length; i++) {
            System.out.println(caratteri[i]);
        }
        
        ////////////////////////////////////////////////////////
        
        /*metodo split*/
        
        String[]arrStringhe=stringa.split(" ");//split vuole metodo separatore. lo spazio va benissimo
        
        //ciclo col foreach
        //questo va bene per separare i dati dai file.
        for (String a : arrStringhe) {
            System.out.println(a);
        }
       
        
        
        
    }

}
