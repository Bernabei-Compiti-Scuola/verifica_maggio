public class Box 
{
    /**
     * 
     * @param m
     */
    public void PitStop(Macchina m) 
    {
        System.out.println(m.getP().getNome()+" ENTRA AL PIT-STOP ");
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
        System.out.println("PIT-STOP "+m.getP().getNome()+" FINITO");
    }

}
