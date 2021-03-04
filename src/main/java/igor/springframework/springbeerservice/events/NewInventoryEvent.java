package igor.springframework.springbeerservice.events;

import igor.springframework.springbeerservice.web.model.BeerDTO;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent{
    public NewInventoryEvent(BeerDTO beerDTO) {
        super(beerDTO);
    }
}
