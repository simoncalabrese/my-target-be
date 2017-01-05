package controller;

import dto.PersonDto;
import service.PersonServiceLocal;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

/**
 * Created by simon on 18/12/16.
 */
@Path("/person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonController {

    @EJB
    private PersonServiceLocal personService;

    @GET
    @Path("/by-cod/{codName}")
    public PersonDto getPersonByCod(@PathParam("codName") final String string){
        return personService.getPersonByCod(Optional.ofNullable(string));
    }

    @GET
    @Path("/get")
    public List<PersonDto> getPerson(){
        return personService.getPersonByCod();
    }

}
