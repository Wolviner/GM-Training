package com.grayMatter;

import java.time.LocalDate;
import java.util.Scanner;

public class App implements UserInterface {
	private AppEngine app;
	
	  public App() {
	        this.app = new AppEngine();
	    }
	  
	public static void main(String[] args) {
		 App app = new App();
		 app.scenario1();
	        app.showFirstScreen();
	}
	 

	  
	Scanner sc=new Scanner(System.in);
	public void scenario1() {
		Student s1=new Student(99,"Milton",LocalDate.of(2002, 4, 19));
		Student s2=new Student(1000,"Kannapi",LocalDate.of(1990, 5, 15));
		app.register(s1);
		app.register(s2);
		
		Course crs1 = new Course(1, "Programming", 10, 199);
        
        Course crs2 = new Course(2, "Soft Skills", 12, 299);
        app.introduce(crs1);
        app.introduce(crs2);
		
//		Info ii=new Info();
//		ii.display(s1);
//		ii.display(s2);
		
	}
//	public void scenario2() {
//		Student arr[]=new Student[2];
//		arr[0]=new Student(87,"Milan",LocalDate.of(1997, 12, 19));
//		arr[1]=new Student(564,"Ramanan",LocalDate.of(2000, 7, 15));
//
//		Info ip=new Info();
//		for(Student i:arr) {
//			ip.display(i);
//			
//		}
//	}
	
//	public void scenario3() {
//		Info i3=new Info();
//		System.out.println("Enter number of students: ");
//		int num=sc.nextInt();
//		Student std1[]=new Student[num];
//		System.out.println("Enter Student Details (id, dob and name): ");
//		for(int i=0;i<num;i++) {
//		int id=sc.nextInt();
//		LocalDate dob=LocalDate.parse(sc.nextLine());
//		String name=sc.next();
//		std1[i]=new Student(id,name,dob);
//		}
//		for(Student j:std1) {
//			i3.display(j);
//		}
//	}

    @Override
    public void showFirstScreen() {
    	Scanner scanner = new Scanner(System.in);
        int op=0 ;
        
    	do {
    		try {
        System.out.println("Welcome to SMS(Student Mgmt. System) v1.0");
        System.out.println("Tell us who you are : \n1. Admin\n2. Student\n3.Exit");
        System.out.println("Enter your choice ( 1 or 2 ) : ");
        op = scanner.nextInt();
        switch (op) {
            case 1:
                showAdminScreen();
                break;
            case 2:
                showStudentScreen();
                
                break;
            case 3:
            	System.out.println("Exit");
            	break;
        
            default:
                System.out.println("Invalid choice!");
                break;
        }
    		}
        catch(Exception e)
        {
        	System.out.println("Invalid character");
        }
        }while(op!=3);
    	
        }
    

    @Override
    public void showAdminScreen() {
    	int choice =0; 
    	do {try {
        System.out.println("Admin Screen");
        System.out.println("Choose an option:");
        System.out.println("1. Show All Students");
        System.out.println("2. Register New Student");
        System.out.println("3. Enroll in Course");
        System.out.println("4. Back to Main Menu");
        System.out.println("5. Show All Courses");
        System.out.println("6.Exit");


        Scanner scanner = new Scanner(System.in);
        choice = Integer.parseInt(scanner.nextLine());
       

        switch (choice) {
            case 1:
                showAllStudentsScreen();
                break;
            case 2:
                showStudentRegistrationScreen();
                break;
            case 3:
                introduceNewCourseScreen();
                break;
            case 4:
                showFirstScreen();
                break;
            case 5:
                showAllCoursesScreen();
                break;
            case 6:
            	System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    	}
    	catch(Exception e) {
    		System.out.println("Invalid character");
    	}
        }while(choice!=6);
    }

    @Override
    public void showStudentScreen() {
    	int choice=0 ;
    	  do {
    		  try {
        System.out.println("Student Screen");
        System.out.println("Choose an option:");
        System.out.println("1. Show All Courses");
        System.out.println("2. Back to Main Menu");
        System.out.println("3.Exit");

        Scanner scanner = new Scanner(System.in);
        choice = Integer.parseInt(scanner.nextLine());
      
        switch (choice) {
            case 1:
                showAllCoursesScreen();
                break;
            case 2:
                showFirstScreen();
                break;
            case 3:
            	System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        }
    		  catch(Exception e)
    		  {
    		  System.out.println("Invalid character");
    		  }
        }while(choice!=3);
    }

    @Override
    public void showAllStudentsScreen() {
        System.out.println("All Students Screen");
        Student[] students = app.listOfStudents();
        for (Student student : students) {
            new Info().display(student);
            System.out.println(); 
        }
    }

    @Override
    public void showStudentRegistrationScreen() {
        System.out.println("Student Registration Screen");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        Student newStudent = new Student(id, name, dateOfBirth);
        app.register(newStudent);
    }

    @Override
    public void introduceNewCourseScreen() {
        System.out.println("Introduce New Course Screen");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Course ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Course Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course Duration (in months): ");
        int duration = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Course Fees: ");
        int fees = Integer.parseInt(scanner.nextLine());

        Course newCourse = new Course(id, name, duration, fees);
        app.introduce(newCourse);
    }

    @Override
    public void showAllCoursesScreen() {
        System.out.println("All Courses Screen");
        Course[] courses = app.listOfCourses();
        for (Course course : courses) {
            new Info().display(course);
            System.out.println(); 
        }
    }
	
//	@Override
//	public void showFirstScreen() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void showStudentScreen() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void showAdminScreen() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void showAllStudentsScreen() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void showStudentRegistrationScreen() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void introduceNewCourseScreen() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void showAllCoursesScreen() {
//		// TODO Auto-generated method stub
//		
//	}

}
