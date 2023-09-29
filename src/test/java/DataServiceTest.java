import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DataServiceTest {

    @Mock  //C junit5 аннотации достаточно? (без создания заглушки в @Before)
    DataService dataServiceMock;

    @Before
    public void setOUp(){
        dataServiceMock = Mockito.mock(DataService.class);
    }

    @Test
    public void testQuery() {
        Assertions.assertNotNull(dataServiceMock);
        Mockito.when(dataServiceMock.getDataById("test")).thenReturn("test");
        String result = dataServiceMock.getDataById("test");
        Assertions.assertEquals("test", result);
    }

    @Test(expected = NullPointerException.class)
    public void testMethodThrowsException() {
        //попробовать с void методом
        Mockito.when(dataServiceMock.getDataById(Mockito.any())).thenThrow(new NullPointerException());
        dataServiceMock.getDataById("1");
    }
}
