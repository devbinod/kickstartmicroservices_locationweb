package np.com.pantbinod.locationweb.controller;

import np.com.pantbinod.locationweb.modal.Location;
import np.com.pantbinod.locationweb.service.LocationService;
import np.com.pantbinod.locationweb.util.EmailUtilImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LocationController {

    @Autowired
    private LocationService locationService;
    @Autowired
    private EmailUtilImpl emailUtil;

    @GetMapping({"/", "/createLocation"})
    public String hello(Model model) {
        return "jsps/createLocation";
    }


    @RequestMapping("/saveLocation")
    public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
        Location location1= locationService.saveLocation(location);
        emailUtil.sendEmail("binodpant.nep@gmail.com", "Location Saved",
                "Location Saved Sucessfully and return respective id"
                );
        String message= "sucessfully saved ..."+location.getId();
        modelMap.addAttribute("msg",message);

        return "jsps/createLocation";
    }

    @RequestMapping("/displayLocation")
    public String displayLocation(ModelMap modelMap){
        modelMap.addAttribute("location",locationService.getAllLocation());
        return "jsps/displayLocation";
    }

    @RequestMapping("/deleteLocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap){
        Location location = new Location();
        location.setId(id);
        locationService.delteLocation(location);
        modelMap.addAttribute("location", locationService.getAllLocation());
        return "jsps/displayLocation";
    }

    @RequestMapping("/updateLocation")
    public String updateLocation(@RequestParam("id") int id, ModelMap modelMap){
        Location location = locationService.getLocationById(id);
        modelMap.addAttribute("location", location);
        return "jsps/updateLocation";

    }

    @PostMapping("/updateLocation")
    public String updateLocationVAlue(@ModelAttribute("location")Location location, ModelMap modelMap){
        locationService.updateLocation(location);
        modelMap.addAttribute("location", locationService.getAllLocation());
        return "jsps/updateLocation";

    }
}
