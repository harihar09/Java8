package Java8.BookApp;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int returnVal = 0;
        returnVal =  o1.getName().compareTo(o2.getName());
        if(returnVal==0)
            returnVal= o1.getId()-o2.getId();
       if(returnVal == 0)
           returnVal = o1.getPages()-o2.getPages();
        return returnVal;
    }
}
