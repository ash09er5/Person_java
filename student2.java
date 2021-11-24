public class student2 extends person{
    private int credit;
    private String major;
    private char status;

    student2(){
        credit=0;
        major="";
        status='R';
    }
    student2(int a,String b,char c){
        credit = a;
        major = b;
        status=c;
    }
    public int getCredit(){
        return credit;
    }
    public String getMajor(){
        return major;
    }
    public char getStatus(){
        return status;
    }
    public void setCredit(int a){
        credit = a;
    }
    public void setMajor(String b){
        major=b;
    }
    public void setStatus(char c){
        status=c;
    }
    
    public int calculateTuition(){
        int tuition= 6930;
        //Full-Time New York
        if (credit >= 15 && status =='R'){
             tuition = 6930;
            
            }
         // Part-time New York
            else if (credit <= 15 && status =='R'){
              tuition = 305 * credit;
            
            }
         //Full-time  Non New York
            else if(credit >= 15 && status == 'N' ){
             tuition = 620 *credit;
                
            }
            //Part-time non New York 
            else if(credit <=15 && status == 'N'){
             tuition = 620 * credit;
                
            }
            return tuition;
        }
        @Override
        public String toString(){
            String c = "( Major:"+major+ "Credit:"+credit+"Status:"+status+ ")";
            return c;
}
}
