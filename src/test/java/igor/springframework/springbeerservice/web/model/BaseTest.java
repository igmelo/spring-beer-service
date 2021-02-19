package igor.springframework.springbeerservice.web.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    BeerDTO getDTO(){
        return BeerDTO.builder()
                .beerName("Mongo Bobs")
                .beerStyle(BeerStyleEnum.PALE_ALE)
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastModifiedData(OffsetDateTime.now())
                .upc(337010000001L)
                .price(new BigDecimal("12.95"))
                .build();
    }
}
