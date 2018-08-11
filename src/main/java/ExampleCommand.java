

import csbot.core.Command;
import csbot.core.DiscordMessageUtil;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class ExampleCommand implements Command{

	@Override
	public void execute(MessageReceivedEvent event, String message) {
   
		DiscordMessageUtil.sendMessageWithMention(event, "ping!");
		
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