package Medina_p5;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ContactItemTest {
    @Test
    public void creationFailsWithAllBlankValues(){
    }
    @Test
    public void creationSucceedsWithBlankEmail(){
        ContactItem cont = new ContactItem("Eddy", "Medina", "561-714-6797", "");
        //assertEquals(true, );
    }
    @Test
    public void creationSucceedsWithBlankFirstName(){
    }
    @Test
    public void creationSucceedsWithBlankLastName(){
    }
    @Test
    public void creationSucceedsWithBlankPhone(){
    }
    @Test
    public void creationSucceedsWithNonBlankValues(){
    }
    @Test
    public void editingFailsWithAllBlankValues(){
    }
    @Test
    public void editingSucceedsWithBlankEmail(){
    }
    @Test
    public void editingSucceedsWithBlankFirstName(){
    }
    @Test
    public void editingSucceedsWithBlankLastName(){
    }
    @Test
    public void editingSucceedsWithBlankPhone(){
    }
    @Test
    public void editingSucceedsWithNonBlankValues(){
    }
    @Test
    public void testToString(){
    }

}
