package igor.springframework.springbeerservice.web.mappers;

import igor.springframework.springbeerservice.services.inventory.BeerInventoryService;
import igor.springframework.springbeerservice.web.domain.Beer;
import igor.springframework.brewery.model.BeerDTO;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BeerMapperDecorator implements BeerMapper{
    private BeerInventoryService beerInventoryService;
    private BeerMapper mapper;

    @Autowired
    public void setBeerInventoryService(BeerInventoryService beerInventoryService) {
        this.beerInventoryService = beerInventoryService;
    }

    @Autowired
    public void setMapper(BeerMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public BeerDTO beerToBeerDto(Beer beer) {
        return mapper.beerToBeerDto(beer);
    }

    @Override
    public BeerDTO beerToBeerDtoWithInventory(Beer beer) {
        BeerDTO dto = mapper.beerToBeerDto(beer);
        dto.setQuantityOnHand(beerInventoryService.getOnhandInventory(beer.getId()));
        return dto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDTO beerDto) {
        return mapper.beerDtoToBeer(beerDto);
    }
}
