import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());

    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount(); //4
        list.addCity(new City("Halifax","NS"));
        assertEquals(listSize+1, list.getCount()); //5
    }

    @Test
    public void hasCityTest(){
        list.addCity(new City("Dhaka", "BD"));
        assertEquals(list.hasCity(),true);

    }

    @Test
    public void deleteCityTest(){
        list.addCity(new City("Dhaka","BD"));
        int listSize = list.getCount() ;
        list.deleteCity();
        assertEquals(list.getCount(), listSize-1);
    }

    @Test
    public void countCityTest(){
        list.addCity(new City("Dhaka","BD"));
        assertEquals(list.getCount(), 1);
    }

}
