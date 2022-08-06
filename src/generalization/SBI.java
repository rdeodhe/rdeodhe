package generalization;

public class SBI  implements RBI
{

	@Override
	public void savingAccount() {
		System.out.println("savingaccount is complete in SBI");
		
	}

	@Override
	public void RD() {
		
		System.out.println("RD is complete in SBI");
	}

	@Override
	public void FD() {
		
		System.out.println("FD is complete in SBI");
	}
    public void yono()    // yono mobile apllicaton sbi bank
    {
    	System.out.println("SBI own method "); 
    }
}
