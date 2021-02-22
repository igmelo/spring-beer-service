package igor.springframework.springbeerservice.bootstrap;

import igor.springframework.springbeerservice.repositories.BeerRespository;
import igor.springframework.springbeerservice.web.domain.Beer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";

    private final BeerRespository beerRespository;

    public BeerLoader(BeerRespository beerRespository) {
        this.beerRespository = beerRespository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRespository.count() == 0){ //if my repository is empty, fill with this data \/
            beerRespository.save(Beer.builder()
                    .beerName("Mongo Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_1_UPC)
                    .price(new BigDecimal("12.95"))
                    .build());
            beerRespository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("11.95"))
                    .build());
            beerRespository.save(Beer.builder()
                    .beerName("Heineken")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal("14.95"))
                    .build());
        }

    }
}
