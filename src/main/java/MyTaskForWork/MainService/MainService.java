package MyTaskForWork.MainService;
import MyTaskForWork.DTO.User;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class MainService {

    public User getById(long id) {
        //for the current time
        LocalDateTime now = LocalDateTime.now();
        User user = new User();
        //setting id for user
        user.setId(id);
        //setting current date for user
        user.setActionDate(now);
        return user;
    }

}
