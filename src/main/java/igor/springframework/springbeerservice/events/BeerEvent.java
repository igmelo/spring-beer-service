package igor.springframework.springbeerservice.events;

import igor.springframework.springbeerservice.web.model.BeerDTO;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {
    static final long serialVersionUID = -2859908998529575802L;

    private final BeerDTO beerDTO;

}
