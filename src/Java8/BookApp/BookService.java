package Java8.BookApp;

import java.util.Collections;
import java.util.List;

public class BookService {

    public List<Book> getSortedBooksList() {
        List<Book> bookList = new BookDAO().getBookList();
        //  Collections.sort(bookList,new BookComparator());  Approach -1
      /*  Collections.sort(bookList, new Comparator<Book>() {   // Approach - 2
            @Override
            public int compare(Book o1, Book o2) {
                int returnVal = 0;
                returnVal = o1.getName().compareTo(o2.getName());
                if (returnVal == 0)
                    returnVal = o1.getId() - o2.getId();
                if (returnVal == 0)
                    returnVal = o1.getPages() - o2.getPages();
                return returnVal;
            }
        });
        return bookList;*/

        Collections.sort(bookList,(o1,o2)->{                   //Approach - 3
            int returnVal = 0;
            returnVal = o1.getName().compareTo(o2.getName());
            if (returnVal == 0)
                returnVal = o1.getId() - o2.getId();
            if (returnVal == 0)
                returnVal = o1.getPages() - o2.getPages();
            return returnVal;
        });
        return bookList;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getSortedBooksList());
    }
}
