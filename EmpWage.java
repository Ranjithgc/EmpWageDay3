public class EmpWage
{
  public static void main(String[] args)
  {
   
     int present = 1;
     
     int wagePerHour=20;
    
     int fullDayHour=8;
     
     int  salary=0;
     
     double random=Math.floor(Math.random()*10) % 2;

     
     if(random != present)
      {
        
        salary = 0; 
	System.out.println("Employee is Absent"+salary);
      }
      else
      {

        salary=wagePerHour*fullDayHour;
        
        System.out.println("Employee is present and his salary is "+salary);
       
         
      }

  }

}
