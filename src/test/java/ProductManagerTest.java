import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {


    ProductManager manager = new ProductManager();
    String[] films = {
            "Бладшот",
            "Вперед",
            "Отель 'Белград'",
            "Джентельмены",
            "Человек-невидимка",
            "Тролли. Мировой тур",
            "Номер один"
    };

    @BeforeEach
    public void setup() {
        for (String film : films) {
            manager.addFilm(film);
        }

    }

    @Test
    public void addFilmTest() {
        manager.addFilm("xxxxx");
        String[] expected = {
                "Бладшот",
                "Вперед",
                "Отель 'Белград'",
                "Джентельмены",
                "Человек-невидимка",
                "Тролли. Мировой тур",
                "Номер один", "xxxxx"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void findLastFilm() {

        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
                "Джентельмены",
                "Отель 'Белград'",
//                "Вперед","Бладшот"
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

}
