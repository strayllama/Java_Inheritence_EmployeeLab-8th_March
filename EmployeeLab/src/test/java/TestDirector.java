import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {

    Director aDirector;

    @Before
    public void before() {
        aDirector = new Director("Missey Elliot", "HJ010101S", 1200000, "CEO Dept", 999999999 );
    }

    @Test
    public void canGetName() {
        assertEquals("Missey Elliot", this.aDirector.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("HJ010101S", this.aDirector.getniNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(1200000, this.aDirector.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("CEO Dept", this.aDirector.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(999999999, aDirector.getBudget(), 0.01);
    }


    @Test
    public void canSetName() {
        aDirector.setName("Steve");
        assertEquals("Steve", this.aDirector.getName());
    }

    @Test
    public void canSetNiNumber() {
        aDirector.setNiNumber("CD45677");
        assertEquals("CD45677", this.aDirector.getniNumber());
    }

    @Test
    public void canSetSalary() {
        this.aDirector.setSalary(20000);
        assertEquals(20000, this.aDirector.getSalary(), 0.01);
    }

    @Test
    public void canSetDeptName() {
        this.aDirector.setDeptName("Cheese Acquirer");
        assertEquals("Cheese Acquirer", this.aDirector.getDeptName());
    }


    @Test
    public void canRaiseSalary() {
        this.aDirector.raiseSalary(2);
        assertEquals(2400000,this.aDirector.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(12000, this.aDirector.payBonus(), 0.01);
    }

}
