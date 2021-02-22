package igor.springframework.springbeerservice.services;

import igor.springframework.springbeerservice.web.domain.Beer;
import igor.springframework.springbeerservice.web.model.BeerDTO;
import igor.springframework.springbeerservice.web.model.BeerPagedList;
import igor.springframework.springbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDTO getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDTO saveNewBeer(BeerDTO beerDto);

    BeerDTO updateBeer(UUID beerId, BeerDTO beerDto);
}
