public class Macchina extends Thread
{
    private int id;
    private String scuderia;
    private Pilota p;
    private Box bx;
    private Semaforo s;
    /**
     * 
     * @param id
     * @param scuderia
     * @param p
     * @param bx
     * @param s
     */
    public Macchina(int id, String scuderia, Pilota p, Box bx, Semaforo s) {
        this.id = id;
        this.scuderia = scuderia;
        this.p = p;
        this.bx = bx;
        this.s = s;
        this.setName(p.getNome());
    }
    /**
     * @return id della macchina
     */
    public long getId() {
        return id;
    }
    /**
     * 
     * @return scuderia della macchina
     */
    public String getScuderia() {
        return scuderia;
    }
    /**
     * 
     * @return il pilota
     */
    public Pilota getP() {
        return p;
    }
    /**
     * fa partire il thread, cioè gestisce i giri e i pit-stop
     */
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            int sec=(int) (Math.random()*(3))+1;
            sec=sec*1000;
            try 
            {
                Thread.sleep(sec);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println("GIRO-"+i+" completato "+p.getNome());
            if(i==3|| i==6||i==9)
            {
                s.P();
                
                bx.PitStop(this);
                s.V();
            }
        }
    }
}
