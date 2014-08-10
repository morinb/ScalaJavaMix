package org.bm;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        new HelloWorldScala().hello();
        new HelloWorldJava().hello();

        User u = new User("Morin", "Baptiste");
        System.out.println("Scala user from java : " + u);
    }
}
