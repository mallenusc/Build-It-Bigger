/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.udacity.jokesbackend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.javajokelibrary.JokeAPI;


/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "jokesbackend.udacity.com",
    ownerName = "jokesbackend.udacity.com",
    packagePath=""
  )
)
public class MyEndpoint {


    @ApiMethod(name = "getJoke")
    public MyJokes getJoke() {
        MyJokes response = new MyJokes();

        JokeAPI joke = new JokeAPI();

        response.setData(joke.getJoke());

        return response;
    }

}
