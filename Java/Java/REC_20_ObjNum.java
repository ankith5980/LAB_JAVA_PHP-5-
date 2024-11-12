package Java;

public class REC_20_ObjNum {

    static int c = 0;
    REC_20_ObjNum(){
        c++;
    }

    public static void main(String[] args) {
        REC_20_ObjNum on1 = new REC_20_ObjNum();
        REC_20_ObjNum on2 = new REC_20_ObjNum();
        System.out.println("Count = " + c);
    }
}