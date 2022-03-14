import java.io.*;
import java.util.*;

class intArray {
    static public final int SIZE = 256;
    public int[] info = new int[SIZE];
    public int sp = 0; // stack pointer

    public void push(int value) {
        info[sp++] = value;
    }
}

class strArray {
    static public final int SIZE = 256;
    public String[] info = new String[SIZE];
    public int sp = 0; // stack pointer

    public void push(String value) {
        info[sp++] = value;
    }
}

public class inventory {

    intArray item_id = new intArray();
    strArray name = new strArray();
    intArray price = new intArray();
    intArray rate = new intArray();
    intArray total = new intArray();

    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter Item_id > ");
        int id = sc.nextInt();
        System.out.print("Enter name > ");
        String n = sc.next();
        System.out.print("Enter price > ");
        int p = sc.nextInt();
        System.out.print("Enter rate > ");
        int r = sc.nextInt();
        System.out.print("Enter total > ");
        int t = sc.nextInt();

        item_id.push(id);
        name.push(n);
        price.push(p);
        rate.push(r);
        total.push(t);
    }

    void display() {
        System.out.println(
                "ITEM_ID" + "\t" + "NAME" + "\t" + "PRICE" + "\t" + "RATE" + "\t" + "TOTAL");
        for (int i = 0; i < item_id.sp; i++) {
            System.out.println(item_id.info[i] + "\t" + name.info[i] +
                    "\t" + price.info[i] + "\t" + rate.info[i] + "\t" + total.info[i]);
        }
    }

    void search() {
        System.out.print("Enter item_id > ");
        int id = sc.nextInt();
        System.out.println(
                "ITEM_ID" + "\t" + "NAME" + "\t" + "PRICE" + "\t" + "RATE" + "\t" + "TOTAL");
        for (int i = 0; i < item_id.sp; i++) {
            if (item_id.info[i] == id) {
                System.out.println(item_id.info[i] + "\t" + name.info[i] +
                        "\t" + price.info[i] + "\t" + rate.info[i] + "\t" + total.info[i]);
            } 
        }
    }

    public static void main(String[] args) {
        inventory obj = new inventory();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Your Command 1.input | 2.display | 3.search | 4.Exit");
            System.out.print("> ");
            int cmd = sc.nextInt();
            if (cmd == 1) {
                obj.input();
            } else if (cmd == 2) {
                obj.display();
            } else if (cmd == 3) {
                obj.search();
            } else if (cmd == 4) {
                break;
            } else {
                System.out.println("I Don't Understand Your Command");
            }
        }
    }

}
