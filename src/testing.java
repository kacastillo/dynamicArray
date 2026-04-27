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
    public void testSet() {
        // test set value at index 1 -> not good
        boolean threw = false;
        DynamicStringList list = new DynamicStringList();
        list.add("meomeo");
        try {
            list.set(1, "mewmew");
        } catch (IndexOutOfBoundsException out) {
            threw = true;
        }
        assertEquals(true, threw);
        }
    
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
    public void testRemove() {
        DynamicStringList list = new DynamicStringList();
        list.add("kelley");
        list.add("kate");
        list.add("partners");

        // Remove first element
        String removedFirst = list.remove(0);
        assertEquals("kelley", removedFirst);
        assertEquals(2, list.size());
        assertEquals("kate", list.get(0));
 
    }


    @Test // Test method for int size()
     public void testSize() {
        DynamicStringList list = new DynamicStringList();
            // should be 0
            assertEquals(0, list.size());

            // Test if have 3 thing -> size 3
            list.add("meo");
            list.add("mew");
            list.add("meow");
            assertEquals(3, list.size());
     }

    @Test // Test method for int capacity()
    public void testCapacity() {
        DynamicStringList list = new DynamicStringList();
        // list make at 10 already -> test correct
        assertEquals(10, list.capacity());

        // make a for loop? to test if size bigger
        for (int i=0; i < 10; i++) {
            list.add("Meow" + i);
        }
        list.add("I'm fat and I need bigger space");
        // should be 20 because we add() make array * 2 when add value more than size
        assertEquals(20, list.capacity());
    }
    }

    

    
