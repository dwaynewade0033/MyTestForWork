package MyTaskForWork.MainController;


import MyTaskForWork.DTO.User;
import MyTaskForWork.MainService.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    //for using our service
    @Autowired
    MainService mainService;

    @GetMapping("/testId/{id}")
    public User testId(@PathVariable("id") long id) { //method GET takes a parameter id
        return mainService.getById(id);
    }
}
