package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ShiftWorker shiftWorker1 = new ShiftWorker("Naoise", "Male", 2, 34);
        ShiftWorker shiftWorker2 = new ShiftWorker();
        ShiftWorker shiftWorker3 = new ShiftWorker();

        shiftWorker3.setName();
        shiftWorker3.setGender();
        shiftWorker3.setShift();
        shiftWorker3.setAge();

        shiftWorker1.printInfo();
        shiftWorker2.printInfo();
        shiftWorker3.printInfo();

        }
    }