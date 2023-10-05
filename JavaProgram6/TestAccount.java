import java.net.Socket;

import javax.sound.midi.Soundbank;

class Accout{
    int Acc_no;
    String name;
    float Amount;

    void Calculate(int Acc, String n, float amt){
        Acc_no = Acc;
        name = n;
        Amount = amt;
    }
    // deposit method
    void deposit(float amt){
        Amount = Amount+amt;
        System.out.println(amt+"deposite");
    }
    // withdraw method 
    void withdraw(float amt){
        if(Amount<amt){
            System.out.println("insufficient Balance");
        } else {
            Amount = Amount-amt;
            System.out.println(amt+"withdraw");
        }
    }
    // method to check the balance of the account
    void checkBalance(){
        System.out.println("Balance is"+ Amount);
    }
    void Display(){
        System.out.println(Acc_no+" "+name+" "+Amount);
    }
}

public class TestAccount {
    public static void main(String[] args) {
        Accout a1 = new Accout();
        
        a1.Calculate(221386707,"Arjun", 10000);
        a1.Display();

        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();

    }
}
