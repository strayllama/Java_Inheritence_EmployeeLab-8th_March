import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    Developer aDeveloper;

    @Before
    public void before() {
        aDeveloper = new Developer("Sarah Johnson", "DQ010101P", 120000);
    }

    @Test
    public void canGetName() {
        assertEquals("Sarah Johnson", this.aDeveloper.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("DQ010101P", this.aDeveloper.getniNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(120000, this.aDeveloper.getSalary(), 0.01);
    }

    @Test
    public void canSetName() {
        aDeveloper.setName("Joe");
        assertEquals("Joe", this.aDeveloper.getName());
    }

    @Test
    public void canSetNiNumber() {
        aDeveloper.setNiNumber("AB123456");
        assertEquals("AB123456", this.aDeveloper.getniNumber());
    }

    @Test
    public void canSetSalary() {
        this.aDeveloper.setSalary(20);
        assertEquals(20, this.aDeveloper.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        this.aDeveloper.raiseSalary(2);
        assertEquals(240000,this.aDeveloper.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(1200, this.aDeveloper.payBonus(), 0.01);
    }
    
}
