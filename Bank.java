import  java.util.Scanner;
class Bank{
public static void main(String arg[])
{
Scanner input = new Scanner(System.in);
int userInput ;
int size = 0;
double[] accountBalance = new double[250];
String[] accountNames = new String[250];
for(;true;){

System.out.println("Bank Admin Menu:");
System.out.println("Please enter a menu option");
System.out.println("(1): Add customer to the bank ");
System.out.println("(2): Change customer name ");
System.out.println("(3): Check account balance ");
System.out.println("(4): Modify account balance");
System.out.println("(5): Bank Summary");
System.out.println("(6): Quit");

 userInput = input.nextInt();
if(userInput == 1)
{
System.out.println("Bank Add Customer Menu :");
System.out.println("Please enter an account balance ");
double balance = input.nextDouble();
accountBalance[size] = balance;	
System.out.println("Please enter the account holder name");
input.nextLine();
String name = input.nextLine();
accountNames[size] = name;
System.out.println("Customer ID is : "+ size);
size = size + 1;
}
else if(userInput == 2)
{
System.out.println("Bank Change Name Menu");
System.out.println("Please Enter a Customer ID to change their name");
int index = input.nextInt();
System.out.println("What is the customer's new name ?");
input.nextLine();
accountNames[index] = input.nextLine();
}
else if(userInput == 3)
{
System.out.println("Bank Check Balance Menu ");
System.out.println("Please enter a customer ID to check the balance");
int index = input.nextInt();
double balance = accountBalance[index];
System.out.println("This customer has " + balance + " in their account"); 
}
else if(userInput == 4)
{
System.out.println("Bank Modify Balance Menu ");
System.out.println("Please enter a customer ID to modify the balance");
int index = input.nextInt();
System.out.println("Please input new balance: ");
accountBalance[index] = input.nextDouble();
}
else if(userInput == 5)
{
System.out.println("Bank All customer Summary Menu :");
double total = 0;
for(int i = 0; i < size ; i++)
{
 total = total + accountBalance[i];
System.out.println(accountNames[i] + " has $" + accountBalance[i] + " in their account");
}
System.out.println("In total ,there is $" + total + "in the bank");
}
else if(userInput == 6)
{
System.exit(6);
}
else 
{
System.out.println("ERROR ! Invalid input");
}
}
}
}
