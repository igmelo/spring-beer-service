package igor.springframework.springbeerservice.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import igor.springframework.brewery.model.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class BeerDTOSnakeTest extends BaseTest{

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDTO dto = getDTO();

        String json = objectMapper.writeValueAsString(dto);

        System.out.println(json);
    }
}
