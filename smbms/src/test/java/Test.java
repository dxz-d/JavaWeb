import com.kuang.pojo.User;
import com.kuang.service.user.UserServiceImpl;

public class Test {

    @org.junit.Test
    public void test() {
        UserServiceImpl userService = new UserServiceImpl();
        User admin = userService.login("admin", "1233333");
        System.out.println(admin.getUserPassword());
    }
}
