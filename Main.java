import java.util.*;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
class Details{
    String name,address,from,to;
    Scanner ip=new Scanner(System.in);
    public int num;
    public void passdetail(){
        System.out.println("\t\n Enter passenger name : ");
        name=ip.next();
        System.out.println("\t\n Enter Departure avenue and Destination : ");
        from=ip.next();
        to=ip.next();
        
    }
    
}
class Booking extends Details{
    Scanner ip=new Scanner(System.in);
    List l=new ArrayList();
    int firstclass=1,economy=1,psgid,c=0,i=0;
    void bookseat(int num)
    {while((firstclass<=25&&economy<=25)&&(i<num))
    {   i++;
        System.out.print("\t\n Enter 1 for first class or 2 for Economy or -1 to exit : ");
        int n=ip.nextInt();
        if(n==-1)
        {
            break;
        }
        if(n==1&&firstclass<=25){
            System.out.println("You are assigned to first class\t"+"Seat "+firstclass+"\t");
            firstclass++;l.add(firstclass);
        }
        else if(n==2&&economy<=25){
            System.out.println("You are  assigned to Economy class" + economy+"\t");    
            economy++;l.add(economy);
        }
        else if(n==1 && n>=25){
            System.out.print("First class full!!");
            if(economy<=25){
                System.out.print("Is it acceptable to be placed in the Economy class (y / n)");
                String s=ip.next();
                if(s.equals("y")){
                    System.out.print("Seat reserved in Economy class:)" + economy);economy++;l.add(economy);
                }
                else{
                    break;
                }
            }
            else
              System.out.println("Next flight leaves in 3 hours.\t");
        }
        
        else if(n==2 && economy>=25)
        {System.out.println("Economy class full\t");
        if(firstclass<=25){
            System.out.print("Is it acceptable to be placed in the first class (y/n)");
            String s=ip.next();
            if(s.equals("y")){
                System.out.println("You are  assigned to first class:)"+firstclass);firstclass++;l.add(firstclass);
            }
        }
        else if(firstclass==25 &&economy==25){
            System.out.println("Plane is full, next flight is in 5 hours");
        } 
        else{break;}
        }
        

    }
    
    
}
}
class Passengerid extends Details{
        int seat;
        void id(int n){
            seat=n;
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
        StringBuilder sb = new StringBuilder(10); 
        for(int j=0;j<seat;j++)
        {for(int i = 0; i <10; i++) { 
            int index = (int)(AlphaNumericString.length()* Math.random()); 
            sb.append(AlphaNumericString .charAt(index)); 
        } System.out.println("\n\n\tPassenger ID :  "+sb.toString()); 
        }
        
    }
        
}
class Extra extends Details
{   String pho, st,pnr,email;int bag;
    void checkin(int n){
        if(n>0){
            System.out.println("\n\n\n\t***It is mandatory for all passengers to check-in online 48 hours to 60 min before flight departure  !!***");
        }
    }
    void baggage(int num){
        
        if(num>0){
            System.out.println("\n\n\n------------------------------------------Prepaid Excess Baggage-------------------------------------------------------------");
            System.out.println("\n\n\n\t An unbundled service as per Air Transport Circular 02 of 2016 issued by DGCA. These are optional services available at an additional charge for convenience of our passenger. Booking of the ticket can be made without opting /availing these unbundled services!!");
            System.out.println("\n\nClick (y/n) to pre-book additional baggage on your & save upto 20% :) :) :) !!!");
            st=ip.next();
            if(st.equals("y")){
                System.out.println("Enter mobile number : ");
                pho=ip.next();
                String re= "(0/91)?[7-9][0-9]{9}";
                System.out.println("The phone number is: " + pho);
                if(pho.matches(re)){
                    System.out.println("Enter number of baggages : ");
                    bag=ip.nextInt();
                    System.out.println("Enter PNR /Booking Reference : ");
                    pnr=ip.next();
                    System.out.println("Enter E-mail ID : ");
                    email=ip.next();
                    String pat = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
                    if(email.matches(pat)){
                        System.out.println("Successfully booked additional baggage:):)!!");
                        
                    }
                    else{
                        System.out.println("Enter proper email address");
                    }
                    
                }
                else{
                    System.out.println("Enter proper phone number!!");
                }
            }
        }
    }
}
class Faq extends Details{
    void question()
    {System.out.println("\tTop Categories\n 1. Baggage allowance FAQ \n 2. Refund FAQ \n 3. Flight Cancellations FAQ");
    int t=ip.nextInt();
    switch(t){
        case 1:{System.out.println("\n Top quries \n");
            String[] array = new String[20];int i=0;
            array[0] ="What if I exceed my free baggage weight allowance?";
            array[1]="Are there any general advisories that I should keep in mind regarding my baggage?";
            array[2]="Can I check-in for my onward flight at the point of departure and reclaim my checked-in baggage at the end of the entire journey, in case of connecting flight made by me in two different PNRs?";
            System.out.println(array[0]+"\n"+array[1]+"\n"+array[2]);
            System.out.println("\n Post your question here :");
            String u=ip.next();
            array[3]=u;
            System.out.println("\n Successfully added !! we'll get back to you shortly :):):):)");
            break;
        }
        case 2:{System.out.println("\n Top quries \n");
                String[] a = new String[20];
                a[0]=" How can a refund for a cancelled ticket be obtained?";
                a[1]=" How can I obtain a refund for a ticket booked through a travel agency?";
                a[2]=" Can a refund be obtained in case I am unable to travel?";
                System.out.println(a[0]+"\n"+a[1]+"\n"+a[2]);
                System.out.println("\n Post your question here :");
                String r=ip.next();
                a[3]=r;
                System.out.println("\n Successfully added !! we'll get back to you shortly :):):):) ");
                break;
        }
        case 3:{System.out.println("\n Top quries \n");
                String[] arr = new String[20];
                arr[0]="What is IndiGo's policy if a flight is cancelled, delayed or preponed?";
                arr[1]="Will IndiGo provide any additional benefits to passengers in case their flight is cancelled or rescheduled?";
                arr[2]="Will I be contacted in advance if my flight is delayed, preponed or cancelled?";
                System.out.println(arr[0]+"\n"+arr[1]+"\n"+arr[2]);
                System.out.println("\n Post your question here :");
                String f=ip.next();
                arr[3]=f;
                System.out.println("\n Successfully added !! we'll get back to you shortly :):):):)");
                break;
        }
    default:{System.out.println("Enter proper option !!");break;}
    }
}
}
public class Main
{
	public static void main(String[] args) {
	    int num;
		System.out.println("\t\t\t\t Airlines and e-visa - A contemporary management system");
		System.out.println("\n\n------------------------------------------welcome to the portal!!-------------------------------------------------------------");
	    System.out.println("\n\t Choose your preference \n \t 1.Airline booking \n \t 2.e-visa booking \t");
	    Scanner ip=new Scanner(System.in);
	    int op=ip.nextInt();
	    Details d=new Details();
	    
	    Visadetails v=new Visadetails();
	    
	    switch(op){
	        case 1:{
	        d.passdetail();     
	        System.out.println("\n\t Book a flight \n\t  * 1. One Way \n\t  * 2. Round trip \n\t  * 3. Multi City");
	        int route=ip.nextInt();
	        System.out.println("\t\n Enter number of tickets required : ");
            num=ip.nextInt();
	        Booking b=new Booking();
	        b.bookseat(num);
	        Passengerid p=new Passengerid();
	        p.id(num);
	        Extra e=new Extra();
	        e.checkin(num);
	        e.baggage(num);
	        System.out.println("\t\nHave a question?  Post in FAQs(y/n)!!");
	        Faq f=new Faq();
	        f.question();
	        break;
	        }
	        case 2:{v.registrationform();
	            
	            Instructions i=new Instructions();
	            i.ins();
	            i.category();
	        break;}

            default:break;
	    
	    
	    
	}
}
}
class Visadetails{
    Scanner ip=new Scanner(System.in);
    String name,nation,portarrival,email,re_email,arrivaldate,gender,dob,permanentadd;
    int passportno,phoneno,option;
    void registrationform()
    {System.out.println("\t\n Enter name* : ");name=ip.next();
     System.out.println("\t\n Enter nationality* : ");nation=ip.next();
     System.out.println("\t\n Enter Port Of Arrival* : ");portarrival=ip.next();
     System.out.println("\t\n Enter email* : ");email=ip.next();
     String pattern = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if(email.matches(pattern)){
            System.out.println(":):)!!");
            }
        else{
            System.out.println("Enter valid e-mail!!");System.exit(0);
        }    
     System.out.println("\t\n Re-enter email* : ");re_email=ip.next();
     if(!(email.equals(re_email)))
     {
        System.out.println("\t\n Enter same mail id!!:(:(:(");
        System.exit(0);
     }
     
     System.out.println("\t\n Enter arrival date : ");arrivaldate=ip.next();
     System.out.println("\t\n Enter gender : ");gender=ip.next();
     System.out.println("\t\n Enter Date of birth : ");dob=ip.next();
     String valid = "^(1[0-2]|0[1-9])/(3[01]"
                       + "|[12][0-9]|0[1-9])/[0-9]{4}$"; 
        Pattern p = Pattern.compile(valid); 
        Matcher matcher = p.matcher((CharSequence)dob); 
        if(!(matcher.matches()))
        {
            System.out.println("\t\n Enter valid Date of birth!!");
            System.exit(0);
        }
       System.out.println("\t\n Enter permanent address : ");permanentadd=ip.next();
       
    } 
    
    
}
class Instructions extends Visadetails
{
    void ins(){
        System.out.println("\n\n------------------------------------------------Instructions!!----------------------------------------------------------------------------------");
        System.out.println("\nOnline application Form:- \n\t This application form is meant for those foreigners who are applying for visa from outside IndiaEach online application form is meant     for one person only. \nPhoto Requirements \n\tThe digital photograph to be uploaded along with the Visa application should meet the following requirements: \n\tFormat JPEGSize\n\tMinimum 10 KBMaximum 300 KB");
     }
     void category (){
        System.out.println("\n Visa Categories : \n 1). Tourist Visa \n 2).Medical Visa \n 3). Bussiness Visa \n 4). General Visa");
        System.out.println("\n Requirement : ");
        option=ip.nextInt();
        if((option<=4)&&(option>0))
        System.out.println("\t\n e-visa booked successfully!!:):)");
        else{
            System.out.println("\n Wrong Option!!:(:(");
        }
        int t;
        System.out.println("\n\n------------------------------------------------FAQ!!----------------------------------------------------------------------------------");
        switch(option){
        case 1:{System.out.println("\n Top quries \n");
            String[] array = new String[20];int i=0;
            array[0] ="WHAT DO I NEED TO APPLY FOR AN INDIA TOURIST EVISA?";
            array[1]="How long is the Indian Tourist eVisa valid for?";
            array[2]="WHEN SHOULD I APPLY FOR AN INDIAN TOURIST EVISA?";
            System.out.println(array[0]+"\n"+array[1]+"\n"+array[2]);
            System.out.println("\n Post your question here :");
            String u=ip.next();
            array[3]=u;
            System.out.println("\n Successfully added !! we'll get back to you shortly :):):):)");
            break;
        }
        case 2:{System.out.println("\n Top quries \n");
                String[] a = new String[20];
                a[0]=" HOW MANY ENTRIES DOES THE MEDICAL EVISA ALLOW?";
                a[1]=" WHAT IS THE COST TO OBTAIN AN INDIAN MEDICAL EVISA?";
                a[2]=" How long is the Indian Medical eVisa valid for";
                System.out.println(a[0]+"\n"+a[1]+"\n"+a[2]);
                System.out.println("\n Post your question here :");
                String r=ip.next();
                a[3]=r;
                System.out.println("\n Successfully added !! we'll get back to you shortly :):):):) ");
                break;
        }
        case 3:{System.out.println("\n Top quries \n");
                String[] arr = new String[20];
                arr[0]=" WHAT DO I NEED TO APPLY FOR AN INDIA BUSINESS E-VISA?";
                arr[1]=" WHAT CONDITIONS MUST THE APPLICANT’S PASSPORT MEET FOR THE INDIAN BUSINESS EVISA?";
                arr[2]=" HOW MUCH DOES AN INDIA BUSINESS EVISA COST?";
                System.out.println(arr[0]+"\n"+arr[1]+"\n"+arr[2]);
                System.out.println("\n Post your question here :");
                String f=ip.next();
                arr[3]=f;
                System.out.println("\n Successfully added !! we'll get back to you shortly :):):):)");
                break;
        }
    default:{System.out.println("Enter proper option !!");break;}
    }
    }
     
}











