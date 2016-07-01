package com.udacity.javajokelibrary;

import java.util.Random;

public class JokeAPI {
    public String getJoke(){

        Jokes joke = new Jokes();

        Random r = new Random();
        int Low = 0;
        int High = joke.jokes.length;
        int Result = r.nextInt(High-Low) + Low;

        return joke.jokes[Result];
    }
}
