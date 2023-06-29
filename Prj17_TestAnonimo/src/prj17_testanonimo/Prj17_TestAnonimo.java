package prj17_testanonimo;

public class Prj17_TestAnonimo {

    public static void main(String[] args) {
        // TODO code application logic here

        Anonima a = new Anonima();
        a.saluta();
        a.mangia();

        Anonima b = new Anonima();
        b.saluta();
        b.mangia();

        //non tocco la classe ma costruisco il saluto nel main
        Anonima c = new Anonima() {
            //sovrascrivo il metodo con un void

            @Override
            public void saluta() {
                System.out.println("hello world");
            }

        };//obbligatorio il punto e virgola

        c.saluta();

        Anonima d = new Anonima() {
            //sovrascrivo il metodo con un void

            @Override
            public void saluta() {
                System.out.println("bonjour monde");
                canta();
            }
            //metodo che serve solo per le cose che posso fare all interno

            public void canta() {
                System.out.println("i m a single lady lalala");
            }
        };//obbligatorio il punto e virgola
        d.saluta();
    }

}
