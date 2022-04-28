public class StaticExample {
    int a;
    int b;
    static int c;
    public void callStatic(){

        c =  1000;
        System.out.println("call from callStatic:"+c);

    }
    public static void main(String[] args){
        StaticExample sx1 = new StaticExample();
        sx1.a=10;
        sx1.b=20;
        sx1.c=100;
        System.out.println("Static variable : c="+ c);
        StaticExample sx2 = new StaticExample();
        sx2.a=10;
        sx2.b=20;
        sx2.c=100;
        System.out.println("Static variable : c="+ c);



    }
}
