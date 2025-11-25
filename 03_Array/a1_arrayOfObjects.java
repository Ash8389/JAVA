class Student
{
    int rollno;
    String name;
    int marks;
}

public class a1_arrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Ashish";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Rose";
        s2.marks = 99;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "A+S";
        s3.marks = 101;

        Student a[] = new Student[3];
        a[0] = s1;
        a[1] = s2;
        a[2] = s3;

        // for(int i = 0; i<a.length; i++){
        //     System.out.println("Name: " + a[i].name);
        //     System.out.println("Roll: " + a[i].rollno);
        //     System.out.println("Marks: " + a[i].marks);
        // }
        
        for(Student s : a){
            System.out.println("Name: " + s.name);
            System.out.println("Roll: " + s.rollno);
            System.out.println("Marks: " + s.marks);
        }
    }
}
