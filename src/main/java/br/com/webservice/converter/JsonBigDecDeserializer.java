package br.com.webservice.converter;

import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class JsonBigDecDeserializer extends JsonDeserializer<BigDecimal> {

	@Override
	public BigDecimal deserialize(JsonParser value, DeserializationContext context)
			throws IOException, JsonProcessingException {
		String inputValue = value.getText();
        if (inputValue.contains(",")) {
            inputValue = inputValue.replace(",", ".");
        }
		return new BigDecimal(inputValue);
	}
}
