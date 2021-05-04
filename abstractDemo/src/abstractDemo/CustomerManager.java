package abstractDemo;

public class CustomerManager {
	
	//STRATEGIC PATTERN 
	
	BaseDatabaseManager dataBaseManager;
	
	public void getCustomers() {
		dataBaseManager.getData();
	}

}
