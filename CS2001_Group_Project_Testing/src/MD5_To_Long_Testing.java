public class MD5_To_Long_Testing
{
	public static void main(String args[])
	{
		String MD5_Hash_Raw = "5f4dcc3b5aa765d61d8327deb882cf99";
		Long User_Id_Seed = Long.valueOf(MD5_Hash_Raw);
		System.out.println(User_Id_Seed);
	}
}