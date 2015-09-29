package demo.Repository;

import demo.Model.Specialty;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SpecialtyRepository extends PagingAndSortingRepository<Specialty,Long>{
}
