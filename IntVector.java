public class IntVector implements IntList {
    private int[] numbers;
    private int size;

    public IntVector() {
        numbers = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == numbers.length) {
            int newLength = numbers.length * 2;
            int[] newArray = new int[newLength];

            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }

            numbers = newArray;
        }

        numbers[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return numbers[id];
    }
}
