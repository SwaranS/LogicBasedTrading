package com.defeasible;

import net.sf.tweety.web.services.DelpService;
import org.codehaus.jettison.json.JSONException;

/**
 * Created by Home on 10/31/2016.
 */
public class TweetyExample {

    public static void main(String[] coffee) {
        //Say Hello
        //Check DelpService.java
        DelpService delpService = new DelpService();
        try {
            System.out.println(delpService.handleRequest("{\n" +
                    "  \"cmd\": \"query\",\n" +
                    "  \"kb\": \"Bird(opus).\\nPenguin(tweety).\\nWings(tweety).\\nBird(X) <- Penguin(X).\\nFly(X) -< Bird(X).\\n~Fly(X) -< Penguin(X).\\n\",\n" +
                    "  \"query\": \"Fly(tweety)\",\n" +
                    "  \"compcriterion\": \"genspec\",\n" +
                    "  \"answer\": false,\n" +
                    "  \"reply\": \"query\",\n" +
                    "  \"email\": \"tweetyweb@mthimm.de\"\n" +
                    "}"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
