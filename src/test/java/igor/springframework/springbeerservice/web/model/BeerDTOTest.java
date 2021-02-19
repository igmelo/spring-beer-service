package igor.springframework.springbeerservice.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class BeerDTOTest extends BaseTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDTO() throws JsonProcessingException {

        BeerDTO beerDTO = getDTO();

        String jsonString = objectMapper.writeValueAsString(beerDTO);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String json = "{\"id\":\"68763274-dfd5-4918-9885-f1eb936d9f77\",\"version\":null,\"createdDate\":\"2021-02-19T11:10:32.9041414-03:00\",\"lastModifiedData\":\"2021-02-19T11:10:32.9041414-03:00\",\"beerName\":\"Mongo Bobs\",\"beerStyle\":\"PALE_ALE\",\"upc\":337010000001,\"price\":12.95,\"quantityOnHand\":null}";
        BeerDTO dto = objectMapper.readValue(json, BeerDTO.class);

        System.out.println(dto);
    }
}
