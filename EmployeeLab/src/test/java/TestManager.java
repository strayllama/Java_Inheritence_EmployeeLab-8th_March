import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {

    Manager aManager;

    @Before
    public void before() {
        aManager = new Manager("Sarah Johnson", "DQ010101P", 120000, "Tech Dev" );
    }

    @Test
    public void canGetName() {
        assertEquals("Sarah Johnson", this.aManager.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("DQ010101P", this.aManager.getniNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(120000, this.aManager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Tech Dev", this.aManager.getDeptName());
    }

    @Test
    public void canSetName() {
        aManager.setName("Joe");
        assertEquals("Joe", this.aManager.getName());
    }

    @Test
    public void canSetNiNumber() {
        aManager.setNiNumber("AB123456");
        assertEquals("AB123456", this.aManager.getniNumber());
    }

    @Test
    public void canSetSalary() {
        this.aManager.setSalary(20);
        assertEquals(20, this.aManager.getSalary(), 0.01);
    }

    @Test
    public void canSetDeptName() {
        this.aManager.setDeptName("Loo Manager");
        assertEquals("Loo Manager", this.aManager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        this.aManager.raiseSalary(2);
        assertEquals(240000,this.aManager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(1200, this.aManager.payBonus(), 0.01);
    }

}