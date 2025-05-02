1. Write a Program to demonstrate Command Line Arguments
public class commandline {
    public static void main(String[] args) {
        // Check if arguments are provided
        if(args.length == 0) {
            System.out.println("No arguments provided");
        }
        else{
            System.out.println("Arguments received:");
            for(int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i+1) + ": " + args[i]);
            }
        }
    }
}

==================================================================================

2. Write a Program to Create Student Information Using Array 
class Student { 
    String name; 
    int age; 

    Student(String name, int age) { 
        this.name = name; 
        this.age age; 
    } 

    void display(){ 
        System.out.println("Name: "+ name +", Age: "+ age); 
    } 
} 
public class StudentArray { 
    public static void main(String[] args) { 
        Student[] students = { 
            new Student("Alice", 20), 
            new Student("Bob", 22) 
        };

        for (Student s students) { 
            s.display(); 
        } 
    } 
}

==================================================================================

3. Write a Program in Java to Implement User Defined Package 
//FILE-1
package mypackage;
public class myclass
{
    public void display()
    {
        System.out.println("Hello , This is Demo of Package...");
    }
}

//compilation of package in cmd
//javac -d . myclass.java
//-d denotes destination and . denotes current folder

//FILE-2
import mypackage.myclass;
public class packagedemo
{
    public static void main(String[] args)
    {
        myclass obj = new myclass();
        obj.display();
    }
}

==================================================================================

4. Write a Program to Demonstrate Various String Functions 
class stringfun{
    public static void main(String args[]) {
        String s1 = new String("Java programming");
        String s2 = "JAVA programming";

        System.out.println("Length: " + s1.length());
        System.out.println("Character at 5: " + s1.charAt(5));
        System.out.println("Concatenation: " + s1.concat(" Language"));
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Upper Case: " + s1.toUpperCase());
        System.out.println("Lower Case: " + s1.toLowerCase());
        System.out.println("Substring: " + s1.substring(5, 16));
        System.out.println("Replace: " + s1.replace('a', 'A'));
    }
}

==================================================================================

5. Write a Program in Java to implement Default and Parameterized Constructor 
class Student
{
    int rollNo;
    String name;

    Student()//Default
    {
        this.rollNo = 000;
        this.name = "Unknown";
    }
    Student (int r,String n)//parameterized 
    {
        this.rollNo = r;
        this.name = n;
    }
    Student(Student s)//copy
    {
        this.rollNo = s.rollNo;
        this.name = s.name;
    }
    void printst()
    {
        System.out.println(this.rollNo);
        System.out.println(this.name);
    }
}
public class classobjectcon {
    public static void main(String[] args) {
    Student s1 = new Student(1,"SHABBIR");
    s1.printst();
    Student s2 = new Student(2,"Taher");
    s2.printst();
    //Student s3 = new Student(s1.rollNo, s2.name);
    Student s3 = new Student(s1);
    s3.printst();
    }
}

==================================================================================

6. Write a Program in Java to Implement All type of Inheritance 
//Single Inheritance 
class Stname { 
    String name = "RAMAN"; 
} 
class Student extends Stname 
{ 
    int age = 20; 
    void display(){ 
        System.out.println("Name: "+name+", Age: "+ age); 
    } 
} 
public class SingleInheritance { 
    public static void main(String[] args) { 
        Student obj = new Student(); 
        obj.display(); 
    } 
}


//Multi-Level Inheritance 
class Stname { 
    String name = "RAMAN"; 
} 
class Stid extends Stname 
{ 
    int age = 20; 
} 
class Student extends Stid 
{ 
    void display() { 
        System.out.println("Name: "+name+", Age: "+ age); 
    } 
} 
public class MultilevelInheritance { 
    public static void main(String[] args) { 
        Student obj = new Student(); 
        obj.display(); 
    } 
}


//Hierarchical Inheritance 
class Stname { 
    String name = "RAMAN"; 
} 
class Student1 extends Stname 
{ 
    int age = 15; 
    void display1(){ 
        System.out.println("Name: "+name+", Age: "+ age); 
    } 
} 
class Student2 extends Stname 
{ 
    int age = 20; 
    void display2(){ 
        System.out.println("Name: "+name+", Age: "+ age); 
    } 
} 
public class HierarchicalInheritance { 
    public static void main(String[] args) { 
        Student1 obj1 = new Student1(); 
        Student2 obj2 = new Student2(); 
        obj1.display1(); 
        obj2.display2(); 
    }   
}

==================================================================================

7. Write a program in Java to Demonstrate Exception Handling 
class exceptionhand{
    public static void main(String args[]) {
        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        }
        catch(ArithmeticException e) {
            System.out.println("Exception Occurred: " + e);
        }
        finally {
            System.out.println("Cannot perform Division");
        }
    }
}

==================================================================================

8. Write a program in Java to Demonstrate Method Overriding & Overloading
class Parent {
    void display() {
        System.out.println("Display method of Parent class");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Display method of Child class");
    }
    void data(int age)
    {
        System.out.println("Age = "+age);
    }
    void data(String name , int age)
    {
        System.out.println("Name = "+name+" Age = "+age);
    }
}
public class overridingloading
{
    public static void main(String args[]) {
        Child obj = new Child();
        obj.display();
        obj.data(18);
        obj.data("RAMAN",18);
    }
}

==================================================================================

9. Write a Program in Java to Demonstrate 2D Array 
public class twodarray
{
    public static void main(String[] args)
    {
        String[][] arr = {
            {"Shabbir","S145"},
            {"Raman","D845"}
        };
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(j==0)
                System.out.print("Name"+(i+1)+" = "+arr[i][j]);
                else
                System.out.println(" ,Registration ID"+(i+1)+" = "+arr[i][j]);
            }
            System.out.println();
        }
    }
}

==================================================================================

10. Write a Program in Java to Demonstrate Use of Super Keyword 
class Parent {
    int num = 100;
    Parent() {
        System.out.println("Parent class constructor");
    }
    void display() {
        System.out.println("This is the parent class method.");
    }
}
class Child extends Parent {
    int num = 200;
    Child() {
        super(); // Calls parent class constructor
        System.out.println("Child class constructor");
    }
    void display() {
        super.display(); // Calls parent class method
        System.out.println("This is the child class method.");
    }
    void showNumbers() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num: " + super.num);
    }
}
public class superkey {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Calls overridden method
        obj.showNumbers(); // Shows variable values
    }
}

==================================================================================