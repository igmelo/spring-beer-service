package igor.springframework.springbeerservice.services;

import igor.springframework.springbeerservice.repositories.BeerRespository;
import igor.springframework.springbeerservice.web.controller.NotFoundException;
import igor.springframework.springbeerservice.web.domain.Beer;
import igor.springframework.springbeerservice.web.mappers.BeerMapper;
import igor.springframework.springbeerservice.web.model.BeerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRespository beerRespository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDTO getById(UUID beerId) {
        return beerMapper.beerToBeerDto(
                beerRespository.findById(beerId).orElseThrow(NotFoundException::new)
        );
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beerDTO) {
        return beerMapper.beerToBeerDto(beerRespository.save(beerMapper.beerDtoToBeer(beerDTO)));
    }

    @Override
    public BeerDTO updateBeerById(UUID id, BeerDTO beerDTO) {
        Beer beer = beerRespository.findById(id).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDTO.getBeerName());
        beer.setBeerStyle(beerDTO.getBeerStyle().name());
        beer.setPrice(beerDTO.getPrice());
        beer.setUpc(beerDTO.getUpc());

        return beerMapper.beerToBeerDto(beerRespository.save(beer));
    }
}
