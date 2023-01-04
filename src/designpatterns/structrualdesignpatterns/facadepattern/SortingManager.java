package designpatterns.structrualdesignpatterns.facadepattern;

// Facade
public class SortingManager {

    private Sorter bubbleSort;
    private Sorter quickSort;
    private Sorter mergeSort;

    public SortingManager() {
        this.bubbleSort = new BubbleSort();
        this.quickSort = new QuickSort();
        this.mergeSort = new MergeSort();
    }

    public void doBubbleSort() {
        bubbleSort.sort();;
    }

    public void doQuickSort() {
        quickSort.sort();;
    }

    public void doMergeSort() {
        mergeSort.sort();;
    }
}
