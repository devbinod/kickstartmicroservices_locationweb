package np.com.pantbinod.locationweb.service;

import np.com.pantbinod.locationweb.modal.Location;
import np.com.pantbinod.locationweb.resp.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public void delteLocation(Location location) {
        locationRepository.delete(location);
    }

    @Override
    public Location getLocationById(int id) {
        return locationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Location> getAllLocation() {
        return locationRepository.findAll();
    }
}
