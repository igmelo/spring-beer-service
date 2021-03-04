package igor.springframework.springbeerservice.events;

import igor.springframework.springbeerservice.web.model.BeerDTO;

public class NewInventoryEvent extends BeerEvent{
    public NewInventoryEvent(BeerDTO beerDTO) {
        super(beerDTO);
    }
}
