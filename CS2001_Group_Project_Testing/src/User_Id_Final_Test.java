import java.util.UUID;

public class User_Id_Final_Test
{
	public static void main(String args[])
	{
		String Unique_Id = UUID.randomUUID().toString();
		System.out.println(Unique_Id);
	}
}