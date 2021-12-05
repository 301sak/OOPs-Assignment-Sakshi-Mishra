class Superdepartment { 
	public String departmentName() {
		return "Super Department";	
	}
    public  String getTodaysWork () {
	    return "No Work as of now";
 }
    public String getWorkDeadline() {
    	return "Nil";
    }
    public  String isTodayAHoliday() {
    	return "Today is not a holiday";	
    }
    
    class Admindepartment extends Superdepartment{
    	public String departmentName() {
    		return "Admin Department";	
    	}
    	
    	public String getTodayswork() {
    		return "Complete your documents Submission";
    	}
    	public String getWorkDeadline() {
    		return "Complete by EOD ";
    		
    	}
    }
 class Hrdepartment extends Superdepartment{
	 public String departmentName() {
		 return "Hr department";
	 }
	 public String getTodayswork() {
 		return "Fill today’s timesheet and mark your attendance";
 	}
 	public String getWorkDeadline() {
 		return "Complete by EOD ";
 }
 	public String doActivity() {
 		return "team Lunch ";
}
 }
 class Techdepartment  extends Superdepartment{
 		 public String departmentName() {
 			 return "Tech department ";
 		 }
 		 public String getTodayswork() {
 	 		return "Complete coding of module 1";
 	 	}
 	 	public String getWorkDeadline() {
 	 		return "Complete by EOD ";
 	 }
 	 	public String getTechStackInformation() {
 	 		return "core Java";
 	 	}
}
 	public class Department {
 		public static void main(String [] args) {
 			
 			Admindepartment adminObj = new Admindepartment();
 			System.out.println("Welcome to " +adminObj.departmentName());
 			System.out.println(adminObj.getTodaysWork());
 			System.out.println(adminObj.getWorkDeadline());
 			System.out.println(adminObj.isTodayAHoliday());
 			
 			System.out.println();
 			
 			Hrdepartment hrObj = new Hrdepartment();
 			System.out.println("Welcome to " +hrObj.departmentName());
 			System.out.println(hrObj.getTodaysWork());
 			System.out.println(hrObj.getWorkDeadline());
 			System.out.println(hrObj.isTodayAHoliday());
 			
 			System.out.println();
 			
 			Techdepartment techObj = new Techdepartment();
 			System.out.println("Welcome to " +techObj.departmentName());
 			System.out.println(techObj.getTodaysWork());
 			System.out.println(techObj.getWorkDeadline());
 			System.out.println(techObj.isTodayAHoliday());
 		}
 		
}
 	
 
 
 	
 	

