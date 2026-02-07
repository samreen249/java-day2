public class Operators {
    public static void main(String args[]){
        int a=10;
        int b=20;
        //Arithmetic operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //Relational operators
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        //Unary operators
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        //Logical operators
        System.out.println(a<b&&b>a);
        System.out.println(a>b||b<a);
        System.out.println(~a);
        int marks=92;
        if(marks>=90&&marks<=100){
        System.out.println("S grade");
        }
        else if(marks>40||marks==40){
        System.out.println("ABCD");
        }
        else{
        System.out.println("fail");
        }
        //Bitwise operators
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(a>>2);
        System.out.println(a<<2);
        System.out.println(b>>1);
        
    }

    
}
