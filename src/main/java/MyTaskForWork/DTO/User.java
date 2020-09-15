package MyTaskForWork.DTO;
import lombok.Data;
import java.time.LocalDateTime;
//Our main entity
@Data //lombok
public class User {
    private  long id;
    private LocalDateTime actionDate;
}
