package Builder;

public class User {
    private  String UserId;
    private  String userName;
    private  String email;

    @Override
    public String toString() {
        return "User{" +
                "UserId='" + UserId + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private User(UserBuilder builder){
        this.UserId = builder.UserId;
        this.userName = builder.userName;
        this.email = builder.email;
    }

    public String getUserId() {
        return UserId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    static class UserBuilder{
        private  String UserId;
        private  String userName;
        private  String email;

        public UserBuilder setUserId(String userId) {
            this.UserId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
