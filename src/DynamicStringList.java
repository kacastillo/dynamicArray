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
}
