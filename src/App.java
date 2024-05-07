public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Pilota p1=new Pilota("perez");
        Pilota p2=new Pilota("bottas");
        Pilota p3=new Pilota("Hamilton");
        Pilota p4=new Pilota("Leclerc");
        Pilota p5=new Pilota("pippo");

        Semaforo s=new Semaforo(1);
        Box bx=new Box();
        Macchina m1=new Macchina(1, "s1", p1, bx, s);
        Macchina m2=new Macchina(2, "s2", p2, bx, s);
        Macchina m3=new Macchina(3, "s3", p3, bx, s);
        Macchina m4=new Macchina(4, "s4", p4, bx, s);
        Macchina m5=new Macchina(5, "s5", p5, bx, s);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();

        /* 
            la funzione join() blocca il chiamante fino a che il thread sul quale
            si chiama join() non termina la propria esecuzione
        */
        m1.join();
        m2.join();
        m3.join();
        m4.join();
        m5.join();
        
        System.out.println("gara finita");
    }
}