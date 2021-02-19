package igor.springframework.springbeerservice.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDTOKebabTest extends BaseTest{

    @Test
    void testKebab() throws JsonProcessingException {
        BeerDTO dto = getDTO();

        String json = objectMapper.writeValueAsString(dto);

        System.out.println(json);
    }
}
