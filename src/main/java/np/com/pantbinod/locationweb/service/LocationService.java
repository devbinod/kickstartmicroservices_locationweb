package np.com.pantbinod.locationweb.service;

import np.com.pantbinod.locationweb.modal.Location;

import java.util.List;

public interface LocationService {

    Location saveLocation(Location location);
    Location updateLocation(Location location);
    void delteLocation(Location location);
    Location getLocationById(int id);
    List<Location> getAllLocation();
}
