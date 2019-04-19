package np.com.pantbinod.locationweb.resp;

import np.com.pantbinod.locationweb.modal.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Integer> {

    @Query("select type , count(type) from Location location\n" +
            "group by type")
    List<Object[]> findByTypeAndTypeCount();
}
