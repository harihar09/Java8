package Java8.BookApp;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBookList(){
        List<Book> list = new ArrayList<>();
        list.add(new Book(2,"core java",500));
        list.add(new Book(2,"core java",200));
        list.add(new Book(4,"spring mvc",300));
        list.add(new Book(3,"spring boot",400));
        return list;
    }
}
