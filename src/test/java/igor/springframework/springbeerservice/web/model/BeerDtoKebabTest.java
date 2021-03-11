package igor.springframework.springbeerservice.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import igor.springframework.brewery.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest{

    @Test
    void testKebab() throws JsonProcessingException {
        BeerDto dto = getDTO();

        String json = objectMapper.writeValueAsString(dto);

        System.out.println(json);
    }
}
