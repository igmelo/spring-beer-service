package igor.springframework.springbeerservice.repositories;

import igor.springframework.springbeerservice.web.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRespository extends PagingAndSortingRepository<Beer, UUID> {
}
