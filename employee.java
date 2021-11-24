public class employee extends person {
    private String firstName;
    private String lastName;
    private String EmplID;
    private double hourlyRate;
    private double hoursWorked;
    private char status;

    employee(){
        super();
        EmplID="";
        firstName="";
        lastName="";
        hourlyRate=15;
        status='F';
        hoursWorked=0.00;

    }
    employee(String a, String b, String c, double d, double e,char f){
        EmplID =a;
        firstName = b;
        lastName = c;
        hourlyRate = d;
        status=f;
        hoursWorked = e;
        

    }
    public void setId(String a){
        EmplID =a;
    }
    public void setfirstName(String b){
        firstName = b;
    }
    public void setlastName(String c){
        lastName = c;
    }
    public void setRate(double d){
        hourlyRate = d;
    }
    public void setHour(double e){
        hoursWorked = e;
    }
    public void setStatus(char f){
        status=f;
    }
    
    public String getfirstName() {
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public double getRate(){
        return hourlyRate;
    }
    public double getHour(){
        return hoursWorked;
    }
    public char getStatus(){
        return status;
    }
    public double getTotalPay(){
        double pay=0;
        if (hoursWorked<=40){
            pay = hourlyRate*hoursWorked;
        }
        else
        if(hoursWorked>40){
            pay = (40*hourlyRate)+(hoursWorked-40)*(hourlyRate*1.5);
        }
        return pay;

    }



}
