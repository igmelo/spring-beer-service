package igor.springframework.springbeerservice.services;

import igor.springframework.brewery.model.BeerDTO;
import igor.springframework.brewery.model.BeerPagedList;
import igor.springframework.brewery.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDTO getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDTO saveNewBeer(BeerDTO beerDto);

    BeerDTO updateBeer(UUID beerId, BeerDTO beerDto);

    BeerDTO getByUpc(String upc);
}
