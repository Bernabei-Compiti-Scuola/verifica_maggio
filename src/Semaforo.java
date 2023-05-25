public class Semaforo 
{
    private int valore;

    /**
     * 
     * @param valore
     */
    public Semaforo(int valore) {
        this.valore = valore;
    }

    
    public int getValore() {
        return valore;
    }

    
    public void setValore(int valore) {
        this.valore = valore;
    }

    /**
     * gestisce l'accesso alle risorse con un semaforo che ha comne valore x>1 => verde o x=0 => rosso
     */
    public synchronized void P() 
    {
        while (valore == 0) {
            try 
            {
                System.out.println("-------"+Thread.currentThread().getName() + "in attesa-------");
                wait();
            } catch (Exception e) 
            
            {
                System.out.println("malfunzionamento");
            }
        }
        valore = 0; 
    }
    /**
     * setta il semaforo a verde e risveglia eventuali thread
     */
    public synchronized void V() 
    {
        valore = 1; 
        notify(); 
    }
}
