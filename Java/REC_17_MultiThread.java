package Java;

class oddnum implements Runnable{
    public void run(){
        for (int i=1; i<=10; i++){
            if(i%2 != 0){
                System.out.println(i + "is odd");
            }
        }
    }
}

class evennum implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            if(i%2 == 0){
                System.out.println(i + "is even");
            }
        }
    }
}

public class REC_17_MultiThread {

    public static void main(String[] args) {
        oddnum t1 = new oddnum();
        evennum t2 = new evennum();
        t1.run();
        t2.run();
    }
}