package igor.springframework.springbeerservice.web.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import igor.springframework.springbeerservice.bootstrap.BeerLoader;
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
                .upc(BeerLoader.BEER_1_UPC)
                .price(new BigDecimal("12.95"))
                .build();
    }
}
