public class Semaforo {

    private int valore;

    
    public Semaforo(int valore) {
        this.valore = valore;
    }

    
    public int getValore() {
        return valore;
    }

    
    public void setValore(int valore) {
        this.valore = valore;
    }

    
    public synchronized void P() 
    {
        while (valore == 0) {
            try 
            {
                Thread.currentThread().setName();
                System.out.println(Thread.currentThread().getName() + "in attesa");
                wait();
            } catch (Exception e) 
            
            {
                System.out.println("malfunzionamento");
            }
        }
        valore = 0; 
    }
    
    public synchronized void V() 
    {
        valore = 1; 
        notify(); 
    }
}
