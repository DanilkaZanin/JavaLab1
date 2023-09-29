import org.example.MyList;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class RemoveTests {
    private MyList<Integer> myList;
    @Before
    public void init(){
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        myList = new MyList<>(arr);
    }

    //Проверка, что remove удаляет необходимое значение
    @Test
    public void testRemoveRemovesRequiredValue(){
        int size = myList.size();

        myList.remove(3); //предполагаемое значение 4

        assertEquals(size - 1, myList.size());
        assertFalse(myList.contains(4));
    }

    //Проверка, что remove корректно удаляет первый элемент.
    @Test
    public void testRemoveRemovesFirstValue(){
        int size = myList.size();

        myList.remove(0); //предполагаемое значение 4

        assertEquals(size - 1, myList.size());
        assertFalse(myList.contains(1));
    }

    //Проверка, что remove обрабатывает исключение, когда индекс выходит за границы списка
    @Test(expected = NoSuchElementException.class)
    public void testRemoveIndexOutOfBoundsException(){
        myList.remove(20);
    }
}
