class Student
{
public int rollNo=177;
public Student()
{
rollNo=177;
}
public void printRollNumber()
{
System.out.println(rollNo);
}

public static void main(String[]args)
{
    Student S= new Student();
    System.out.println(S.rollNo);
     S.printRollNumber();
}
}
