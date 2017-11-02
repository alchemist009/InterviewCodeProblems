import java.util.Stack;

public class SortedStack {

    public void sort(Stack<Integer> s){

        Stack<Integer> s2 = new Stack<>();

        while(!s.isEmpty()){
            int val = s.pop();

            while(!s2.isEmpty()  && s2.pop() > val){
                s.push(s2.pop());
            }
            s2.push(val);
        }

        while(!s2.isEmpty())
            s.push(s2.pop());
    }
}
