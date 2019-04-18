package np.com.pantbinod.locationweb.resp;

import np.com.pantbinod.locationweb.modal.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
