package igor.springframework.springbeerservice.events;

import igor.springframework.springbeerservice.web.model.BeerDTO;

public class BrewBeerEvent extends BeerEvent{
    public BrewBeerEvent(BeerDTO beerDTO) {
        super(beerDTO);
    }
}
