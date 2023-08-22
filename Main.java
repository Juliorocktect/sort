public class Main {
    public static void main(String[] args) {
        int list[] = {7,4,6,8,5,5,67,7,354,78,7,2,234};
        Sort sort = new Sort(list);
        sort.ausgeben();
        sort.bubbleSort();
        sort.ausgeben();
    }

}
