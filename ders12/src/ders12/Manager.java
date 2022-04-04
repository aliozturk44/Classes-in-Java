package ders12;

public class Manager extends Employee{
	private int num_of_employees;
	
	public Manager(String name, String department, int salary,int num_of_employees) {
		super(name, department, salary);
		this.num_of_employees=num_of_employees;
		
	}
	
	
	public void riseSalary(int amount) {
		System.out.println("�al��anlar�n maa��na "+amount+" tl zam yap�lm��t�r");
	}


	@Override
	public void showInfos() {
		super.showInfos();
		System.out.println("�al��an ki�i say�s�: "+ this.num_of_employees);
	}
	
	

}
