
import Factories.MessageSupportFactory;
import Providers.MessageProvider;
import Renderers.MessageRenderer;

public class HelloWorldDecoupled {
    public static void main(String... args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();

    }



}