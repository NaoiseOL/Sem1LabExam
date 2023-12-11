package ie.atu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShiftWorker {
    private String name;
    private String gender;
    private int Shift;
    private int age;

    public ShiftWorker(){
       this.name= "";
       this.gender="N/A";
       this.Shift=1;
       this.age=0;
    }

    public ShiftWorker(String name, String gender, int Shift, int age){
        this.name=name;
        this.gender=gender;
        this.Shift=Shift;
        this.age=age;
    }

    public void setName(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter Worker name: ");
            String input = scanner.nextLine();
            if (input.length() < 6 || input.length() > 21) {
                System.out.println("Invalid Name length");
            }
            else{
                this.name=input;
            }
    }

    public String getName(){
        return name;
    }

    public void setGender(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you Male, Female or Non-Binary");
        String input=scanner.nextLine();
        if(input == "Male"){
            this.gender="Male";
        }
        else if (input == "Female"){
            this.gender="Female";
        }
        else if(input == "Non-Binary"){
            this.gender="Non-Binary";
        }
    }

    public String getGender(){
        return gender;
    }

    public void setShift(){
        int x = 0;
        while(x==0) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Are you '1'-Days\n'2'-Nights");
                int input = Integer.parseInt(scanner.nextLine());
                if (input < 1 || input > 2) {
                    System.out.println("Invalid Input");
                }
                else{
                    this.Shift=input;
                    x++;
                }
            } catch (NumberFormatException g) {
                System.out.println("Invalid Numerical Value");
            }
        }
    }

    public int getShift(){
        return Shift;
    }

    public void setAge(){
        int x = 0;
        while(x==0) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter your age");
                int input = Integer.parseInt(scanner.nextLine());
                if (input < 18) {
                    System.out.println("Invalid age to work");
                } else {
                    this.age = input;
                    x++;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid Numerical Value");
            }
        }
    }



}
