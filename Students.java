package Students;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student is 10009");
	

	}
	public void getStudentInfo(int id,String name) {
		// TODO Auto-generated method stub
		System.out.println("Student is 101229");
		System.out.println("Name is Muthukmaran");

	}
	public void getStudentInfo(String email ,int phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Student Emdil is muthukumaran0510@gmail.com");
		System.out.println("Phone number is  9787875054");
	}
	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo(0);
		stu.getStudentInfo(0, null);
		stu.getStudentInfo(null, 0);
		
	}

}
