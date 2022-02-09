package com.hillert.args;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = Micronaut.run(Application.class, args);
        String path = context.getEnvironment().getProperty("tracing.zipkin.http.path", String.class).orElse("N/A");
        System.out.println("Path: " + path);
    }
}
