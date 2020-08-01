public class UserTest {
    public static void main(String[] args) {
        User user = new User("gilgong",29);
        User user2 = new User("gilgong",29);

        System.out.println(user);

        if(user.equals(user2)) {
            System.out.println("user is same as user1");
        } else
        {
            System.out.println("user is different from user1");
        }
    }
}
