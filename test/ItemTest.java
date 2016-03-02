import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void testGetKey_provides_key_stored() throws Exception {
        Item<String, String> item;
        item = new Item<String, String>("name", "ram");
        assertEquals(item.getValue(), "ram");
        item.setValue("raj");
        assertEquals("name", item.getKey());
    }

    @Test
    public void testToString() throws Exception {
        Item<String, String> item;
        item = new Item<String, String>("name", "ram");
        assertEquals("name=ram", item.toString());
    }

    @Test
    public void testHasSameKeyForKeyPresentInItemObject() throws Exception {
        Item<String, String> item;
        item = new Item<String, String>("name", "ram");
        assertTrue(item.hasSameKey("name"));
    }

    @Test
    public void testHasSameKeyForKeyNotPresentInItemObject() throws Exception {
        Item<String, String> item;
        item = new Item<String, String>("name", "ram");
        assertFalse(item.hasSameKey("nam"));
    }
}