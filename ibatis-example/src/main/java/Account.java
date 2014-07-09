
/*
public class Account {
    private final int _identity;
    private final String _name;
    private final String _password;
    private final float _balance;
    private final String _resident;

    public Account(int identity, String name, String password, float balance, String resident) {
        _identity = identity;
        _name = name;
        _password = password;
        _balance = balance;
        _resident = resident;
    }

    public String toString() {
        return "identity: " + _identity + ", name: " + _name + ", password: " + _password 
            + ", balance: " + _balance + ", resident: " + _resident;
    }
}
*/

public class Account {
	private String name;
	private Float balance;
	private String resident;

	public String getName() {
		return name;
	}

	public Float getBalance() {
		return balance;
	}

	public String getResident() {
		return resident;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public void setBalance(Float balance) {
		this.balance = balance;
	}		

	public void setResident(String resident) {
		this.resident = resident;
	}

    public String toString() {
        return "name: " + name + ", balance: " + balance + ", resident: " + resident;
    }
}
