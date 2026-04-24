public class DynamicStringList implements StringList {
    
    private String[] array;
    private int size;

    public DynamicStringList() {
        array = new String[10];
        size = 0;
    }
    /**
   * Retrieves the string at the specified index in the list.
   *
   * @param index the index of the string to retrieve.
   * @return the string at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
  public String get(int index) 
  {
    if (index < 0 || index >= size())
        {
        throw new IndexOutOfBoundsException("Index" + index + "Size" + size );
        }
    return array[index];
  }
  /**
   * Replaces the string at the specified index with the given value.
   *
   * @param index the index of the string to replace.
   * @param value the new value to set at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
  public void set(int index, String value) {
    if (index < 0 || index >= size()){
        throw new IndexOutOfBoundsException("Index" + index + "Out of Range");
    }
     array[index] = value;
  }

  /**
   * Adds a new string to the end of the list.
   *
   * @param value the string to add to the list.
   */
  public void add(String value) {
    if (size == array.length) { //original array
        String[] newArray = new String[array.length * 2]; //make a new array w length * 2 of original
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    array[size] = value;
    size++;
}

  

  /**
   * Removes the string at the specified index from the list.
   *
   * @param index the index of the string to remove.
   * @return the string that was removed.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
  public String remove(int index) {
      if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index " + index + " out of range");
        }
        String removed = array[index];
        // Shift all elements after index one position to the left
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;        
        size--;
        return removed;
    }
  
  


   /**
   * Returns the number of strings currently in the list.
   *
   * @return the size of the list.
   */
  public int size() {
    
  }

  /**
   * Returns the current capacity of the list (i.e., the number of elements it can hold before resizing).
   *
   * @return the capacity of the list.
   */
  public int capacity();{
    
  }
}

