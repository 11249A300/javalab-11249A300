class Student {
    String name;
    int rollnumber;
    int marks;
    Student(String name, int rollnumber,int marks) {
        this.name=name;
        this.rollnumber = rollnumber;
        this.marks =marks ;
    }
    String calculateGrade () {
        if(marks>=90)
            return "A" ;
        else if(marks >=75)
            return "b" ;
        else if (marks >=60)
            return "c" ;
        else if (marks >=40)
            return "d" ;
        else  
            return "f" ;
    }
    void displayInfo () {
        System.out.println("Student Name: "+name);
        System.out.println("roll Number :"+rollnumber);
        System.out.println("marks :"+marks);
        System.out.println("Grade :"+calculateGrade());
        System.out.println("----------------------");
        }
    }
    public class studentDemo {
        public static void main(String [] args) {
            Student s1=new Student("masthan",310 ,91 );
            Student s2=new Student("hemesh",300,85);
            s1.displayInfo();
            s2.displayInfo();
        }
    }
