import java.util.Scanner;

public class StackDemo {
    int top=-1, size=5;
    int stack[]=new int[size];

    void push(int value){
        if(isFull()==1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            stack[top]=value;
            display();
        }
    }

    void display(){
        if(isEmpty()==1){
            System.out.println("Stack is empty");
        }else{
            System.out.print("Stack: ");
            for(int i=0;i<=top;i++){
                System.out.print(stack[i]+ " ");
            }
            System.out.println();
        }
    }

    void pop(){
        if(isEmpty()==1){
            System.out.println("Stack is empty");
        }else{
            top--;
            display();
        }
    }

    int isEmpty(){
        if(top<0){
            return 1;
        }else{
            return 0;
        }
    }

    int isFull(){
        if(top==size){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ch1="y";
        int ch2;
        StackDemo sd=new StackDemo();

        while (ch1.equals("y")) {
           
            System.out.println("1.Push \n2.Pop \n3.Print");
            System.out.print("Enter choice :");
            ch2=sc.nextInt();

            switch (ch2) {
                case 1:{
                    int v;
                    System.out.print("Enter the value to push into stack : ");
                    v=sc.nextInt();
                    sd.push(v);
                    break;
                }
            case 2 :{
                sd.pop();
                break;
            }  
             
            case 3 :{
                sd.display();
                break;
            }
            
            default:{
                System.out.println("Wrong Choice :");
                break;
            }
                
            }

            System.out.print("Do you want to continue again ? (y/n) ==> ");
            ch1=sc.next();
           
        }
        sc.close();
    }
}

