package Questions;

public class TwoStacks {


    int[] arr;
    int top1, top2;
    int size;

    public TwoStacks(int n){
        this.arr = new int[n];
        this.size = n;
        this.top1 = -1;
        this.top2 = n;
    }


    public void push1(int x){
        if (top1+1 == top2){
            return;
        }
        top1++;
        arr[top1] = x;
    }

    public void push2(int x){
        if (top1+1 == top2){
            return;
        }
        top2--;
        arr[top2] = x;

    }

    public int pop1(){
        if (top1 == -1){
            return -1;
        }
        int idx = top1--;
        return arr[idx];
    }
    public int pop2(){
        if (top2 == size){
            return -1;
        }
        int idx = top2++;
        return arr[idx];
    }
}
