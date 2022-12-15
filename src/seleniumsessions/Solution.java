package seleniumsessions;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="AAAADDDCCCA";
StringBuilder res=new StringBuilder();
int count=1;
Character previousCharacter=input.charAt(0);
for(int i=1;i<input.length();i++)
{ 
	char currentChar=input.charAt(i);
	if(currentChar!=previousCharacter)
	{
		res.append(previousCharacter.toString()+count);
		previousCharacter=currentChar;
		count=1;
	}else 
	{
		count++;
		
	}
			
}
res.append(previousCharacter.toString()+count);
System.out.println(res);
	}

}
