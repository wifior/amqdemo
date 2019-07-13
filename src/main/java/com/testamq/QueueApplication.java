package com.testamq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

/**
 * Hello world!
 *
 */
@EnableJms
@SpringBootApplication
public class QueueApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(QueueApplication.class,args);
    }
}
