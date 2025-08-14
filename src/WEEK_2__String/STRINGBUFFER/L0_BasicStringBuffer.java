package src.WEEK_2__String.STRINGBUFFER;

public class L0_BasicStringBuffer {

    public static void main(String[] args) {

        // Mutable
        // Thread safe -> at same two threads can access the same stringBuffers data
        // bit slow as compare to StringBuilder(SyncOverhead) due to thread safety
        // used in -> Multi-threaded text modification


        // simple constructor -> 1
        StringBuffer sb = new StringBuffer();  //empty buffer with default capacity 16

        // constructor  type -> 2
        StringBuffer sb1 = new StringBuffer("Rahul");

        // constructor type -> 3 ->  here default capacity is 16
        StringBuffer sb2 = new StringBuffer(30);


        sb.append("hi there ");
        System.out.println(sb);

        sb.insert(2, " Rahul");
        System.out.println(sb);

        sb.replace(1,5, "some");
        System.out.println(sb);

        sb.delete(2,4);
        System.out.println(sb);

        sb.reverse();

    }
}
