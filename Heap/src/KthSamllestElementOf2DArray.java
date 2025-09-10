import java.util.PriorityQueue;


class Element{
    int val;
    int raw;
    int col;
    public Element(int val, int raw, int col){
        this.val = val;
        this.raw = raw;
        this.col = col;
    }
}
public class KthSamllestElementOf2DArray {

    public int kthSmallest(int mat[][], int k){
        int n = mat.length;
        // create min heap
        PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // put each element of first row
        for (int i = 0; i < n; i++) {
            pq.offer(new Element(mat[i][0], i, 0));
        }

        Element element = null;
        while (k-- > 0){
            element = pq.poll();
            if(element.col + 1 < mat[element.raw].length){
                pq.offer(new Element(mat[element.raw][element.col+1], element.raw, element.col+1));
            }
        }

        return element.val;

    }
}
