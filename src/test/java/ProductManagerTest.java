import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    ProductManager manager = new ProductManager();

    @Test
    public void shouldFindAll() {


        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");

        String[] expected = {"Бладшот", "Вперед", "Джентельмены"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shoudFindLessLimit() {

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");

        String[] expected = {"Джентельмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shoudFindMoreLimit() {
        ProductManager manager = new ProductManager(7);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Матрица");

        String[] expected = {"Матрица", "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shoudFindEqualLimit() {

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");


        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }
}
