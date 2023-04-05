package ATM.com;

import java.util.Scanner;

public class ATM {
   
  String name;
  String userName;
  String password;
  String accountNo;
  float balance = 100000f;
  int transactions = 0;
  static String transactionHistory = "";
    
  // BankAccount(String name, String userName, String password, String accountNo) {
  // this.name = name;
  // this.userName = userName;
  // this.password = password;
  // this.accountNo = accountNo;
  // }
    //main met 
  public  void register() {
      
  Scanner sc = new Scanner(System.in);
 
   System.out.print("\nEnter Your Name - ");
   this.name = sc.nextLine();
   System.out.print("\nEnter Your Username - ");
   this.userName = sc.nextLine();
   System.out.print("\nEnter Your Password - ");
   this.password = sc.nextLine();
   System.out.print("\nEnter Your Account Number - ");
   this.accountNo = sc.nextLine();
   System.out.println("\nRegistration completed..kindly login");
  
  }
  
  public boolean login() {
   
   Scanner scc = new Scanner(System.in);

   boolean isLogin = false;
      while ( !isLogin ) {
    System.out.print("\nEnter Your Username - ");
    
    String Username = scc.nextLine();
    if ( Username.equals(userName) ) {
     while ( !isLogin ) {
      System.out.print("\nEnter Your Password - ");
      String Password = scc.nextLine();
      if ( Password.equals(password) ) {
       System.out.print("\nLogin successful!!");
       isLogin = true;
      }
      else {
       System.out.println("\nIncorrect Password");
      }
     }
    }
    else {
     System.out.println("\nUsername not found");
    }
   }
   return isLogin;
  }
  
  public static void main(String args[] )  
     {  
   
   
   System.out.println("\n*WELCOME TO SBI ATM SYSTEM***\n");
   System.out.println("1.Register \n2.Exit");
   System.out.print("Enter Your Choice - ");
   Scanner sc = new Scanner(System.in);
   int choice = sc.nextInt();
   if (choice==1) {
   ATM A = new ATM();
   A.register();
   
    while(true) {
     System.out.println("\n1.Login \n2.Exit");
     System.out.print("Enter Your Choice - ");
     if (choice==2) {
      
     A.login();
       
        
        }
         //declare and initialize balance, withdraw, and deposit  
         int balance = 100000, withdraw, deposit, cheakbalance,transactions = 0,transactionshistory;  
           
         //create scanner class object to get choice of user  
         
           
         while(true)  
         {  
             System.out.println("Automated Teller Machine");  
             System.out.println("Choose 1 for Withdraw");  
             System.out.println("Choose 2 for Deposit");  
             System.out.println("Choose 3 for Check Balance");  
             System.out.println("Choose 4 for transactions");  
             System.out.println("Choose 5 for transactionshistory");  
             System.out.print("Choose the operation you want to perform:");  
            
             //get choice from user  
             int choice1 = sc.nextInt();  
             switch(choice1)  
             {  
                 case 1:  
                  System.out.print("\nEnter amount to withdraw - ");
                              float amount = sc.nextFloat();
               try {
                
                if ( balance >= amount ) {
                 transactions++;
                 balance -= amount;
                 System.out.println("\nWithdraw Successfully");
                 String str = amount + " Rs Withdrawed\n";
                 transactionHistory = transactionHistory.concat(str);
                 
                }
                else {
                 System.out.println("\nInsufficient Balance");
                }
                
               }
               catch ( Exception e) {
               }
              }
         break;
         }
         int choice2 = sc.nextInt();  
         switch(choice2)  
         {  
         case 2: 
             
             Scanner sc1 = new Scanner(System.in);
             System.out.print("\nEnter amount to deposit - ");
                         float amount = sc1.nextFloat();
                         try {
           if ( amount <= 100000f ) {
            transactions++;
            balance += amount;
            System.out.println("\nSuccessfully Deposited");
            String str = amount + " Rs deposited\n";
            transactionHistory = transactionHistory.concat(str);
           }
           else {
            System.out.println("\nSorry...Limit is 100000.00");
           }
           
          }
          catch ( Exception e) {
          }
          
    
            case 3:  
             
    System.out.println("Balance:"+balance);
    System.out.println(" ");
break;
            case 4:  
             
          System.out.print("\nEnter Receipent's Name - ");
          String receipent = sc.nextLine();
          System.out.print("\nEnter amount to transfer - ");
          float amount1 = sc.nextFloat();
          
          try {
           if ( balance >= amount1 ) {
            if ( amount1 <= 50000f ) {
             transactions++;
             balance -= amount1;
             System.out.println("\nSuccessfully Transfered to " + receipent);
             String str = amount1 + " Rs transfered to " + receipent + "\n";
             transactionHistory = transactionHistory.concat(str);
            }
            else {
             System.out.println("\nSorry...Limit is 50000.00");
            }
           }
           else {
            System.out.println("\nInsufficient Balance");
           }
          }
          catch ( Exception e) {
          }
         
case 5:
if ( transactions == 0 ) {
System.out.println("\nEmpty");
}
else {
System.out.println("\n" + transactionHistory);
}
}
}
    
        }  
    

}
}
   


   






