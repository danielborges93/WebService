/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

/**
 *
 * @author daniel_borges_93
 */
@Path("/helloworld")
public class HelloWorldResource {

    @GET
    @Produces("text/plain")
    public String getClichedMessage() {
        return "Hello World";
    }
}
