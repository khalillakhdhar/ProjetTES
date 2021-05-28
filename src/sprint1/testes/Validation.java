package sprint1.testes;

public class Validation {
public boolean validaccess(String accessdata)
{
if(accessdata.length()>=12)
{
return true;	
}
else 
	return false;

}
public boolean verifchaine(String ch)
{
return !ch.isBlank();	
}
public boolean verifmail(String mail)
{
	if(mail.contains(".")&&(mail.contains("@")))
	{
		return true;
		
		
	}
	else return false;
}
}
