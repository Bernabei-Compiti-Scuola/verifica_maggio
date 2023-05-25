public class Macchina extends Thread
{
    private int id;
    private String scuderia;
    private Pilota p;
    private Box bx;
    private Semaforo s;

    public Macchina(int id, String scuderia, Pilota p, Box bx, Semaforo s) {
        this.id = id;
        this.scuderia = scuderia;
        this.p = p;
        this.bx = bx;
        this.s = s;
        this.setName(p.getNome());
    }

    public long getId() {
        return id;
    }
    public String getScuderia() {
        return scuderia;
    }
    public Pilota getP() {
        return p;
    }

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
                int ssec=(int) (Math.random()*(4))+1;
                ssec=ssec*1000;
                try
                {
                    Thread.sleep(ssec);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                bx.PitStop(this);
                s.V();
            }
        }
    }
}
