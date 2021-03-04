package igor.springframework.springbeerservice.events;

import igor.springframework.springbeerservice.web.model.BeerDTO;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor 
@Builder
public class BeerEvent implements Serializable {
    static final long serialVersionUID = -2859908998529575802L;

    private BeerDTO beerDTO;

}
