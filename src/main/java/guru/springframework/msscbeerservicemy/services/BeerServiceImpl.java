package guru.springframework.msscbeerservicemy.services;

import guru.springframework.msscbeerservicemy.domain.Beer;
import guru.springframework.msscbeerservicemy.repositories.BeerRepository;
import guru.springframework.msscbeerservicemy.web.controller.NotFoundException;
import guru.springframework.msscbeerservicemy.web.mappers.BeerMapper;
import guru.springframework.msscbeerservicemy.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-06-06.
 */
@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {
    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getById(UUID beerId) {
        return beerMapper.beerToBeerDto(
                beerRepository.findById(beerId).orElseThrow(NotFoundException::new)
        );
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtoToBeer(beerDto)));
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle(beerDto.getBeerStyle().name());
        beer.setPrice(beerDto.getPrice());
        beer.setUpc(beerDto.getUpc());

        return beerMapper.beerToBeerDto(beerRepository.save(beer));
    }
}