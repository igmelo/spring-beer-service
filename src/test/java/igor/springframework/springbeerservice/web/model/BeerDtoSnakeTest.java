package igor.springframework.springbeerservice.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import igor.springframework.brewery.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSnakeTest extends BaseTest{

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDto dto = getDTO();

        String json = objectMapper.writeValueAsString(dto);

        System.out.println(json);
    }
}
