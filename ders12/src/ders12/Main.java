package ders12;

public class Main {

	public static void main(String[] args) {
     /* Employee employee =new Employee("ali �zt�rk","computer science",8000); 
		
		employee.showInfos(); */
		
		Manager manager=new Manager("ali �zt�rk","computer science",8000,10);
		manager.showInfos();
		manager.riseSalary(100);
	}

}
