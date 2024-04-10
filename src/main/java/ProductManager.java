public class ProductManager {
    private int lastcount;
    private String[] films = {
//            "Бладшот",
//            "Вперед",
//            "Отель 'Белград'",
//            "Джентельмены",
//            "Человек-невидимка",
//            "Тролли. Мировой тур",
//            "Номер один"
    };

    public ProductManager(int lastcount) {
        this.lastcount = lastcount;
    }

    public ProductManager() {
        this.lastcount = 5;
    }

    public String[] findLast() {
        int maxCount;
        if (films.length < lastcount) {
            maxCount = films.length;
        } else {
            maxCount = lastcount;
        }
        String[] tmp = new String[maxCount];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }

    public String[] findAll() {

        return films;
    }

    public void addFilm(String newFilm) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;

    }


}
