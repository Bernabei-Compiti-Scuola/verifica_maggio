public class Box 
{
    /**
     * Il metodo simula un pit-stop, all'entrata della macchina il pit-stop ha una durata da 1 a 5 secondi
     * @param m Macchina
     */
    public void PitStop(Macchina m) 
    {
        System.out.println(m.getP().getNome()+" ENTRA AL PIT-STOP ");
        int sec=(int) (Math.random()*(5))+1;
        sec=sec*1000;
        try
        {
            Thread.sleep(sec);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("PIT-STOP "+m.getP().getNome()+" FINITO");
    }

}
