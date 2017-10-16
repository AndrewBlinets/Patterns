package by.andrewblinets.patterns.singlenton;

/**
 * Created by Андрей on 16.10.2017.
 */
public class TestSinglenton {

    private static TestSinglenton instance;

    private TestSinglenton() {
    }

    public static synchronized TestSinglenton getInstance()
    {
        if(instance == null)
        {
            instance = new TestSinglenton();
        }
        return instance;
    }

    public void print()
    {
        System.out.println(this);
    }
}
