package ua.edu.ucu.apps.task1;

public class FacebookUserAdapter implements User {
    private FacebookUser user;

    public FacebookUserAdapter(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public String getLastActiveTime() {
        return user.getUserActiveTime();
    }
    
    @Override
    public String toString() {
        return "Email: " + getEmail() + ", Country: " + getCountry() + 
        ", Last Active Time: " + getLastActiveTime();
    }
}
