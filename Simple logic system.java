import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // subject / marks //
        System.out.print("Enter an java marks:");
        int a = sc.nextInt();
        System.out.print("Enter an sql marks:");
        int b = sc.nextInt();
        System.out.print("Enter an python marks:");
        int c = sc.nextInt(); 
    }
    static int total(int a, int b, int c) {
    int total = a + b + c;
    return total;
}
     
}



StudentResultSystem
│
├── main()
│   │
│   ├── Scanner
│   ├── javaMarks
│   ├── sqlMarks
│   ├── htmlMarks
│   │
│   ├── calculateTotal()
│   │       └── return total
│   │
│   ├── calculateAverage()
│   │       └── return average
│   │
│   ├── checkGrade()
│   │       └── if / else-if / else
│   │              ├── A
│   │              ├── B
│   │              ├── C
│   │              ├── D
│   │              └── F
│   │
│   ├── checkResult()
│   │       └── if / else
│   │              ├── PASS
│   │              └── FAIL
│   │
│   └── Print Result
│
└── END