package ca.ulaval.glo4002.jackson_date_serializer.rest.serializers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class ExpirationDateSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date date, JsonGenerator generator, SerializerProvider serializer) throws IOException, JsonProcessingException {
        generator.writeString(new SimpleDateFormat("MM/yyyy").format(date));
    }

}
