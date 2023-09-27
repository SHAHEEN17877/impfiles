package assignment;
class Student{
				String name;
				int score;
				public Student(String name, int score) {
					this.name=name;
					this.score=score;
				}
			}
			class Classroom{
				public String registerStudent(Student stud) {
					
//					if(!stud.name.matches("[A-Z]+")) {
					if(!stud.name.equals(stud.name.toUpperCase())) {
						return "Block Letters needed!!";
					}
					if(stud.score<0 || stud.score>100) {
						return "Invalid Score!!";
					}
					return "Registered";
				}
				public String studentCard(String card) {
					if (!card.matches("\\d+")) {
						return "Invalid card";
					}
					else {
						return "Valid card";
					}
					
				}
			}

			public class ClassroomValidation {

				public static void main(String[] args) {
					Student s = new Student("Java" , -70);
					Classroom c=new Classroom();
					String str=c.registerStudent(s);
					System.out.println(str);
					String str1=c.studentCard("bgv0");
					System.out.println(str1);

				}

			}
		
	

