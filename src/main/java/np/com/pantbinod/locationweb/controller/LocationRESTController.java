package np.com.pantbinod.locationweb.controller;


import np.com.pantbinod.locationweb.modal.Location;
import np.com.pantbinod.locationweb.resp.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

    @Autowired
    private LocationRepository locationRepository;


    @GetMapping
    public List<Location> getLocations(){
        return locationRepository.findAll();
    }

    @PostMapping
    public Location saveLocation(@RequestBody Location location){
        return locationRepository.save(location);
    }

    @PutMapping
    public Location updateLocation(@RequestBody Location location){
        return locationRepository.save(location);
    }

    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable("id") int id){
        Location location = new Location();
        location.setId(id);
        locationRepository.delete(location);
    }

    @GetMapping("{id}")
    public Optional<Location> getSingleLocation(@PathVariable("id") int id){
        return locationRepository.findById(id);
    }
}
