public abstract class person {
    private String name;
    private int id;
    private int phoneNum;
    private String email;

    person(){
        name ="";
        id =0;
        phoneNum=0;
        email="";
    
    }
    person(String a,int b, int c,String d){
        name=a;
        id=b;
        phoneNum=c;
        email=d;
    }
    public void setName(String a){
        name =a;
    }
    public void setId(int b){
        id=b;
    }
    public void setphoneNum(int c){
        phoneNum=c;
    }
    public void setEmail(String d){
        email=d;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getPhonenum(){
        return phoneNum;
    }
    public String getEmail(){
        return email;
    }
    public String toString(){
        String x = "Name:"+name+" Id:"+id+" Phone Number:"+phoneNum+" Email:"+email;
        return x;
    }
}
