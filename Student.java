import java.util.Scanner;
class Student {
                Scanner sc=new Scanner(System.in);

    private int id;
    private String name;
  private double grade;  
  public void setst(int id,String name,double grade){
      this.id=id;
    this.name=name;
    this.grade=grade;
  }
  Student(){
      this.id=1;
    this.name="abebe";
    this.grade=77.6;
  }
  private int getid(){
    return id;
  }
  private String getname(){
    return name;
  }
  private double getgrade(){
    return grade;
  }
  public void modify(){
    grade=sc.nextDouble();
    this.grade= grade;
  }
  public void printer(){
    System.out.println(getid()+"       "+getname()+"       "+getgrade());
  }
  public static double calculateAverageGrade(Student[] students) {
    double totalGrade = 0.0;
    for (Student student : students) {
        totalGrade += student.grade;
    }
    return totalGrade / students.length;
  }
}
class mN{
public static void main(String[] args){
            Scanner input=new Scanner(System.in);
    Student stu1=new Student();
    Student stu2=new Student();
    Student stu3=new Student();
    stu1.setst(2,"Robert",66.7);
     stu2.setst(3,"Sam",2);
    stu3.setst(1,"John",88.7);
    System.out.println("id       name       grade");
    stu1.printer();
    stu2.printer();
    stu3.printer();
        System.out.println("do you want to modify the grade(y/n)");
        char choice=input.next().charAt(0);
       
        while(choice=='y'){
                    System.out.println("which studetnt");
                    int st=input.nextInt();
                    switch(st){
                        case 1:
                        System.out.println("enter the modified value");
                        stu1.modify();
                        break;
                        case 2:
                        System.out.println("enter the modified value");
                        stu1.modify();
                        break;
                        case 3:
                        System.out.println("enter the modified value");
                        stu3.modify();
                        break;

                    }
                    break;

        }
        stu1.printer();
    stu2.printer();
    stu3.printer();
    Student[] allstudent={stu1,stu2,stu3};
    System.out.println("average= " + Student.calculateAverageGrade(allstudent));

}
}
