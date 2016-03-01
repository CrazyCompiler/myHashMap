import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void testGetKey_provides_key_stored() throws Exception {
        Item<String, String> item;
        item = new Item<>("name", "ram");
        assertEquals(item.getValue(), "ram");
        item.setValue("raj");
        assertEquals("name", item.getKey());
    }

    @Test
    public void testToString() throws Exception {
        Item<String, String> item;
        item = new Item<>("name", "ram");
        assertEquals("name=ram", item.toString());
    }
}