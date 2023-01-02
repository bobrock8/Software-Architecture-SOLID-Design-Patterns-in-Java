package designpatterns.behavioraldesignpatterns.templatepattern;

public abstract class Algorithm {
    protected int[] nums;

    public Algorithm(int[] nums) {
        this.nums = nums;
    }

    protected abstract void initialize();
    protected abstract void sorting();
    protected abstract void showResult();

    protected void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // template pattern
    public void sort() {
        initialize();
        sorting();
        showResult();
    }
}
