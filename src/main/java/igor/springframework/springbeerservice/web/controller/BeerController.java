package igor.springframework.springbeerservice.web.controller;

import igor.springframework.springbeerservice.services.BeerService;
import igor.springframework.springbeerservice.web.model.BeerDTO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
@RequiredArgsConstructor //also automatically autowire
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable UUID beerId){
        return new ResponseEntity<>(beerService.getById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@Validated @RequestBody BeerDTO beerDTO){
        return new ResponseEntity<>(beerService.saveNewBeer(beerDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID id,@Validated @RequestBody BeerDTO beerDTO){
        return new ResponseEntity<>(beerService.updateBeerById(id, beerDTO), HttpStatus.NO_CONTENT);
    }
}
