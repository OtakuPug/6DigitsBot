import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class bot extends ListenerAdapter {

	 @Override
	    public void onMessageReceived(MessageReceivedEvent e)
	    //creating the listener for 6digitbot
	    {
		 Message msg = e.getMessage(); //creating the message
	        MessageChannel channel = e.getChannel(); //getting the channel
	        Guild guild = e.getGuild();  //getting the guild
	      String ID = guild.getId(); //guild id
	      String melsaGuild = "520253545380053002";
	      if (guild.getId().equals(melsaGuild)) {
	    	  if(msg.getContentRaw().charAt(0) == 'm' && msg.getContentRaw().charAt(1) == ' '  && !(msg.getContentRaw().charAt(2) == 'm')) { //getting the bot to talk and delete the last message
	    		  String msg2 = msg.getContentRaw();
	    				e.getMessage().delete().queue();
	    				
		            channel.sendMessage(msg2.substring(1, msg2.length())).queue(); 
		            e.getMessage().addReaction("U+1F603").queue();
	    	  } else {
	    		 if(msg.getContentRaw().equalsIgnoreCase("bruh")) {
	    				  channel.sendMessage("https://cdn.discordapp.com/attachments/633814145854078988/636380461865893888/624685264995876874.gif").queue();
	    			  } else {
	    					  if(msg.getContentRaw().equalsIgnoreCase("heccyeah")) {
	    	    				  channel.sendMessage("https://cdn.discordapp.com/attachments/633814145854078988/636385275987099668/519064231803355157.gif").queue();
	    				  } else {
	    						  if(msg.getContentRaw().equalsIgnoreCase("nuuu")) {
		    	    				  channel.sendMessage("https://cdn.discordapp.com/attachments/633814145854078988/636385319129841697/632357721055690773.gif").queue();
	    					  } else {
	    							  if(msg.getContentRaw().equalsIgnoreCase("zakhere")) {
	    	    	    				  channel.sendMessage("https://cdn.discordapp.com/attachments/633814145854078988/636385466752565288/583008145337745418.gif").queue(); 
	    						  } else {
	    							  if(msg.getContentRaw().length() == 5 && !(msg.getContentRaw().charAt(0) == ':') && !(msg.getContentRaw().charAt(0) == 'a')&& !(msg.getContentRaw().charAt(0) == 'b')&& !(msg.getContentRaw().charAt(0) == 'c')&& !(msg.getContentRaw().charAt(0) == 'd')&& !(msg.getContentRaw().charAt(0) == 'e')&& !(msg.getContentRaw().charAt(0) == 'f')&& !(msg.getContentRaw().charAt(0) == 'g')&& !(msg.getContentRaw().charAt(0) == 'h')&& !(msg.getContentRaw().charAt(0) == 'i')&& !(msg.getContentRaw().charAt(0) == 'j')&& !(msg.getContentRaw().charAt(0) == 'k')&& !(msg.getContentRaw().charAt(0) == 'l')&& !(msg.getContentRaw().charAt(0) == 'm')&& !(msg.getContentRaw().charAt(0) == 'n')&& !(msg.getContentRaw().charAt(0) == 'o')&& !(msg.getContentRaw().charAt(0) == 'p')&& !(msg.getContentRaw().charAt(0) == 'q')&& !(msg.getContentRaw().charAt(0) == 'r')&& !(msg.getContentRaw().charAt(0) == 's')&& !(msg.getContentRaw().charAt(0) == 't')&& !(msg.getContentRaw().charAt(0) == 'u')&& !(msg.getContentRaw().charAt(0) == 'v')&& !(msg.getContentRaw().charAt(0) == 'w')&& !(msg.getContentRaw().charAt(0) == 'x')&& !(msg.getContentRaw().charAt(0) == 'y')&& !(msg.getContentRaw().charAt(0) == 'z')&& !(msg.getContentRaw().charAt(0) == 'A')&& !(msg.getContentRaw().charAt(0) == 'B')&& !(msg.getContentRaw().charAt(0) == 'C')&& !(msg.getContentRaw().charAt(0) == 'D')&& !(msg.getContentRaw().charAt(0) == 'E')&& !(msg.getContentRaw().charAt(0) == 'F')&& !(msg.getContentRaw().charAt(0) == 'G')&& !(msg.getContentRaw().charAt(0) == 'H')&& !(msg.getContentRaw().charAt(0) == 'I')&& !(msg.getContentRaw().charAt(0) == 'J')&& !(msg.getContentRaw().charAt(0) == 'K')&& !(msg.getContentRaw().charAt(0) == 'L')&& !(msg.getContentRaw().charAt(0) == 'M')&& !(msg.getContentRaw().charAt(0) == 'N')&& !(msg.getContentRaw().charAt(0) == 'O')&& !(msg.getContentRaw().charAt(0) == 'P')&& !(msg.getContentRaw().charAt(0) == 'Q')&& !(msg.getContentRaw().charAt(0) == 'R')&& !(msg.getContentRaw().charAt(0) == 'S')&& !(msg.getContentRaw().charAt(0) == 'T')&& !(msg.getContentRaw().charAt(0) == 'U')&& !(msg.getContentRaw().charAt(0) == 'V')&& !(msg.getContentRaw().charAt(0) == 'W')&& !(msg.getContentRaw().charAt(0) == 'X')&& !(msg.getContentRaw().charAt(0) == 'Y')&& !(msg.getContentRaw().charAt(0) == 'Z')) {
    									  channel.sendMessage("https://mangadex.org/title/" + msg.getContentRaw() + "/").queue(); //posts ad mangadex link from 5 digits
    								  	  } 
    	  }
	            
    					  }
    				  }
    			  }
    		  }
    	  } else {
    		  if(msg.getContentRaw().charAt(0) == 'm' && msg.getContentRaw().charAt(1) == ' ' && !(msg.getContentRaw().charAt(2) == 'm')) { //getting the bot to talk and delete the last message
	    		  String msg2 = msg.getContentRaw();
	    				e.getMessage().delete().queue();
		            channel.sendMessage(msg2.substring(1, msg2.length())).queue(); 
	    	  } else {
	    		 if(msg.getContentRaw().equalsIgnoreCase("bruh")) {
	    				  channel.sendMessage("https://cdn.discordapp.com/attachments/633814145854078988/636380461865893888/624685264995876874.gif").queue();
	    			  } else {
	    					  if(msg.getContentRaw().equalsIgnoreCase("heccyeah")) {
	    	    				  channel.sendMessage("https://cdn.discordapp.com/attachments/633814145854078988/636385275987099668/519064231803355157.gif").queue();
	    				  } else {
	    						  if(msg.getContentRaw().equalsIgnoreCase("nuuu")) {
		    	    				  channel.sendMessage("https://cdn.discordapp.com/attachments/633814145854078988/636385319129841697/632357721055690773.gif").queue();
	    					  } else {
	    							  if(msg.getContentRaw().equalsIgnoreCase("zakhere")) {
	    	    	    				  channel.sendMessage("https://cdn.discordapp.com/attachments/633814145854078988/636385466752565288/583008145337745418.gif").queue(); 
	    						  } else {
	    							  if(msg.getContentRaw().length() == 5 && !(msg.getContentRaw().charAt(0) == ':') && !(msg.getContentRaw().charAt(0) == 'a')&& !(msg.getContentRaw().charAt(0) == 'b')&& !(msg.getContentRaw().charAt(0) == 'c')&& !(msg.getContentRaw().charAt(0) == 'd')&& !(msg.getContentRaw().charAt(0) == 'e')&& !(msg.getContentRaw().charAt(0) == 'f')&& !(msg.getContentRaw().charAt(0) == 'g')&& !(msg.getContentRaw().charAt(0) == 'h')&& !(msg.getContentRaw().charAt(0) == 'i')&& !(msg.getContentRaw().charAt(0) == 'j')&& !(msg.getContentRaw().charAt(0) == 'k')&& !(msg.getContentRaw().charAt(0) == 'l')&& !(msg.getContentRaw().charAt(0) == 'm')&& !(msg.getContentRaw().charAt(0) == 'n')&& !(msg.getContentRaw().charAt(0) == 'o')&& !(msg.getContentRaw().charAt(0) == 'p')&& !(msg.getContentRaw().charAt(0) == 'q')&& !(msg.getContentRaw().charAt(0) == 'r')&& !(msg.getContentRaw().charAt(0) == 's')&& !(msg.getContentRaw().charAt(0) == 't')&& !(msg.getContentRaw().charAt(0) == 'u')&& !(msg.getContentRaw().charAt(0) == 'v')&& !(msg.getContentRaw().charAt(0) == 'w')&& !(msg.getContentRaw().charAt(0) == 'x')&& !(msg.getContentRaw().charAt(0) == 'y')&& !(msg.getContentRaw().charAt(0) == 'z')&& !(msg.getContentRaw().charAt(0) == 'A')&& !(msg.getContentRaw().charAt(0) == 'B')&& !(msg.getContentRaw().charAt(0) == 'C')&& !(msg.getContentRaw().charAt(0) == 'D')&& !(msg.getContentRaw().charAt(0) == 'E')&& !(msg.getContentRaw().charAt(0) == 'F')&& !(msg.getContentRaw().charAt(0) == 'G')&& !(msg.getContentRaw().charAt(0) == 'H')&& !(msg.getContentRaw().charAt(0) == 'I')&& !(msg.getContentRaw().charAt(0) == 'J')&& !(msg.getContentRaw().charAt(0) == 'K')&& !(msg.getContentRaw().charAt(0) == 'L')&& !(msg.getContentRaw().charAt(0) == 'M')&& !(msg.getContentRaw().charAt(0) == 'N')&& !(msg.getContentRaw().charAt(0) == 'O')&& !(msg.getContentRaw().charAt(0) == 'P')&& !(msg.getContentRaw().charAt(0) == 'Q')&& !(msg.getContentRaw().charAt(0) == 'R')&& !(msg.getContentRaw().charAt(0) == 'S')&& !(msg.getContentRaw().charAt(0) == 'T')&& !(msg.getContentRaw().charAt(0) == 'U')&& !(msg.getContentRaw().charAt(0) == 'V')&& !(msg.getContentRaw().charAt(0) == 'W')&& !(msg.getContentRaw().charAt(0) == 'X')&& !(msg.getContentRaw().charAt(0) == 'Y')&& !(msg.getContentRaw().charAt(0) == 'Z')) {
    									  channel.sendMessage("https://mangadex.org/title/" + msg.getContentRaw() + "/").queue(); //posts ad mangadex link from 5 digits
    								  	  } else {
    								  		if (msg.getContentRaw().length() == 6 && !(msg.getContentRaw().charAt(0) == ':') && !(msg.getContentRaw().charAt(0) == 'a')&& !(msg.getContentRaw().charAt(0) == 'b')&& !(msg.getContentRaw().charAt(0) == 'c')&& !(msg.getContentRaw().charAt(0) == 'd')&& !(msg.getContentRaw().charAt(0) == 'e')&& !(msg.getContentRaw().charAt(0) == 'f')&& !(msg.getContentRaw().charAt(0) == 'g')&& !(msg.getContentRaw().charAt(0) == 'h')&& !(msg.getContentRaw().charAt(0) == 'i')&& !(msg.getContentRaw().charAt(0) == 'j')&& !(msg.getContentRaw().charAt(0) == 'k')&& !(msg.getContentRaw().charAt(0) == 'l')&& !(msg.getContentRaw().charAt(0) == 'm')&& !(msg.getContentRaw().charAt(0) == 'n')&& !(msg.getContentRaw().charAt(0) == 'o')&& !(msg.getContentRaw().charAt(0) == 'p')&& !(msg.getContentRaw().charAt(0) == 'q')&& !(msg.getContentRaw().charAt(0) == 'r')&& !(msg.getContentRaw().charAt(0) == 's')&& !(msg.getContentRaw().charAt(0) == 't')&& !(msg.getContentRaw().charAt(0) == 'u')&& !(msg.getContentRaw().charAt(0) == 'v')&& !(msg.getContentRaw().charAt(0) == 'w')&& !(msg.getContentRaw().charAt(0) == 'x')&& !(msg.getContentRaw().charAt(0) == 'y')&& !(msg.getContentRaw().charAt(0) == 'z')&& !(msg.getContentRaw().charAt(0) == 'A')&& !(msg.getContentRaw().charAt(0) == 'B')&& !(msg.getContentRaw().charAt(0) == 'C')&& !(msg.getContentRaw().charAt(0) == 'D')&& !(msg.getContentRaw().charAt(0) == 'E')&& !(msg.getContentRaw().charAt(0) == 'F')&& !(msg.getContentRaw().charAt(0) == 'G')&& !(msg.getContentRaw().charAt(0) == 'H')&& !(msg.getContentRaw().charAt(0) == 'I')&& !(msg.getContentRaw().charAt(0) == 'J')&& !(msg.getContentRaw().charAt(0) == 'K')&& !(msg.getContentRaw().charAt(0) == 'L')&& !(msg.getContentRaw().charAt(0) == 'M')&& !(msg.getContentRaw().charAt(0) == 'N')&& !(msg.getContentRaw().charAt(0) == 'O')&& !(msg.getContentRaw().charAt(0) == 'P')&& !(msg.getContentRaw().charAt(0) == 'Q')&& !(msg.getContentRaw().charAt(0) == 'R')&& !(msg.getContentRaw().charAt(0) == 'S')&& !(msg.getContentRaw().charAt(0) == 'T')&& !(msg.getContentRaw().charAt(0) == 'U')&& !(msg.getContentRaw().charAt(0) == 'V')&& !(msg.getContentRaw().charAt(0) == 'W')&& !(msg.getContentRaw().charAt(0) == 'X')&& !(msg.getContentRaw().charAt(0) == 'Y')&& !(msg.getContentRaw().charAt(0) == 'Z')) {
    		    								channel.sendMessage("https://nhentai.net/g/" + msg.getContentRaw() + "/").queue(); //posts and nhentai link from 6digits
    		    							  
    								  		  } //last if
    								  	  }
    	  }
	            
    					  }
    				  }
    			  }
    		  }
    	  }
      } //main class method
	      }//public class
	    	  
	    			  //just gifs
	    							  //if (msg.getContentRaw().length() == 6 && !(msg.getContentRaw().charAt(0) == 'a')&& !(msg.getContentRaw().charAt(0) == 'b')&& !(msg.getContentRaw().charAt(0) == 'c')&& !(msg.getContentRaw().charAt(0) == 'd')&& !(msg.getContentRaw().charAt(0) == 'e')&& !(msg.getContentRaw().charAt(0) == 'f')&& !(msg.getContentRaw().charAt(0) == 'g')&& !(msg.getContentRaw().charAt(0) == 'h')&& !(msg.getContentRaw().charAt(0) == 'i')&& !(msg.getContentRaw().charAt(0) == 'j')&& !(msg.getContentRaw().charAt(0) == 'k')&& !(msg.getContentRaw().charAt(0) == 'l')&& !(msg.getContentRaw().charAt(0) == 'm')&& !(msg.getContentRaw().charAt(0) == 'n')&& !(msg.getContentRaw().charAt(0) == 'o')&& !(msg.getContentRaw().charAt(0) == 'p')&& !(msg.getContentRaw().charAt(0) == 'q')&& !(msg.getContentRaw().charAt(0) == 'r')&& !(msg.getContentRaw().charAt(0) == 's')&& !(msg.getContentRaw().charAt(0) == 't')&& !(msg.getContentRaw().charAt(0) == 'u')&& !(msg.getContentRaw().charAt(0) == 'v')&& !(msg.getContentRaw().charAt(0) == 'w')&& !(msg.getContentRaw().charAt(0) == 'x')&& !(msg.getContentRaw().charAt(0) == 'y')&& !(msg.getContentRaw().charAt(0) == 'z')&& !(msg.getContentRaw().charAt(0) == 'A')&& !(msg.getContentRaw().charAt(0) == 'B')&& !(msg.getContentRaw().charAt(0) == 'C')&& !(msg.getContentRaw().charAt(0) == 'D')&& !(msg.getContentRaw().charAt(0) == 'E')&& !(msg.getContentRaw().charAt(0) == 'F')&& !(msg.getContentRaw().charAt(0) == 'G')&& !(msg.getContentRaw().charAt(0) == 'H')&& !(msg.getContentRaw().charAt(0) == 'I')&& !(msg.getContentRaw().charAt(0) == 'J')&& !(msg.getContentRaw().charAt(0) == 'K')&& !(msg.getContentRaw().charAt(0) == 'L')&& !(msg.getContentRaw().charAt(0) == 'M')&& !(msg.getContentRaw().charAt(0) == 'N')&& !(msg.getContentRaw().charAt(0) == 'O')&& !(msg.getContentRaw().charAt(0) == 'P')&& !(msg.getContentRaw().charAt(0) == 'Q')&& !(msg.getContentRaw().charAt(0) == 'R')&& !(msg.getContentRaw().charAt(0) == 'S')&& !(msg.getContentRaw().charAt(0) == 'T')&& !(msg.getContentRaw().charAt(0) == 'U')&& !(msg.getContentRaw().charAt(0) == 'V')&& !(msg.getContentRaw().charAt(0) == 'W')&& !(msg.getContentRaw().charAt(0) == 'X')&& !(msg.getContentRaw().charAt(0) == 'Y')&& !(msg.getContentRaw().charAt(0) == 'Z')) {
	    								//  channel.sendMessage("https://nhentai.net/g/" + msg.getContentRaw() + "/").queue(); //posts and nhentai link from 6digits
	    							  //} else {
	    								   
	    	 // }
		            
	    					//  }
	    //}
	 