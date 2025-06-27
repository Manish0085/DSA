public class FindOccurrenceOfKey {

    public int countOccurrence(int[] arr, int key){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                count++;
        }
        return count;
    }
}
