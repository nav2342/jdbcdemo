package oopsdemo4;
// multiple interface implementation - multiple inheritence
public class StudentDetails implements CollegeData,HostelData {

	College c1=new College("Mary",500,"Delhi University","MCA");
	Hostel h1=new Hostel("ram","Block-A");
	@Override
	public void collegeDetail() {
		System.out.println("***college details***");
		System.out.println("college name :"+c1.getName());
		System.out.println("college id :"+c1.getId());
		System.out.println("university :"+c1.getCourse());
		
		
	}

	@Override
	public void studentData() {
		System.out.println("Students can join courses :MCA,BTECH");
		
	}

	@Override
	public void hostelDetail() {
		System.out.println("***Hostel Details***");
		System.out.println("Hostel Name :"+h1.getName());
		System.out.println("Location :"+h1.getLocation());
	}

	@Override
	public void studentRecord() {
		System.out.println("students selected on %");
		
	}

	public static void main(String[] args) {
		StudentDetails s1=new StudentDetails();
		s1.collegeDetail();
		s1.hostelDetail();
		s1.studentData();
		s1.studentRecord();
		
	}

}
