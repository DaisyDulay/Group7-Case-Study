
package mainbank;
public class Customer extends Person{
        static     String Address ;
        static     String ContactNum;
        static     String AccountNum;
        static     String password;
        static     String choice ;
    
        
        //Gerrymee tañedo "Method 11"   
            public Customer(String spName){
		super(spName);
            }public void Address (String Address){
                this.Address=Address;   
            }public String Address(){
                return Address;
            } 
        
        //Gerrymee tañedo "Method 12"
             void Contact (String ContactNum){
             this.ContactNum=ContactNum;
            }public String Contact(){
             return Address;
            }  
          
        //Gerrymee tañedo "Method 13"
            void password(String password){
            this.password=password;
            }public String password(){
            return password;
            }
         
}
      

 