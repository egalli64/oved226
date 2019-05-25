package dd;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepo extends CrudRepository<Worker, Long> {
}
