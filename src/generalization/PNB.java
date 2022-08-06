package generalization;

public class PNB implements RBI
{

	@Override
	public void savingAccount() {
		System.out.println("saving account is complted in PNB");
		
	}

	@Override
	public void RD() {
		System.out.println("RD is complted in PNB");
	}

	@Override
	public void FD() {
		
		System.out.println("FD is complted in PNB");
	}

	public void loan()
	{
		System.out.println("own method of PNB");
	}
	
}
