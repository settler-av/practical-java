package PART_VII_collectionFramework.III_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// TODO: 16-10-2021 complete the code
public class LoanEligibility {
    //method to check eligibility of loan
    public static boolean checkLoanEligibility(AccountHolder user) {
        return user.age > 21 && user.age < 60 && user.netMonthlyIncome > 15000 && user.workExperience >= 1 && user.citizenship.equalsIgnoreCase("INDIA");
    }
    //main method
    public static void main(String[] args) {
        //create 5 object of AccountHolder class and store them in an arraylist
        ArrayList<AccountHolder> arrayList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the data for user " + (i + 1));
            AccountHolder user = new AccountHolder();
            user.getDataFromUser();
            arrayList.add(user);
//            arrayList.add(new AccountHolder("Adnan", 25,15976,4,"India"));
        }
        //ADD USERS IN ARRAYLIST
        arrayList.add(new AccountHolder("Adnan", 25,15976,4,"India"));
        arrayList.add(new AccountHolder("Kalpit", 19, 15000,1,"INDIA"));
        arrayList.add(new AccountHolder("Raj", 25, 16000,4,"Canada"));


        System.out.println("Loan Eligibility Results");
        for(AccountHolder user:arrayList){
            System.out.println(user.toString());
            System.out.println("Eligibility of user: " + checkLoanEligibility(user) + "\n");
        }
    }
}

//Create a class AccountHolder to store above given information entered by a user.
class AccountHolder {
    String name;
    int age;
    int netMonthlyIncome;
    int workExperience;
    String citizenship;

    //default constructor
    public AccountHolder() {
    }
    public AccountHolder(String name,int age, int netMonthlyIncome, int workExperience, String citizenship) {
        this.name = name;
        this.age = age;
        this.netMonthlyIncome = netMonthlyIncome;
        this.workExperience = workExperience;
        this.citizenship = citizenship;
    }
    public void getDataFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter age: ");
        this.age = sc.nextInt();
        System.out.print("Enter net monthly income: ");
        this.netMonthlyIncome = sc.nextInt();
        System.out.print("Enter working experience: ");
        this.workExperience = sc.nextInt();
        System.out.print("Enter citizenship: ");
        this.citizenship = sc.next();
    }

    @Override
    public String toString() {
        return "AccountHolder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", netMonthlyIncome=" + netMonthlyIncome +
                ", workExperience=" + workExperience +
                ", citizenship='" + citizenship + '\'' +
                '}';
    }
}