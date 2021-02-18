package igor.springframework.springbeerservice.web.mappers;

import igor.springframework.springbeerservice.web.domain.Beer;

import igor.springframework.springbeerservice.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO dto);
}
