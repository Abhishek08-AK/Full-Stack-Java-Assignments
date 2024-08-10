import java.util.Scanner;

public class QueueDemo {
    int size = 5;
    int front = 0;
    int rear = -1;
    int currentSize = 0;
    int queue[] = new int[size];

    void push(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            rear++;
            queue[rear] = value;
            currentSize++;
            display();
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            front++;
            currentSize--;
            display();
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            for (int i = 0; i < currentSize; i++) {
                System.out.print(queue[(front + i)] + " ");
            }
            System.out.println();
        }
    }

    boolean isEmpty() {
        return currentSize == 0;
    }

    boolean isFull() {
        return currentSize == size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueDemo qd = new QueueDemo();
        String ch1 = "y";

        while (ch1.equals("y")) {
            System.out.println("1.Push \n2.Pop \n3.Display");
            System.out.print("Enter choice: ");
            int ch2 = sc.nextInt();

            switch (ch2) {
                case 1:{
                    System.out.print("Enter the value to push into Queue: ");
                    int value = sc.nextInt();
                    qd.push(value);
                    break;
                }
                case 2:{
                    qd.pop();
                    break;
                }
                case 3:{
                    qd.display();
                    break;
                }
                default:{
                    System.out.println("Wrong choice");
                    break;
                }
            }

            System.out.print("Do you want to continue again? (y/n): ");
            ch1 = sc.next();
        }

        sc.close();
    }
}
