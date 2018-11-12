

import csbot.core.Command;
import csbot.core.DiscordMessage;


public class ExampleCommand implements Command{

	@Override
	public void initialize(String filePath) {
		
	}


	@Override
	public void execute(DiscordMessage message) {
   
		message.sendMessageWithMention("ping!");
		
	}

	@Override
	public String getDescription() {
		return "This is an example";
	}

	@Override
	public String getHelp() {
		return "usage: !example\n\t pings the message user as an example.";
	}

	@Override
	public String getTrigger() {
		return "example";
	}
    

}