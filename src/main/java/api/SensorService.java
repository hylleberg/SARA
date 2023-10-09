package api;

import datalayer.DAOcontroller;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.LoginData;
import model.SensorData;

@Path("/sensor")
public class SensorService {
    DAOcontroller dc = new DAOcontroller();
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postSensorData(SensorData sensordata) {
        System.out.println("GET sensor trigger");
         return dc.setTempValue(sensordata);
    }

    @GET
    @Path("/fetch/{devID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSensorData(@PathParam("devID")String devID){
        System.out.println("GET sensor trigger");
        return dc.getTempValue(devID);

    }

}
