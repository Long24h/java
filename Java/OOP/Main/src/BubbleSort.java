public class BubbleSort {
    private int[] arr = new int[10];
    public BubbleSort(){
        makeRandomArr();
    }
    public int[] makeRandomArr(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Main.randomInt();
        }
        return arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public void sortByBubble(){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i ; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int item : arr) {
            str+= item + " ";
        }
        return str;
    }
}
