class DynamicArray {

    private int capacity;
    private int size;
    private int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;

    }

    public int get(int i) {
        return arr[i];

    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity){
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
        int value = arr[size-1];
        size--;
        return value;
    }

    private void resize() {
        capacity = 2 * capacity;
        int newArr [] = new int[capacity];
        for(int i=0;i < size;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
