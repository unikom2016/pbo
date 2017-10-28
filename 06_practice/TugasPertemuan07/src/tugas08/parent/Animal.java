package tugas08.parent;

public abstract class Animal
{
   public void eat(String food)
   {
        // do something with food....
       System.out.println(this.getClass().getSimpleName() + " eat " + food);
   }

   public void sleep(int hours)
   {
        try
	{
		// 1000 milliseconds * 60 seconds * 60 minutes * hours
		Thread.sleep ( 1000 * 60 * 60 * hours);
	}
	catch (InterruptedException ie) { /* ignore */ }
   }

   public abstract void makeNoise();
}
