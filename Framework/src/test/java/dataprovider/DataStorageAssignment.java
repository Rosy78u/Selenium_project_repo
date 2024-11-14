package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorageAssignment {
	public class DataStorage {
		@DataProvider
		public String[][] registerData()
		{
			String[][] data = {
					
					{"Kati", "Sahoo", "katisahoo226@gmail.com","kati@123","kati@123"},
					{"Jasmin ", "Sahoo", "jasminsahoo226@gmail.com","jasmin@123","jasmin@123"},
					{"Rosy ", "Sahoo", "jasminsahoo456@gmail.com","jasmin@456","jasmin@456"},
					{"Mama", "Das", "rashmi226@gmail.com","rashmi@123","rashmi@123"},
			};
			return data;
			}
		}
			
		

}


