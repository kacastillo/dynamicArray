import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

public class testing {
    
    @Test // Test method for String get(int index)
    public void testGet() {
        DynamicStringList list = new DynamicStringList(); // make sure it captures from dynamicstringlist
        list.add("hello");
        list.add("world");

        assertEquals("hello", list.get(0));
        assertEquals("world", list.get(1));
        try {
            list.get(5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test // Test method for void set(int index, String value)
    public void testSet() {}
    
    @Test // Test method for void add(String value)
    public void testAdd() {
        DynamicStringList list = new DynamicStringList();
        list.add("a"); 
        list.add("b");
        list.add("c");

        assertEquals(3, list.size()); 
        assertEquals("a", list.get(0));  // make sure it captures from dynamicstringlist
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));

        for (int i = 0; i < 10; i++) { // add 10 more elements to trigger resizing
            list.add("extra"); 
        }
        assertEquals(13, list.size()); // size should be 13 after adding 13 elements
    }

    @Test // Test method for String remove(int index)
    public void testRemove() {}

    @Test // Test method for int size()
     void testSize() {}

    @Test // Test method for int capacity()
    void testCapacity() {}
    }

    

    
