package test;
import static org.junit.Assert.*;
import org.junit.Test;
import main.TOH;
public class TOHTest {
    @Test
    public void testmovesForDiskLessThanTowerr1(){
        int disk = 3, startTower = 1, endTower = 5;
        TOH.count=0;
        TOH.movesForDiskLessThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 5);
        assertNotEquals(TOH.count, 6);
    }
    @Test
    public void testmovesForDiskLessThanTower2(){
        int disk = 3, startTower = 1, endTower = 10;
        TOH.count = 0;
        TOH.movesForDiskLessThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 5);
        assertNotEquals(TOH.count, 10);
    }
    @Test
    public void testmovesForDiskLessThanTower3(){
        int disk = 6, startTower = 1, endTower = 10;
        TOH.count=0;
        TOH.movesForDiskLessThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 11);
    }
    @Test
    public void testmovesForDiskEqualAndMoreThanTower1(){
        int disk = 5, startTower = 1, endTower = 5;
        TOH.count=0;
        TOH.movesForDiskEqualAndMoreThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 11);
    }
    @Test
    public void testmovesForDiskEqualAndMoreThanTower2(){
        int disk = 10, startTower = 1, endTower = 10;
        TOH.count=0;
        TOH.movesForDiskEqualAndMoreThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 21);
    }
    @Test
    public void testmovesForDiskEqualAndMoreThanTower3(){
        int disk = 7, startTower = 1, endTower = 7;
        TOH.count=0;
        TOH.movesForDiskEqualAndMoreThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 15);
    }
    @Test
    public void testmovesForDiskEqualAndMoreThanTower4(){
        int disk = 6, startTower = 1, endTower = 5;
        TOH.count=0;
        TOH.movesForDiskEqualAndMoreThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 19);
    }
    @Test
    public void testmovesForDiskEqualAndMoreThanTower5(){
        int disk = 20, startTower = 1, endTower = 5;
        TOH.count=0;
        TOH.movesForDiskEqualAndMoreThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 262147);
    }
    @Test
    public void testmovesForDiskEqualAndMoreThanTower6(){
        int disk = 15, startTower = 1, endTower = 6;
        TOH.count=0;
        TOH.movesForDiskEqualAndMoreThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 4101);
    }
    @Test
    public void testmovesForDiskEqualAndMoreThanTower7(){
        int disk = 20, startTower = 1, endTower = 10;

        TOH.count=0;
        TOH.movesForDiskEqualAndMoreThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 8205);
    }
    @Test
    public void testmovesForDiskEqualAndMoreThanTower8(){
        int disk = 17, startTower = 1, endTower = 7;
        TOH.count=0;
        TOH.movesForDiskEqualAndMoreThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 8199);
    }
    @Test
    public void testmovesForDiskEqualAndMoreThanTower9(){
        int disk = 8, startTower = 1, endTower = 7;
        TOH.count=0;
        TOH.movesForDiskEqualAndMoreThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 23);
    }
    @Test
    public void testmovesForDiskEqualAndMoreThanTower10(){
        int disk = 13, startTower = 1, endTower = 9;
        TOH.count=0;
        TOH.movesForDiskEqualAndMoreThanTower(disk,startTower,endTower);
        assertEquals(TOH.count, 139);
    }
    
}
