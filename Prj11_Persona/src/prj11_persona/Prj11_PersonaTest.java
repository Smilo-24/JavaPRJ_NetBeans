package prj11_persona;

public class Prj11_PersonaTest {

    //1: incapsulamento 
    //Per sicurezza e quindi metto dentro una capsula le informazioni importanti di una classe
    //cosi che non siano accessibili dall esterno. ora che ho incapsulato tutto non posso usare gli attributi di Persona
    //Ho bisogno di Get and Set -> quindi per fare la modifica ho un solo punto per modificarla e richiamarla e vale per tutti e questa è una bomba.
    //2:
    public static void main(String[] args) {
        // TODO code application logic here

        int x = 10;
        Persona persona1 = new Persona();
        /*
        persona1.cognome = "Rossi";
        persona1.nome = "Mario";
        persona1.eta = 20;
        persona1.maggiorenne = true;
         */
        //persona1.info();
        
        persona1.setNome("Mario");
        persona1.setCognome("Mario");
        persona1.setEta(20);
        persona1.setMaggiorenne(true);
        
        
        
        
        
        
        System.out.println(persona1.isMaggiorenne());

        //////////////////////////////////////////////
        Persona persona2 = new Persona("Aldo", "Giovanni", 30);
        //persona2.info();

        Persona persona3 = new Persona("Giuseppe", "Verdi");
        //persona3.eta = 99;
        //persona3.info();

        //confronto mario con giuseppe
        //persona 3 è l object. l oggetto lo casto a persona perché obj è di tipo generico
        //in questo caso confronto 2 oggetti e decido quando sono uguali.
        persona1.equals(persona3);

        //lo metto dentro un sout che torna un booleano
        //persona1 è uguale a persona3?
        System.out.println(persona1.equals(persona3));

    }

}
