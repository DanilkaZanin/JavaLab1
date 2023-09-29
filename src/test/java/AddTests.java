import org.example.MyList;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.*;

public class AddTests {
    //Проверка, что add корректно добавляет элемент в пустой список.
    @Test
    public void testAddInEmptyLint(){
        MyList list = new MyList<>();

        list.add(1);

        assertEquals(1,list.size());
        assertTrue(list.contains(1));
        assertFalse(list.isEmpty());
    }

    //Проверка, что add корректно добавляет элемент в список существующих элементов.
    @Test
    public void testAddInNotEmptyList(){
        Integer [] a = {1,2,3,4,5,6,7};

        MyList<Integer> list = new MyList(a);

        int size = list.size();

        list.add(8);

        assertEquals(size + 1, list.size());
        assertTrue(list.contains(8));
    }

    //Проверка, что add корректно добавляет элемент в список существующих элементов после заданного индекса
    @Test
    public void testAddWithIndexInNotEmptyList(){
        Integer [] a = {1,2,3,4,5,6,7};

        MyList<Integer> list = new MyList(a);

        int size = list.size();

        list.add(8,3);

        assertEquals(size + 1, list.size());
        assertTrue(list.contains(8));
    }
        //Проверка, что add обрабатывает ошибку, когда индекс указан неверно.
    @Test
    public void testAddWithInvalidIndexException(){
        Integer [] a = {1,2,3,4,5,6,7};

        MyList<Integer> myList = new MyList<>(a);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        myList.add(10,10);

        assertEquals("Индекс выходит за границы списка!", outputStream.toString().trim());

    }

    //Проверка, что add обрабатывает ошибку, когда значение равно null.
    @Test
    public void testAddWithNull() {
        Integer[] a = {1,2,3,4};
        MyList<Integer> myList = new MyList<>();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        myList.add(null);


        assertEquals("null вставлять нельзя!", outputStream.toString().trim());
    }
}
