package ca.ulaval.glo4002.jackson_date_serializer.rest.dto;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ca.ulaval.glo4002.jackson_date_serializer.rest.serializers.ExpirationDateDeserializer;

public class CreditRequest {

    @JsonDeserialize(using = ExpirationDateDeserializer.class)
    public Date expirationDate;
}
