public class IntArrayList implements IntList {

    private int[] numbers;
    private int size;

    public IntArrayList() {
        numbers = new int[10]; // tamaño inicial 10
        size = 0;
    }

    @Override
    public void add(int number) {

        // Si el array está lleno, lo ampliamos un 50%
        if (size == numbers.length) {

            int newLength = numbers.length + (numbers.length / 2);
            int[] newArray = new int[newLength];

            // Copiar elementos al nuevo array
            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }

            numbers = newArray;
        }

        // Añadir el nuevo número
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
