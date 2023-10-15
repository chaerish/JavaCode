public class Main2 {
    public static void printInts(int[] data) {
        for (int i : data) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] data1 = { 12, 32, 3, 45, 5, 17, 19, 24 };
        int[] data2 = { 12, 32, 3, 45, 5, 17, 19, 24 };
        int[] data3 = { 12, 32, 3, 45, 5, 17, 19, 24 };
        Sorter sorter = new Sorter(new BubbleSortAlg());
        System.out.println("Bubble sort");
        sorter.sort(data1);
        Main2.printInts(data1);
        System.out.println("Selection sort");
        sorter.setSortAlg(new SelectionSortAlg());
        sorter.sort(data2);
        Main2.printInts(data2);
        System.out.println("Insertion sort");
        sorter.setSortAlg(new InsertionSortAlg());
        sorter.sort(data3);
        Main2.printInts(data3);
    }
}