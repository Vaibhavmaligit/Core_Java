package serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Batch;
import model.Course;
import model.Faculty;
import model.Student;
import service.CMSservice;

public class CMSserviceimpl implements CMSservice {
	
	Scanner sc = new Scanner(System.in);
	List<Course> courselt = new ArrayList<Course>();
	List<Faculty> facultylt = new ArrayList<Faculty>();
	List<Batch> batchlt = new ArrayList<Batch>();
	List<Student> studentlt = new ArrayList<Student>();
	
	

	@Override
	public void addCourse() {
		System.out.println("ENTER NO. YOU NEED TO ADD COURSES");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			Course c = new Course();
			System.out.println("ENTER COURSE ID");
			c.setcId(sc.nextInt());
			System.out.println("ENTER COURSE NAME");
			c.setcName(sc.next());
			courselt.add(c);
		}
		System.out.println("COURSE ADDED SUCCESSFULLY");
	}

	@Override
	public void displayCourse() {
		for(Course c :courselt)
		if(c != null)
			System.out.println(c);
	}

	@Override
	public void addFaculty() {
		
		System.out.println("ENTER NO. YOU NEED TO ADD FACULTY");
		int num = sc.nextInt();
		for(int i = 0; i< num; i++) {
			Faculty f = new Faculty();
			System.out.println("ENTER FACULTY ID");
			f.setfId(sc.nextInt());
			System.out.println("ENTER FACULTY NAME");
			f.setfName(sc.next());
			
			displayCourse();
			System.out.println("ENTER COURSE ID YOU NEED TO ASSIGN TO FACULTY");
			int cid = sc.nextInt();
			boolean flag = true;
			for(Course c : courselt) {
				if(c.getcId()==cid) {
					f.setCourse(c);
				flag = false;
				System.out.println("FACULTY ADDED TO COURSE");
				break;
				}
			}
			if(flag) {
				System.out.println("COURSE NOT FOUND");
			}
			facultylt.add(f);
			System.out.println("FACULTY ADDED SUCCESSFULLY");
		}
		
	}

	@Override
	public void displayFaculty() {
		for(Faculty f : facultylt) {
			if(f != null)
				System.out.println(f);
		}
		
	}

	@Override
	public void addBatch() {
		System.out.println("ENTER NO. YOU NEED TO ADD BATCH");
		int num = sc.nextInt();
		for(int i = 0; i< num; i++) {
			Batch b = new Batch();
			System.out.println("ENTER BATCH ID");
			b.setbId(sc.nextInt());
			System.out.println("ENTER BATCH NAME");
			b.setbName(sc.next());
			displayFaculty();
			System.out.println("ENTER FACULTY ID YOU NEED TO ASSIGN TO BATCH");
			int fId = sc.nextInt();
			boolean flag = true;
			for(Faculty f : facultylt) {
				if(f.getfId()== fId) {
					b.setFaculty(f);
					flag = false;
					System.out.println("BATCH ADDED TO FACULTY");
					break;
				}
				
			} if(flag) {
				System.out.println("FACULTY NOT FOUND");
		}
		batchlt.add(b);
		System.out.println("BATCH ADDED SUCCESSFULLY");
		}
	}

	@Override
	public void displayBatch() {
		for(Batch b : batchlt) {
			if(b != null)
				System.out.println(b );
		}
		
	}

	@Override
	public void addStudent() {
		System.out.println("ENTER NO. YOU NEED TO ADD STUDENTS");
		int num = sc.nextInt();
		for(int i = 0; i< num; i++) {
		Student s = new Student();
		System.out.println("ENTER STUDENT ID");
		s.setsId(sc.nextInt());
		System.out.println("ENTER STUDENT NAME");
		s.setsName(sc.next());
		displayBatch();
		System.out.println("ENTER BATCH ID YOU NEED TO ASSIGN TO STUDENT");
		int bId = sc.nextInt();
		boolean flag = true;
		for(Batch b : batchlt) {
			if(b.getbId()==bId) {
				s.setBatch(b);
				flag = false;
				System.out.println("STUDENT ADDED TO BATCH");
				break;
			}
		}if(flag) {
			System.out.println("BATCH NOT FOUND");
		}
		studentlt.add(s);
		System.out.println("STUDENT ADDED SUCCESSFULLY");
		}
	}

	@Override
	public void displayStudent() {
		for(Student s : studentlt) {
			if(s != null)
				System.out.println(s);
		}
		
	}

	@Override
	public void updateDetails() {
		boolean flag5 = true;
		    while(flag5) {
		    System.out.println("----------------------------------");
		    System.out.println("1. UPDATE COURSE");
		    System.out.println("----------------------------------");
		    System.out.println("2. UPDATE FACULTY");
		    System.out.println("----------------------------------");
		    System.out.println("3. UPDATE BATCH");
		    System.out.println("----------------------------------");
		    System.out.println("4. UPDATE STUDENT");
		    System.out.println("----------------------------------");
		    System.out.println("5. EXIT");
		    System.out.println("----------------------------------");

		    System.out.println("ENTER YOUR CHOICE BETWEEN 1 - 5");
		    int ch = sc.nextInt();
		   // boolean flag5 = true;
		   // while(flag5) {
		    switch (ch) {

		    case 1:
		    
		    	    displayCourse();
		    	    System.out.println("ENTER COURSE ID YOU WANT TO UPDATE");
		    	    int cid = sc.nextInt();
		    	    boolean flag = true;
		    	    for (Course c : courselt) {
		    	        if (c.getcId() == cid) {
		    	            System.out.println("ENTER NEW COURSE NAME");
		    	            c.setcName(sc.next());
		    	            System.out.println("COURSE UPDATED SUCCESSFULLY");
		    	            flag = false;
		    	            break;
		    	        }
		    	    }
		    	    if (flag) {
		    	        System.out.println("COURSE NOT FOUND");
		    	    }
		    	
		        break;

		    case 2:
		    	
		    	    displayFaculty();
		    	    System.out.println("ENTER FACULTY ID YOU WANT TO UPDATE");
		    	    int fid = sc.nextInt();
		    	    boolean flag1 = true;
		    	    for (Faculty f : facultylt) {
		    	        if (f.getfId() == fid) {
		    	            System.out.println("ENTER NEW FACULTY NAME");
		    	            f.setfName(sc.next());
		    	            System.out.println("FACULTY UPDATED SUCCESSFULLY");
		    	            flag1 = false;
		    	            break;
		    	        }
		    	    }
		    	    if (flag1) {
		    	        System.out.println("FACULTY NOT FOUND");
		    	    }
		        break;

		    case 3:
		    	
		       displayBatch();
		       System.out.println("ENTER BATCH ID YOU WANT TO UPDATE");
		       int bId = sc.nextInt();
		       boolean flag2 = true;
		       for(Batch b : batchlt) {
		    	   if(b.getbId()==bId) {
		    		   System.out.println("ENTER NEW BATCH NAME");
		    		   b.setbName(sc.next());
		    		   System.out.println("BATCH UPDATED SUCCESSFULLY");
		    		   flag2 = false;
		    		   break;
		    	   }
		       }if(flag2) {
		    	   System.out.println("BATCH NOT FOUND");
		       }
		    	
		        break;

		    case 4:
		        
		    	displayStudent();
		    	System.out.println("ENTER STUDENT ID YOU WANT TO UPDATE");
		    	int sid = sc.nextInt();
		    	boolean flag3 = true;
		    	for(Student s:studentlt) {
		    		if(s.getsId()== sid) {
		    			System.out.println("ENTER NEW STUDENT NAME");
		    			s.setsName(sc.next());
		    		    System.out.println("STUDENT UPDATED SUCCESSFULLY");
		    		    flag3 = false;
		    		    break;
		    		}
		    	}if(flag3) {
		    		System.out.println("STUDENT NOT FOUND");
		    	}
		        break;
		        
		    case 5:
		    	System.out.println("YOU ARE REDIRECTED TO MAIN MENU");
		    	flag5 = false;
		    	break;

		    default:
		        System.out.println("INVALID CHOICE PLEASE ENTER AGAIN");
		    }
		    //flag5=false;
		   // return;
		    }
		}

	

	@Override
	public void deleteDetails() {
		boolean flag5 = true;

	    while (flag5) {

		System.out.println("----------------------------------");
	    System.out.println("1. DELETE COURSE");
	    System.out.println("----------------------------------");
	    System.out.println("2. DELETE FACULTY");
	    System.out.println("----------------------------------");
	    System.out.println("3. DELETE BATCH");
	    System.out.println("----------------------------------");
	    System.out.println("4. DELETE STUDENT");
	    System.out.println("----------------------------------");
	    System.out.println("5. EXIT");
	    System.out.println("----------------------------------");

	    System.out.println("ENTER YOUR CHOICE BETWEEN 1 - 5");
	    int ch = sc.nextInt();
	    //boolean flag = true;
	   // while(flag) {
	    switch (ch) {

	    case 1:
	    
	    	    displayCourse();
	    	    System.out.println("ENTER COURSE ID YOU WANT TO DELETE");
	    	    int cid = sc.nextInt();
	    	    boolean flag1 = true;
	    	    for (Course c : courselt) {
	    	        if (c.getcId() == cid) {
	    	           courselt.remove(c);
	    	            System.out.println("COURSE DELETED SUCCESSFULLY");
	    	            flag1 = false;
	    	            break;
	    	        }
	    	    }
	    	    if (flag1) {
	    	        System.out.println("COURSE NOT FOUND");
	    	    }
	    	
	        break;
	        
	    case 2:
	    	
    	    displayFaculty();
    	    System.out.println("ENTER FACULTY ID YOU WANT TO DELETE");
    	    int fid = sc.nextInt();
    	    boolean flag2 = true;
    	    for (Faculty f : facultylt) {
    	        if (f.getfId() == fid) {
    	            facultylt.remove(f);
    	            System.out.println("FACULTY DELETED SUCCESSFULLY");
    	            flag2 = false;
    	            break;
    	        }
    	    }
    	    if (flag2) {
    	        System.out.println("FACULTY NOT FOUND");
    	    }
        break;

	    case 3:
	    	
		       displayBatch();
		       System.out.println("ENTER BATCH ID YOU WANT TO DELETE");
		       int bId = sc.nextInt();
		       boolean flag3 = true;
		       for(Batch b : batchlt) {
		    	   if(b.getbId()==bId) {
		    		   batchlt.remove(b);
		    		   System.out.println("BATCH DELETED SUCCESSFULLY");
		    		   flag3 = false;
		    		   break;
		    	   }
		       }if(flag3) {
		    	   System.out.println("BATCH NOT FOUND");
		       }
		    	
		        break;
		        
	    case 4:
	        
	    	displayStudent();
	    	System.out.println("ENTER STUDENT ID YOU WANT TO DELETE");
	    	int sid = sc.nextInt();
	    	boolean flag4 = true;
	    	for(Student s:studentlt) {
	    		if(s.getsId()== sid) {
	    			studentlt.remove(s);
	    		    System.out.println("STUDENT DELETED SUCCESSFULLY");
	    		    flag4 = false;
	    		    break;
	    		}
	    	}if(flag4) {
	    		System.out.println("STUDENT NOT FOUND");
	    	}
	        break;
	        
	    case 5:
	    	System.out.println("YOU ARE REDIRECTED TO MAIN MENU");
	    	flag5 = false;
	    	break;

	    default:
	        System.out.println("INVALID CHOICE PLEASE ENTER AGAIN");
	    }
	   // flag = false;
	  //  return;
	    }
	    
	    }
	}

