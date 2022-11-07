package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);
        RockMusic rockMusic = context.getBean("rockBean",RockMusic.class);

        System.out.println(classicalMusic.getSong());
        System.out.println(rockMusic.getSong());

        Thread.sleep(2000);
        System.out.println("Before end of context");

        context.close(); //destroy container

        Thread.sleep(2000);
        System.out.println("End of programm");

    }
}
