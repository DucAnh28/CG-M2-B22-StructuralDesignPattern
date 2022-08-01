import Controller.SocialMediaFacade;
import Model.Facebook;
import Model.LinkedIn;
import Model.Twitter;

public class Client {
    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(),new Facebook(),new LinkedIn());
        socialMediaFacade.share(message);
    }
}
