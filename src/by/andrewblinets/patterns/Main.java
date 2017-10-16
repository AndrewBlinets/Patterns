package by.andrewblinets.patterns;

import by.andrewblinets.patterns.singlenton.TestSinglenton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestSinglenton.getInstance().print();
        TestSinglenton.getInstance().print();
        TestSinglenton.getInstance().print();
    }
}
