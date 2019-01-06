package student_db;
enum course{
	History(600),
	Maths(600),
	English(600),
	Chemistry(600),
	ComputerScience(600),
	Latin(600);
	int cost;
	course(int price) {
		//System.out.println("ENUM"+this.toString());
		cost = price;
	}
}
public class student {
	String name;
	int year;
	int num_courses = 0;
	course My_courses[] = new course[5];
	int tution_fee = 0;
	student(String name, int year, int N, int courses[]) {
		System.out.println("creating new student");
		this.name = name;
		this.year = year;
		int i;
		for(i=0;i<N;i++) {
			if(courses[i] == 1) {
				num_courses++;
				switch(i) {
				case 0 : My_courses[i] = course.History;
				 break;
				case 1 : My_courses[i] = course.Maths;
				 break;
				case 2 : My_courses[i] = course.English;
				 break;
				case 3 : My_courses[i] = course.Chemistry;
				 break;
				case 4 : My_courses[i] = course.ComputerScience;
				 break;
				}
				tution_fee += My_courses[i].cost;
			}
		}
	}
	public void get_student_info() {
		System.out.println(name+" "+year+" "
				+tution_fee);
		for(int i=0;i<num_courses;i++) {
			if(My_courses[i] != null) {
				System.out.println(My_courses[i].name());
			}
		}
	}
}
