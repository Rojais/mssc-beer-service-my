package guru.springframework.msscbeerservicemy.web.mappers;

import guru.springframework.msscbeerservicemy.domain.Beer;
import guru.springframework.msscbeerservicemy.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}