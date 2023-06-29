

package prj08_arraylist;

import java.util.ArrayList;


public class Prj08_ArrayList {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //collection
        //non accettano i tipi primitivi
        
        ArrayList<Character>lettere =new ArrayList<>();
        
        lettere.add('a');        
        lettere.add('b');        
        lettere.add('c');      
        
        System.out.println(lettere);
        
        lettere.add(0,'d');
        
        System.out.println(lettere);
        
        System.out.println("elemento in posizione 2 "+ lettere.get(2));
        
        //dimensione dell arrayList
        System.out.println("dimensione"+lettere.size());
        
        
        
        for (int i = 0; i < lettere.size(); i++) {
            System.out.println(lettere.get(i));        
        }
        
        //stampa col foreach
        
        for (Character caratteri : lettere) {
            System.out.println(caratteri);
        }
        
        //funzione di callback, una funzione come parametro di ingresso di un'altra funzione
        lettere.forEach(/*si mette in una funzione*/caratteri->System.out.println(caratteri));
        
        
        
        ArrayList<String> Lista = new ArrayList<>();
        
        Lista.add("Piero");
        Lista.add("Pelu");
        Lista.add("Aiutaci");
        Lista.add("Tu");
        Lista.add("e' una vita");
        Lista.add("di stenti");
        Lista.add("e sacrifici");
        
        System.out.println(Lista);
        
        for (String Piero : Lista) {
            System.out.println(Piero);
        }
        
        for (int i = 0; i < Lista.size(); i++) {
            
        }
       
        
        //funzione di callback
        Lista.forEach(Piero->System.out.println(Piero));
        
        //method reference
        
        Lista.forEach(System.out::println);
        
        //rimuovere un elemento dalla collezione
        Lista.remove("di stenti");
    
        Lista.set(3,"Pierin");
        
        System.out.println(Lista);
        
        //fine del main
        
    }

    
    
    static void stampaPiero(ArrayList Piero){
        
        Piero.forEach(System.out::println);
    }
    
    //una rubrica di nomi di persona
    
    
    
    
}
