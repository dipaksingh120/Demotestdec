package seleniumsessions;

public class FrequencyCharacter 
{

	public static void main(String[] args)
	{
		String str="AAA A DD DCCCA";
		int freq[]=new int[str.length()];
		int i,j;
		char string[]=str.toCharArray();
		
		for(i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(j=i+1;j<=str.length()-1;j++) {
				if(string[i]==string[j])
				{
				freq[i]++;
				string[j]='0';
				}}
	
		}
		for(i=0;i<freq.length;i++)
		{
			if (string[i]!='0')
			System.out.println(string[i]+":"+freq[i]);
		}
		// TODO Auto-generated method stub

	}

}
