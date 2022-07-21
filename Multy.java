class Multithread extends Thread
  {
    public void run()
    {
      System.out.println("Using thread");
    }
  }
class Multy
  {
    public static void main(String[]args)
    {
      Multithread t=new Multithread();
      t.start();
      System.out.println(t.getName());
    }
  }