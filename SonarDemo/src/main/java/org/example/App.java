package org.example;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger logger= LoggerFactory.getLogger(App.class);

    public App()
    {
        logger.trace("Constructor");
    }
    public void test()
    {
        String p ="";
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);

        Object obj=getData();
        if(obj!=null) {
            logger.trace(obj.toString());
        }
        }

    public Object getData()
    {
        return null;
    }

    public static void main( String[] args )
    {
        logger.warn( "Hello World!" );

        App app = new App();
        app.test();
    }
}
