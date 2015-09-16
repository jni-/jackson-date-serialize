package ca.ulaval.glo4002.jackson_date_serializer.rest.dto;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import ca.ulaval.glo4002.jackson_date_serializer.rest.serializers.ExpirationDateSerializer;

public class Authorization {

    public Date authorizedOn;

    @JsonSerialize(using = ExpirationDateSerializer.class)
    public Date authorizedExpirationDate;

}
