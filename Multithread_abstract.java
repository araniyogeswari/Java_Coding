class Process extends Thread
{
    public void run()
    {
        for (int i = 1; i < 5; i++) 
        {
            System.out.println("Laps:"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }    
        }
    }
}
public class Multithread_abstract 
{
    public static void main(String[] args) throws InterruptedException
    {
        Process P = new Process();
        System.out.println(P.isAlive());
        P.start();
        for (int i = 1; i < 13; i++) 
        {
            System.out.println("HeadCount:"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(P.isAlive());
        }
        Thread.sleep(2000);
        System.out.println(P.isAlive());
    }    
}