package net.Girjesh.Run;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import net.Girjesh.dao.DemoDao;
import net.Girjesh.hibernet.Demo;

public class Student_start 
{
	 String firstname,lastname,date,email,age,gender;
	 int ch,choice;
	 Demo ob = new Demo();
	 DemoDao dao= new DemoDao();
	 Method_Class ms= new Method_Class();
	 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	 
	public static void main(String[] args)
	{
		Student_start ss = new Student_start();
		ss.call();
	}
	
	
    public void call()
    {
    	
    		
    	 	while(true) {
        	try {
                System.out.println("==== Student REGISTRATIONS FORM ====");
                System.out.println("PRESS 1. Add Student Data ");
                System.out.println("PRESS 2. Search a Student");
                System.out.println("PRESS 3. See All the Student Details");
                System.out.println("PRESS 4. Update a Student Imformation");
                System.out.println("PRESS 5. Delete a student");
                System.out.println("PRESS 6. Exit");
                System.out.print("Enter your choice : ");
                choice = Integer.valueOf(input.readLine());
                switch(choice) {
        	        case 1:
        	        {
        	        	ms.addStudent();
        	        	break;
        	        }
        	        case 2:
        	        {
        	        	
        	        	System.out.print("Enter the StudentId : ");
        	        	long id = Long.valueOf(input.readLine());
        	        	System.out.println(dao.search_demo(id));
        	        	break;
        	        }
        	        case 3:
        	        {
        	        	List<Demo> l1 = dao.showAll_demo();
        	        	System.out.println("Student_Id \tFirst_ Name \tLast_name \tGender  \tAge \t\tDOB \tEmail \n");
        				l1.forEach(ob5 -> System.out.println(ob5.getId() +"\t\t"+ ob5.getU_fname()+"\t\t "+ ob5.getU_ltname()+"\t\t "
        				+ ob5.getU_gender()+"\t\t "+ ob5.getU_age()+"\t\t "
        				+ ob5.getU_dob()+"\t\t "+ ob5.getU_email()));
				System.out.println("**=============**=================**=============**=============**=================**=============**");
        			
        	        	break;
        	        }
        	        case 4:
        	        {
        	        	ms.update();
        	        }
        	       break; 
        	        case 5:
        	        {
        	        	System.out.print("Enter the UserId : ");
        	        	long id = Long.valueOf(input.readLine());
        	        	System.out.println("Deleting the user.......");
        	        	dao.delete_demo(id);
        	        	System.out.println("User deleted successfully!");
        	        	break;
        	        }
        	        case 6:
        	        	System.exit(0);
                }
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
        }
    }
}
