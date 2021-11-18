import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args){

        MyList<String> list = new MyList<>();

        list.add("123");list.add("456");list.add("789");
        list.add("101112");list.add("131415");list.add("161718");


        for( Iterator<String> i = list.begin() ; i.hasNext() ; ){

            System.out.println( i.next() );

        }

    }

}
