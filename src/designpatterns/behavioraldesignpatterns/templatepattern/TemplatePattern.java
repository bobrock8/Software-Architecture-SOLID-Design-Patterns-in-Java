package designpatterns.behavioraldesignpatterns.templatepattern;

public class TemplatePattern {
    public TemplatePattern() {
        int[] nums = {1, 5, 3, -2, 10, 12, 8, 6, 5};

        Algorithm sorting = new BubbleSort(nums);
        Algorithm sorting2 = new SelectionSort(nums);

        sorting.sort();
        sorting2.sort();
    }
}
