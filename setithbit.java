import java.util.*;

public class setithbit {
    public static int ithbitset(int num,int index){
        int bitmask=1<<index;
        return num | bitmask;
    
    }
    public static void main(String args[]) {
        System.out.println(ithbitset(10, 2));
    }
}
