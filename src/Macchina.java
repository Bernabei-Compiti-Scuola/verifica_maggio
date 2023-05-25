public class Macchina extends Thread
{
    private int id;
    private String scuderia;
    private Pilota p;
    private Box bx;


    
    public Macchina(int id, String scuderia, Pilota p) {
        this.id = id;
        this.scuderia = scuderia;
        this.p = p;
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
            int sec=(int) (Math.random()*(4))+1;
            sec=sec*1000;
            System.out.println("GIRO "+i+" completato "+p.getNome());
            if(i==3|| i==6||i==9)
            {
                bx
            }
        }
    }
}
