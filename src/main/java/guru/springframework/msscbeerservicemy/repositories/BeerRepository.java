package guru.springframework.msscbeerservicemy.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import guru.springframework.msscbeerservicemy.domain.Beer;

/**
 * Created by jt on 2019-05-17 .
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
