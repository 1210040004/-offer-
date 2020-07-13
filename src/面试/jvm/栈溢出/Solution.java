package 面试.jvm.栈溢出;

public class Solution {
    public static void main(String[] args) {
        JVMStackSOF jvmStackSOF = new JVMStackSOF();
        try{
            jvmStackSOF.stackleak();
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
}
class JVMStackSOF{
    int length = 1;
    public void stackleak(){
        length++;
        stackleak();
    }
}