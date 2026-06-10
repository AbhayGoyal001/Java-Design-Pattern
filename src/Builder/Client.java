package Builder;

public class Client {
    static void main(String[] args) {
    User user = new  User.UserBuilder().setUserId("1").setUserName("Abhay").setEmail("abhay.com").build();
        System.out.println(user.toString());
    }
}
