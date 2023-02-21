package ArrayList;

public class ArrayList {
    private int size = 16;
    private int[] array = new int[size];
    private int k = 0;

    public ArrayList() {
    }

    public void add(int a) {
        if (k < array.length - 1) {
            array[k++] = a;
            System.out.println(a);
        } else {
            size = array.length * 2;
            a = array[k++];
            System.out.println(a);
        }
    }

    public int get(int i) {
        System.out.println(array[i]);
        return array[i];
    }

    public void remove(int n) {
        for (int i = n; i < k; i++) {
            array[i] = array[i + 1];
        }
    }
}
