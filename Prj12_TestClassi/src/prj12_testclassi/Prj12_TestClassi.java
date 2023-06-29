

package prj12_testclassi;


public class Prj12_TestClassi {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gatto g= new Gatto("Piero","Perù",2);
        
        System.out.println(g);
        g.miagola();
        
        //cambio nome al gatto
        g.setNome("Giorgio");
        System.out.println(g);//Stampo il toString
        ////////////////////////////////////////////
        Macchina m = new Macchina("Mercedezi","si",10000,150000);
        System.out.println(m);
        m.guida(10);
        m.frena();
        
        //////////////////////////////////////////////////////
        
        Studente s= new Studente ("Mario","Verdi",1);
        s.setVoto1(18);
        s.setVoto2(24);
        s.setVoto3(12);
        
        double media=s.mediaVoti();//per salvare la media
        
        System.out.println(media>=18?"promosso":"bocciato");
                
        
    }

}
