package ca.ulaval.glo4002.jackson_date_serializer.rest;

import java.util.Date;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import ca.ulaval.glo4002.jackson_date_serializer.rest.dto.Authorization;
import ca.ulaval.glo4002.jackson_date_serializer.rest.dto.CreditRequest;

@Path("/")
public class CreditCardAuthorizationResource {

    @POST
    @Path("/")
    public Authorization sayHello(CreditRequest request) {
        // Will display the full date. Since only the month/year is provided, it will use the first day of the month
        System.out.println("The expiration date is : " + request.expirationDate);

        Authorization authorization = new Authorization();

        // This one does not have a @JsonSerializer, so it will display as a timestamp
        authorization.authorizedOn = new Date();

        // This one does, so it will display as MM/yyyy
        authorization.authorizedExpirationDate = request.expirationDate;
        return authorization;
    }
}
