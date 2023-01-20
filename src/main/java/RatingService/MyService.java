package RatingService;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MyService {

    private RestTemplate restTemplate = new RestTemplate();
    public static List<Rating> myRatings;

    static {
         myRatings = Arrays.asList(new Rating("movie120","user1",4,"12-1-2022"),
                new Rating("movie121","user3",4,"22-4-2022"),
                new Rating("movie122","user5",5,"11-1-2022"),
                new Rating("movie122","user1",5,"1-12-2023"),
                new Rating("movie124","user2",3,"13-7-2022"),
                new Rating("movie123","user4",3,"12-1-2022"),
                new Rating("movie121","user2",5,"8-6-2022"),
                new Rating("movie120","user5",5,"1-1-2022"),
                new Rating("movie123","user3",0,"12-1-2020"));
          }

    public List<Rating> getData(String user){
      return  myRatings.stream()
                .filter(rat->rat.getUserid().equals(user))
                .collect(Collectors.toList());
    }

}
