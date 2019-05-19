package labs;

public class StudentDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a student
		Student stu1 = new Student("Hozu", "4567876");
		stu1.enroll("Math152");
		stu1.enroll("English252");
		stu1.enroll("Hist253");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.pay(600);
		stu1.checkBalance();
		System.out.println(stu1.toString());;
		
	}
}
	
	 class Student {
		//Properties:
		private static int ID = 1000;
		private String userID;
		private String name;
		private String ssn;
		private String email;
		private int phone;
		private String city;
		private String state;
		private String courses = "";
		private static final int costOfCourse =  800;
		private int balance = 0;
		
		
		//Constructor:
		public Student(String name, String ssn) {
			this.name = name;
			this.ssn = ssn;
			ID++;
			setEmail();
			setUserID();
			
		}
		
		
		public void setEmail() {
			email = name.toLowerCase() + "@spu.com";
			System.out.println("Your email: " + email);
		}
		
		public void setUserID() {
			int max = 9000;
			int min = 1000;
			int random = (int) (Math.random() * (max - min));
			random = random + min;
			System.out.println(random);
			userID = ID + "" + random + ssn.substring(3, 7);
			System.out.println("User ID: " + userID);
		}
		
		
		//Setting variables using encapsulation:
		public void setPhone(int phone) {
			this.phone = phone;
		}
		
		public int getPhone(){
			return phone;
		}
		
		
		public void setCity(String city) {
			this.city = city;
		}
		
		public String getCity() {
			return city;
		}
		
		public void setState(String state){
			this.state = state;
		}
	
		
		public String getState() {
			return state;
		}
		
		// Methods:
		public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		balance = balance + costOfCourse; 
		}
		
		public void pay(int amount) {
			balance = balance - amount;
			System.out.println("Payment: $" + amount);
		}
		
		public void checkBalance() {
			System.out.println("Balance: $" + balance);
		}
		
		@Override
		public String toString() {
			return "[Name: " + name + "]\n[Courses: " + courses + "]\n" + "[Balance: " + balance + "]";
		}
		
		public void showCourses(){
			System.out.println(courses);
		}
		
	}
	
	

