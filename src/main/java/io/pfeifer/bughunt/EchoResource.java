package io.pfeifer.bughunt;

import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.metrics.annotation.Counted;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.logging.Logger;

@RequestScoped
@Path("/echo")
public class EchoResource {
    private static final Logger LOG = Logger.getLogger(EchoResource.class.getName());

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "echoCalls")
    @Timeout
    public String doGet(@QueryParam("text") @DefaultValue("Echo") final String text) {
        LOG.finest("doGet called");

        return text;
    }
}
