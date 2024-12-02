package ua.edu.ucu.apps.task1;

public class TwitterUserAdapter implements User {

    private TwitterUser user;

    public TwitterUserAdapter(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public String getLastActiveTime() {
        return user.getLastActiveTime();
    }

}
