import java.util.Objects;

public class ListaComArray {

    private Integer[] array;
    private boolean resizable;
    private int initialCapacity;
    private int counter;
    private final static int x = 10;

    public ListaComArray() {
        this(10);
    }

    public ListaComArray(int initialCapacity) {
        this(initialCapacity, true);
    }

    public ListaComArray(int initialCapacity, boolean resizable) {
        this.initialCapacity = initialCapacity;
        this.resizable = resizable;
        this.counter = 0;
        this.array = new Integer[initialCapacity];
    }

    public boolean add(Integer obj) {
        if (counter == array.length) {
            if (resizable) {
                resizeArrayList();
            } else {
                return false;
            }
        }

        array[counter] = obj;
        counter++;
        return true;
    }

    public boolean add(int index, Integer element) {
        if (index < 0 || index > counter) {
            return false;
        }

        if (counter == array.length) {
            if (resizable) {
                resizeArrayList();
            } else {
                return false;
            }
        }

        for (int i = counter; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        counter++;
        return true;
    }

    private void resizeArrayList() {
        Integer novo[] = new Integer[array.length + x];

        System.arraycopy(array, 0, novo, 0, counter);

        array = novo;
    }

    public Integer remove(int index) {
        if (index < 0 || index >= counter) {
            return null;
        }

        int valorRemovido = array[index];

        for (int i = index; i < counter - 1; i++) {
            array[i] = array[i + 1];
        }

        counter--;
        array[counter] = null;
        return valorRemovido;
    }

    public boolean removeFirst(Integer element) {
        for (int i = 0; i < counter; i++) {
            if (Objects.equals(array[i], element)) {
                remove(i);
                return true;
            }
        }
        return false;
    }


    public Integer get(int index) {
        if (index < 0 || index >= counter) {
            return null;
        }

        return (array[index]);
    }

    public void clear() {
        if (resizable) {
            array = new Integer[initialCapacity];
        }
        counter = 0;
    }

    public Integer set(int index, Integer element) {
        if (index < 0 || index >= counter) {
            return null;
        }

        Integer valorAntigo = array[index];
        array[index] = element;
        return valorAntigo;
    }

    public int size() {
        return counter;
    }

    public boolean isEmpty() {
        return (counter == 0);
    }

    public boolean isFull() {
        if (!resizable) {
            return (counter == array.length);
        }

        return false;
    }

    public boolean contains(Integer element) {
        for (int i = 0; i < counter; i++) {
            if (Objects.equals(array[i], element)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Integer element) {
        for (int i = 0; i < counter; i++) {
            if (Objects.equals(array[i], element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Integer element) {
        for (int i = counter - 1; i >= 0; i--) {
            if (Objects.equals(array[i], element)) {
                return i;
            }
        }
        return -1;
    }

    public Integer[] toArray() {
        Integer[] novo = new Integer[counter];
        System.arraycopy(array, 0, novo, 0, counter);
        return novo;
    }

    public String toString() {

        if (counter == 0) {
            return "[ ]";
        }

        String myArray1 = "[ ";
        for (int i = 0; i < counter; i++) {
            if (i != (counter - 1)) {
                myArray1 += array[i] + ", ";
            } else {
                myArray1 += array[i] + " ]";
            }
        }

        return myArray1;
    }

}
