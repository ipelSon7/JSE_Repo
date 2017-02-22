
public class StudentGrade {

	private String gradeComment;
	
	public String printGrade(int grade){
		if (grade >= 90)
			gradeComment = "You can be proud of yourself!";
		else if (grade >= 80)
			gradeComment = "You have well done on this test";
		else if (grade >= 70)
			gradeComment = "You could do better";
		else
			gradeComment = "You need to study more";
		
		return gradeComment;
	}
}
