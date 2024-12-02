package ua.edu.ucu.apps.task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AuthMethod authMethod = AuthMethod.FACEBOOK;
        User user = null;

        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser("tes@mail", "Ukraine", LocalDate.now().toString());
                break;

            case TWITTER:
                TwitterUser twitterUser = new TwitterUser("newtest@email", "USA", LocalDate.now().minusDays(1).toString());

            default:
                break;
        }

        MessageSender messageSender = new MessageSender();
        messageSender.send(user, "Hello!");
    }
}