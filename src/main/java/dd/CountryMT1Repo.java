package dd;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryMT1Repo extends CrudRepository<CountryMT1, String> {
}
