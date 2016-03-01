import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MyHashMapTest {

    @Test
    public void testPutGetWithoutGivingsize() {
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("name1", "raj");
        map.put("name2", "viraj");
        assertEquals("viraj", map.get("name2"));
    }

    @Test
    public void testPutGetForGreaterNumberOfValuesThanInitialSize() {
        MyHashMap<String, String> map = new MyHashMap<>();
        for (int index=0; index < 20; index++) {
            map.put("name"+index, "student"+index);
        }
        System.out.println(map);

    }
}