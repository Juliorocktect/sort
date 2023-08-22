public class Sort {
    private int[] list;

    public Sort (int[] list) {
        this.list = list;
    }
    public void bubbleSort() {

    }
    public int minimum () {
        int minimum, i;
        i=0;
        minimum = list[0];
        while (i < list.length){
            if (list[i] <= minimum){
                minimum=list[i];

            }
            i++;
        }
        return minimum;
    }
    public int maximum () {
        int max = 0;
        for (int i = 0; i < list.length;i++){
            if(list[i] > max){
                max = list[i];
            }
        }
        return max;
    }
    public void insertionSort() {

    }
    public void selectionSort() {

    }

}
