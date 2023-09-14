package Stack;

import java.util.Scanner;

class Stack {
    private int arr[];
    private int top;
    private final int Maxsize = 10;

    Stack() {
        init();
    }

    public void init() {
        this.arr = new int[Maxsize];
        this.top = 0;
    }

    public int capacity() {
        return Maxsize;
    }

    public boolean isEmpty() {
        if (this.top == 0)
            return true;
        return false;
    }

    public boolean isFull() {
        if (this.top == arr.length)
            return true;
        return false;
    }

    public void push(Scanner sc) {
        int item;
        if (isFull()) {
            System.out.println("Stack is Full....");
        } else {
            System.out.println("Enter any item");
            item = sc.nextInt();
            this.arr[top] = item;
            this.top++;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty\n");
        } else {
            // this.arr[top] = 0;
            this.top--;
            int item = arr[top];
            System.out.println(item + " is deleted\n");
        }

    }

    public void peep() {
       if(isEmpty()){
        System.out.println("\nstack is empty...\nThere is no element in stack\n");
       }else{

        for (int i = this.top - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }}
    }

    public void peek() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else
        System.out.println("peek item " + arr[this.top - 1]+"\n");
    }

    public void size() {

        System.out.println("Size of the stack is " + (this.top)+"\n");
    }
    public  void search(int elm){
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return;
        }
        for(int i=0;i<this.top;i++)
        {
            if(elm==this.arr[i])
            {
                System.out.println(elm+" is found on the index "+i);
            }else
                System.out.println("element is not in the stack");
        }


    }
    public  int sum(){
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return 0;
        }
        int sum=0;
        for (int i=0;i<this.top;i++)
        {
            sum+=this.arr[i];
        }
        return sum;
    }
    public void fifo(){
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return;}
        for(int i=0;i<this.top;i++)
        {
            System.out.println(this.arr[i]);

        }
    }
    public void count( int celm){
        int count=0;
        for (int i=this.top-1;i>=0;i--){
            if(this.arr[i]==celm){
            count++;
        }
        }
        System.out.println("count of "+celm+" is "+count);

    }
//    public void ascending() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty");
//            return;
//        }
//        for (int i = 0; i < this.top - 1; i++) {
//            for (int j = 0; j < this.top - i - 1; j++) {
//                if (this.arr[j] > this.arr[j + 1]) {
//                    int temp = arr[j];
//                    this.arr[j] = this.arr[j + 1];
//                    this.arr[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("stack elements in ascending order:");
//        this.peep();
//    }

    public void ascending() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int[] temp_arr =new int[this.Maxsize];
        temp_arr=this.arr;
        for (int i = 0; i < this.top - 1; i++) {
            for (int j = 0; j < this.top - i - 1; j++) {
                if (temp_arr[j] > temp_arr[j + 1]) {
                    int temp = arr[j];
                    temp_arr[j] = temp_arr[j + 1];
                    temp_arr[j + 1] = temp;
                }
            }
        }

        System.out.println("stack elements in ascending order:");
//        this.peep();
        for(int i=0;i<this.top;i++)
        {
            System.out.println(temp_arr[i]);
        }
    }

    public void descending() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int temp_arr[]=new int[this.Maxsize];
        for (int i = 0; i < this.top - 1; i++) {
            for (int j = 0; j < this.top - i - 1; j++) {
                if (temp_arr[j] < temp_arr[j + 1]) {
                    int temp = arr[j];
                    temp_arr[j] = temp_arr[j + 1];
                    temp_arr[j + 1] = temp;
                }
            }
        }

        System.out.println("stack elements in descending order:");
        for(int i=0;i<this.top;i++)
        {
            System.out.println(temp_arr[i]);
        }
//        this.peep();
    }
    public void reverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = 0; i < this.top / 2; i++) {
            int temp = arr[i];
            this.arr[i] = this.arr[this.top - 1 - i];
            this.arr[this.top - 1 - i] = temp;
        }

        System.out.println("Reversed stack:");
        this.peep();
    }
    public  void secondLarge(){
        if (isEmpty() || top < 2) {
            System.out.println("Stack does not have enough elements to find the second largest.");
            return;
        }
        int large=0,slarge=0;
        for (int i=0;i<top;i++)
        {
           if(large<arr[i])
           {
               large=arr[i];
           }
        }
        for (int i=0;i<top;i++)
        {
            if(slarge<arr[i]&&large!=arr[i])
            {
                slarge=arr[i];
            }
        }
        System.out.println("Second larget element is "+slarge);
    }
    public  void secondSmall(){
        if (isEmpty() || this.top < 2) {
            System.out.println("Stack does not have enough elements to find the second smallest.");
            return;
        }
        int small=arr[0],ssmall=arr[0];
        for (int i=0;i<this.top;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];
            }
        }
        for (int i=0;i<this.top;i++)
        {
            if(ssmall>arr[i]&&small!=arr[i])
            {
                ssmall=arr[i];
            }
        }
        System.out.println("Second smallest element is "+ssmall);
    }
    public void max(){
        int max=this.arr[0];
        for(int i=0;i< this.top;i++)
        {
            if(this.arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("maximum element of array "+max);
    }
    public void min(){
        int min=this.arr[0];
        for(int i=0;i< this.top;i++)
        {
            if(this.arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("minimum element of array "+min);
    }

}


public class stackCode {
    public static void main(String[] args) {
        Stack stk = new Stack();
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("Your choices are:-");
            System.out.println("\n1. for Push:\n2. for POP:\n3. for PEEP:\n4. for Peek element:\n5. for SIZE of stack\n6. for capacity\n7. for search an element");
            System.out.println("8.for sum of all element\n9.for display in FIFO:\n10. for count number\n11. for ascending order\n12. for descending\n13. for reverse\n14.for second largest:");
            System.out.println(" 15.for second smallest\n16.for max element\n17. for minimum element\n18. for Exit");
                    ch=sc.nextInt();
            switch (ch) {
                case 1:
                    stk.push(sc);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peep();
                    break;
                case 4:
                    stk.peek();
                    break;
                case 5:
                    stk.size();
                    break;
                    case 6:
                  System.out.println("Capicity of stack is "+stk.capacity());
                            break;
                case 7:
                    System.out.println("Enter element to search");
                    int elm=sc.nextInt();
                    stk.search(elm);
                break;
                case 8:
                    System.out.println("sum of all element "+stk.sum());
                    break;
                case 9: stk.fifo(); break;
                case 10:
                    System.out.println("Enter elment to check its count in stack");
                    int count=sc.nextInt();
                    stk.count(count); break;
                case 11:stk.ascending();
                break;
                case 12:stk.descending();
                    break;
                case 13:stk.reverse();
                    break;
                case 14: stk.secondLarge();
                break;
                case 15: stk.secondSmall();
                    break;
                case 16: stk.max();
            break;
                case 17: stk.min();
                break;
            }

        } while (ch != 18);

    }

}
