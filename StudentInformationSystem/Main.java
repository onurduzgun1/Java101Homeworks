package Java101Odevler.StudentInformationSystem;

public class Main {
    public static void main(String[] args) {

    Teacher t1 = new Teacher("Onur", "11111", "MTH");
    Teacher t2 = new Teacher("Umit", "22222", "PHY");
    Teacher t3 = new Teacher("Arin", "33333", "CHM");

    Course math = new Course("Math", "101", "MTH");
    Course physics = new Course("Physics", "102", "PHY");
    Course chemistry = new Course("Chemistry", "103", "CHM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

    Student s1 = new Student("Orhun", "202201", 2, math, physics, chemistry);
        s1.addBulkExamNote(60, 50, 45);
        s1.addBulkVerbalNote(70,60,60);
        s1.isPass();

    Student s2 = new Student("Mustafa", "202202", 2, math, physics, chemistry);
        s2.addBulkExamNote(30, 60, 70);
        s2.addBulkVerbalNote(50,60,90);
        s2.isPass();

    Student s3 = new Student("Seyma", "202203", 2, math, physics, chemistry);
        s3.addBulkExamNote(70, 35, 25);
        s3.addBulkVerbalNote(55,55,50);
        s3.isPass();
    }
}
