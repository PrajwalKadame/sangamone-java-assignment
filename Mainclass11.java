class Phonepay
{
	private int amt=5000;
	public int getAmt() {
		return amt;
	}
	
	public void setAmt(int amt) {
		this.amt=amt;
	}
	
}

public class Mainclass11{
	public static void main(String[] args) {
	phonepay p1=new Phonepay();
	System.out.println(p1.getAmt());
	p1.setAmt(10000);
	System.out.println(p1.getAmt());
	}
}