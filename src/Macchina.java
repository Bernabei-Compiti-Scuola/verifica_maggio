/**
 * La classe rappresenta e gestisce una macchina
 * Simula una gara composta da 10 giri di pista
 * 
 * @author IacopoLibero
 */
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
     * Metodo run che simula una gara da 10 giri di pista
     * La vettura per ogni giro di pista impiega un tempo random da 1 a 4 secondi(simulare con uno Sleep)
     * Ogni 3 giri viene usata la risorsa box per fare il pitstop
     */
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            if(i%3==0 && i>0)
            {
                s.P();
                    bx.PitStop(this);
                s.V();
            }
            int sec=(int) (Math.random()*4)+1;
            sec=sec*1000;
            try 
            {
                Thread.sleep(sec);
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
            System.out.println("GIRO-"+(i+1)+" completato "+p.getNome());
        }
    }
    
}
