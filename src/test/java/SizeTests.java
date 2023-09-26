import org.example.MyList;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SizeTests {

    private Integer[] a = {1,2,3,4,5,6,7};

    @Test
    public void testSizeWhenListIsEmpty(){
        MyList list = new MyList();

        assertEquals(0,list.size());
    }

    @Test
    public void testSizeWithOneElementInList(){
        MyList<Integer> list = new MyList<>(1);

        assertEquals(1,list.size());
    }

    @Test
    public void testSizeWithArrayInside(){
        MyList<Integer> list = new MyList<>(a);
        assertEquals(7,list.size());
    }

    @Test
    public void testSizeAfterRemovingOneElement(){
        MyList<Integer> list = new MyList<>(a);

        list.remove(2);

        assertEquals(6,list.size());

        list.remove(0);
        list.remove(4);
        assertEquals(4,list.size());

        list.remove(10);
        assertEquals(4,list.size());

    }

    @Test
    public void testSizeAfterRemovingType(){
        Integer[] b = {1,2,3,4,5,4,4,5,8,9};

        MyList<Integer> list = new MyList<>(b);

        list.removeType(4);

        assertEquals(7, list.size());
    }
}
