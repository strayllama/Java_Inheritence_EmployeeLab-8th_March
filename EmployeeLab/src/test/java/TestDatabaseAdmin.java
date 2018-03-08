import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {
    
    DatabaseAdmin aDatabaseAdmin;

    @Before
    public void before() {
        aDatabaseAdmin = new DatabaseAdmin("Sarah Johnson", "DQ010101P", 120000);
    }

    @Test
    public void canGetName() {
        assertEquals("Sarah Johnson", this.aDatabaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("DQ010101P", this.aDatabaseAdmin.getniNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(120000, this.aDatabaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canSetName() {
        aDatabaseAdmin.setName("Joe");
        assertEquals("Joe", this.aDatabaseAdmin.getName());
    }

    @Test
    public void canSetNiNumber() {
        aDatabaseAdmin.setNiNumber("AB123456");
        assertEquals("AB123456", this.aDatabaseAdmin.getniNumber());
    }

    @Test
    public void canSetSalary() {
        this.aDatabaseAdmin.setSalary(20);
        assertEquals(20, this.aDatabaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        this.aDatabaseAdmin.raiseSalary(2);
        assertEquals(240000,this.aDatabaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(1200, this.aDatabaseAdmin.payBonus(), 0.01);
    }


}
