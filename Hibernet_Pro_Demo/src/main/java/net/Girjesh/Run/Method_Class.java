package net.Girjesh.Run;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import net.Girjesh.dao.DemoDao;
import net.Girjesh.hibernet.Demo;

public class Method_Class {
	 String firstname,lastname,date,email,age,gender;
	 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	 Demo ob = new Demo();
	 DemoDao dao = new DemoDao();
	 
	 
	public void addStudent() throws Exception
	{
			System.out.print("Enter the FirstName : ");
		   	firstname = input.readLine().trim();
		   	System.out.print("Enter the LastName : ");
		   	lastname = input.readLine().trim();
		   	System.out.print("Enter the DOB : ");
		   	date = input.readLine().trim();
		   	System.out.print("Enter the Age : ");
		   	age = input.readLine().trim();
		   	System.out.print("Enter the Gender : ");
		   	gender = input.readLine().trim();
		   	System.out.print("Enter the Email : ");
		   	email = input.readLine().trim();
		    ob = new Demo(firstname, lastname,date,age,gender,email);
		   	System.out.println("Adding the user.........");
		   	dao.save_demo(ob);
		   	System.out.println("Student added successfully!");
   	
	}
	
	public void update() throws Exception
	{
    	  System.out.println("PRESS 1. Update First Name of Student ");
          System.out.println("PRESS 2.Update Last Name of Student");
          System.out.println("PRESS 3. Update Age of Student");
          System.out.println("PRESS 4. Update Gender of Student");
          System.out.println("PRESS 5. Update Email of student");
          System.out.println("PRESS 6. Update DOB of student");
          System.out.println("PRESS 7. exit");
          System.out.print("Enter your choice here : ");
         int ch = Integer.valueOf(input.readLine());        
         
         switch(ch) 
         {
	        case 1:
	        {
					  	System.out.print("Enter the studentId : ");
					  	long id = Long.valueOf(input.readLine());
					  	
					    ob = dao.search_demo(id);
					    System.out.println("Student_Id \tFirst_ Name \tLast_name \tGender  \tAge \tDOB \tEmail \n");
					    
					  	if(ob == null)
					  	{
					  		System.out.println("Sorry! The student does not exit.");
					  		break;
					  	}
					  	System.out.print("Enter the FirstName : ");
					  	String firstname = input.readLine().trim();
						        
					  	if(firstname != "")
					  	{
					  	 ob.setU_fname(firstname);
					  	 System.out.println("\nUpdating the user.........");
					   	 dao.update_demo(ob);
					   	 System.out.println("User updated successfully!");
				}
	        
	        }
	        break;
	        
	        case 2:
	        {
			      	System.out.print("Enter the StudentId : ");
			      	long id = Long.valueOf(input.readLine());
			      	
			      	ob = dao.search_demo(id);
			      	if(ob == null) {
			      		System.out.println("Sorry! The student does not exit.");
			      		break;
			      	}
				System.out.print("Enter the Lastname : ");
			  	String lastname = input.readLine().trim();
			  	if(lastname != "")
			  	{
			  		ob.setU_ltname(lastname);
				  	System.out.println("\nUpdating the user.........");
				   	dao.update_demo(ob);
				   	System.out.println("User updated successfully!");
			  	}
			  	 
	        }
	        break;
	        
	        case 3:
	        {

		      	System.out.print("Enter the StudentId : ");
		      	long id = Long.valueOf(input.readLine());
    	
		      	List<Demo> l2 = (List<Demo>) dao.search_demo(id);
		      	System.out.println("Student_Id \tFirst_ Name \tLast_name \tGender  \tAge \t\tDOB \tEmail \n");
				l2.forEach(ob5 -> System.out.println(ob5.getId() +"\t\t"+ ob5.getU_fname()+"\t\t "+ ob5.getU_ltname()+"\t\t "
				+ ob5.getU_gender()+"\t\t "+ ob5.getU_age()+"\t\t "
				+ ob5.getU_dob()+"\t\t "+ ob5.getU_email()));
				
		      	if(ob == null)
		      	{
		      		System.out.println("Sorry! The student does not exit.");
		      		break;
		      	}
				  	System.out.print("Enter the Age : ");
				  	String age = input.readLine().trim();
				  	if(age != "")
				  	{
				  		ob.setU_age(age);
					  	System.out.println("\nUpdating the user.........");
					   	dao.update_demo(ob);
					   	System.out.println("User updated successfully!");
				  	}
				  	
	        }
	        break;
	        
	        case 4:
	        {
			      	System.out.print("Enter the studentId: ");
			      	long id = Long.valueOf(input.readLine());
			      	
			      	ob = dao.search_demo(id);
			      	if(ob == null) {
			      		System.out.println("Sorry! The student does not exit.");
			      		break;
			      	}
				  	System.out.print("Enter the Gender : ");
				  	String gender = input.readLine().trim();
				  	if(gender != "")
				  	{
				  		ob.setU_gender(gender);
					 	System.out.println("\nUpdating the user.........");
					  	dao.update_demo(ob);
					  	System.out.println("User updated successfully!");
				  	}
				  	
		}
	    break;
	    
	    case 5:
	    {

			      	System.out.print("Enter the StudentId: ");
			      	long id = Long.valueOf(input.readLine());
			      	
			      	ob = dao.search_demo(id);
			      	if(ob == null) {
			      		System.out.println("Sorry! The student does not exit.");
			      		break;
			      	}
				  	System.out.print("Enter the Email : ");
				  	String email = input.readLine().trim();
				  	if(email != "")
				  		ob.setU_email(email);
	    }
	    break;
	    
	    case 6:
	    {

		      	System.out.print("Enter the StudentId : ");
		      	long id = Long.valueOf(input.readLine());
		      	
		      	ob = dao.search_demo(id);
		      	if(ob == null) {
		      		System.out.println("Sorry! The student does not exit.");
		      		break;
		      	}
			  	System.out.print("Enter the DOB : ");
			  	String DOB = input.readLine().trim();
			  	if(DOB != "")
			  		ob.setU_dob(DOB);
  	    }	       
	  break;
	  
	  case 7:
	  {
		  System.exit(0);
	  }
	  break;
     }
}
		
		
}
