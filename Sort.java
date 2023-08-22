public class Sort {
    private int[] list;

    public Sort (int[] list) {
        this.list = list;
    }
    public void bubbleSort() {
        for (int i=0; i<list.length-1; i++){
            if (list[i]<list[i+1]){
                swap (i, i+1);
            }
        }

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
    private void swap (int a, int b) {
        int zwischenPlatz = 0;
        zwischenPlatz = list[a];
        list [a] = list [b];
        list [b] = zwischenPlatz;
    }

    public void ausgeben (){
        for (int i=0; i<list.length; i++){
            System.out.print (list[i] + " " + "\n");
        }
    }

}
