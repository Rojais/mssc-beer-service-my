package guru.springframework.msscbeerservicemy.services;

import java.util.UUID;

import org.springframework.data.domain.PageRequest;

import guru.springframework.msscbeerservicemy.web.model.BeerDto;
import guru.springframework.msscbeerservicemy.web.model.BeerPagedList;
import guru.springframework.msscbeerservicemy.web.model.BeerStyleEnum;

/**
 * Created by jt on 2019-06-06.
 */
public interface BeerService {
	BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest , Boolean showInventoryOnHand);
	
    BeerDto getById(UUID beerId , Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}