class Multithread02 extends Thread
  {
    public void run()
    {
      for(int i=1;i<=10;i++)
        {
          if(i%2==0)
          {
            try{
              Thread.sleep(1000);
            }
            catch(Exception ex)
              {
                System.out.println(ex);
              }
            System.out.println(i);
          }
        }
    }
  }
class SleepThread
  {
    public static void main(String[]args)
    {
      Multithread02 t=new Multithread02();
        Multithread02 t1=new Multithread02();
        Multithread02 t2=new Multithread02();
      t.start();
      t1.start();
      t2.start();
    }
  }