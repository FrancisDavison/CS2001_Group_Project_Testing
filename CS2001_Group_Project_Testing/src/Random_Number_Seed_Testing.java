import java.util.Random;
public class Random_Number_Seed_Testing
{
	public static void main(String args[])
	{
		int Seed=1;
		Random rand = new Random();
		rand.setSeed(Seed);
		Integer Rand_Seed_Test=Math.abs(rand.nextInt()%256);
		System.out.println(Rand_Seed_Test);
	}
}