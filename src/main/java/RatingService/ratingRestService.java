package RatingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Rating/micro1")
public class ratingRestService {
    @Autowired
    private MyService myService;

    @GetMapping(value="/getratings/{userid}")
    public List<Rating> getRatings(@PathVariable String userid){
        return myService.getData(userid);
    }
}
