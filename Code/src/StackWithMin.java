import java.util.Scanner;
import java.util.Stack;

public class StackWithMin extends Stack<Integer> {

    Stack<Integer> s2;

    public StackWithMin(){
        s2 = new Stack<>();
    }

    public void push(int value){

        if(value <= min())
            s2.push(value);
    }

     public Integer pop(){

        int value = this.pop();

        if(value == s2.peek())
            s2.pop();

        return value;
     }

     public int min(){

         if(s2.isEmpty())
             return Integer.MAX_VALUE;

         else
             return s2.peek();
     }


     public static void main(String[] args){

         Scanner in = new Scanner(System.in);

         StackWithMin st = new StackWithMin();



         for(int i =0; i < 7; i++){

             int val = in.nextInt();

             st.push(val);

             System.out.println(st.min());
         }
     }
}
