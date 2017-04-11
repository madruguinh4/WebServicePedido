package br.com.webservice.converter;

import java.io.IOException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * 
 * @author Caique dos Santos Coelho
 *
 */

public class JsonLocalDateDeserializer extends JsonDeserializer<LocalDate> {

	@Override
	public LocalDate deserialize(JsonParser value, DeserializationContext context)
			throws IOException, JsonProcessingException {
		String date = value.getText();
		LocalDate localDate = null;
		if(date != null)
			localDate = LocalDate.parse(date,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		else 
			localDate = LocalDate.now();
		
		return localDate;
	}

}
