package BE;

public class Drinks_Order {
	private String C_id;
	private String M_id;
	private int amount;
	public Drinks_Order() {
		super();
		C_id = "";
		M_id = "";
		amount = 0;
	}
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	public String getM_id() {
		return M_id;
	}
	public void setM_id(String m_id) {
		M_id = m_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
