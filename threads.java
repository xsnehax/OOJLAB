class Thread1 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<10)
        {
            try
            {
               Thread.sleep(10000);
               System.out.println("BMS College of Engineering");
            } 
            catch(Exception e) 
            {
                System.out.println("Exception:"+e);
            }
            i++;
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<10)
        {
            try
            {
               Thread.sleep(2000);
               System.out.println("CSE");
            } 
            catch(Exception e) 
            {
                System.out.println("Exception:"+e);
            }
            i++;
        }
    }
}
public class Try
{
    public static void main(String args[])
    {
        Thread t1=new Thread1();
        Thread t2=new Thread2();
        t1.start();
        t2.start();
    }
}