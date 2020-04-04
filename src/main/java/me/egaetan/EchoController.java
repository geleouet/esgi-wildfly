package me.egaetan;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/echo")
public class EchoController {

	
	@GET
	@Produces("application/json")
	@Path("/{texte}")
	public Response echo(@PathParam("texte") String texte) {
		return Response.ok(texte).build();
	}
}
