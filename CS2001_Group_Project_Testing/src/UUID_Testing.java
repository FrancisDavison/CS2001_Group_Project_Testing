import java.util.UUID;
public class UUID_Testing
{
	public static void main(String args[])
	{
		for(int i=0;i<100;i++)
		{
			String Unique_Id = UUID.randomUUID().toString();
			System.out.println(Unique_Id);
		}
	}
}