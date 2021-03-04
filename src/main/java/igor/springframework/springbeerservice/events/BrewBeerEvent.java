package igor.springframework.springbeerservice.events;

import igor.springframework.springbeerservice.web.model.BeerDTO;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BrewBeerEvent extends BeerEvent{
    public BrewBeerEvent(BeerDTO beerDTO) {
        super(beerDTO);
    }
}
