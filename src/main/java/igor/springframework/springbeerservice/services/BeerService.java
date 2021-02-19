package igor.springframework.springbeerservice.services;

import igor.springframework.springbeerservice.web.model.BeerDTO;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface BeerService {
    BeerDTO getById(UUID beerId);

    BeerDTO saveNewBeer(BeerDTO beerDTO);

    BeerDTO updateBeerById(UUID id, BeerDTO beerDTO);
}
