package edu.upc.eetac.dsa;

import org.junit.Assert;
import org.junit.Test;

public class I18NManagerTest {


    @Test
    public void testGetText() {
        Assert.assertEquals("Hola", I18NManager.getInstance().getText("es", "l1"));
        Assert.assertEquals("Hola", I18NManager.getInstance().getText("es", "l1"));
        Assert.assertEquals("Adios", I18NManager.getInstance().getText("es", "l2"));

        Assert.assertEquals("Hello", I18NManager.getInstance().getText("en", "l1"));
        Assert.assertEquals("GoodBye", I18NManager.getInstance().getText("en", "l2"));
    }
}
