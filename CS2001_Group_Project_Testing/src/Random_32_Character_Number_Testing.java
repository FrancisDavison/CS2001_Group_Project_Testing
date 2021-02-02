import java.util.Random;
public class Random_32_Character_Number_Testing
{
	public static void main(String args[])
	{
		int seed=1;
		Random rand=new Random();
		rand.setSeed(seed);
		long Rand_Long_Seed_Test=Math.abs(rand.nextLong());
		System.out.println(Rand_Long_Seed_Test);
	}
}