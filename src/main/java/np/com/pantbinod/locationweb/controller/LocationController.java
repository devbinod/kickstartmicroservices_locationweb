package np.com.pantbinod.locationweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LocationController {

    @RequestMapping("/showCreate")
    public String showCreate(){
        return "createLocation";
    }

    @RequestMapping("/show")
    public ModelAndView getCreate(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("called.........");
        modelAndView.setViewName("createLocation");
        return modelAndView;
    }
}
