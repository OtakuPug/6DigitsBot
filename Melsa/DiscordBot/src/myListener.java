import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.JDABuilder;
import javax.security.auth.login.LoginException;
import java.util.*;

public class myListener extends ListenerAdapter
{
	 public static void main(String[] args) throws LoginException
	    {
	        new JDABuilder("[Token]")
	            .addEventListeners(new bot())            
	            .setActivity(Activity.playing("mhelp"))
	            
	            .build();
	    }
	    
	}
