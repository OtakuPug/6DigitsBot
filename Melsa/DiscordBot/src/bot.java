import java.awt.Color;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.MessageHistory;
import net.dv8tion.jda.api.entities.MessageHistory.MessageRetrieveAction;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class bot extends ListenerAdapter {
	public static Member member;
	 @Override
	    public void onMessageReceived(MessageReceivedEvent e)
	    //creating the listener for 6digitbot
	    {
		 Message msg = e.getMessage(); //creating the message
	        MessageChannel channel = e.getChannel(); //getting the channel
	        Guild guild = e.getGuild();  //getting the guild
	      String ID = guild.getId(); //guild id
	      String melsaGuild = "520253545380053002";
	      String hkGuild = "614887949141803018";
	      Boolean melsaGuildTest = !(guild.getId().equals(melsaGuild));
	      Boolean hkGuildTest = !(guild.getId().equals(hkGuild));
	      
	      Boolean letterTest = !(msg.getContentRaw().charAt(0) == ':') && !(msg.getContentRaw().charAt(0) == 'a')&& !(msg.getContentRaw().charAt(0) == 'b')&& !(msg.getContentRaw().charAt(0) == 'c')&& !(msg.getContentRaw().charAt(0) == 'd')&& !(msg.getContentRaw().charAt(0) == 'e')&& !(msg.getContentRaw().charAt(0) == 'f')&& !(msg.getContentRaw().charAt(0) == 'g')&& !(msg.getContentRaw().charAt(0) == 'h')&& !(msg.getContentRaw().charAt(0) == 'i')&& !(msg.getContentRaw().charAt(0) == 'j')&& !(msg.getContentRaw().charAt(0) == 'k')&& !(msg.getContentRaw().charAt(0) == 'l')&& !(msg.getContentRaw().charAt(0) == 'm')&& !(msg.getContentRaw().charAt(0) == 'n')&& !(msg.getContentRaw().charAt(0) == 'o')&& !(msg.getContentRaw().charAt(0) == 'p')&& !(msg.getContentRaw().charAt(0) == 'q')&& !(msg.getContentRaw().charAt(0) == 'r')&& !(msg.getContentRaw().charAt(0) == 's')&& !(msg.getContentRaw().charAt(0) == 't')&& !(msg.getContentRaw().charAt(0) == 'u')&& !(msg.getContentRaw().charAt(0) == 'v')&& !(msg.getContentRaw().charAt(0) == 'w')&& !(msg.getContentRaw().charAt(0) == 'x')&& !(msg.getContentRaw().charAt(0) == 'y')&& !(msg.getContentRaw().charAt(0) == 'z')&& !(msg.getContentRaw().charAt(0) == 'A')&& !(msg.getContentRaw().charAt(0) == 'B')&& !(msg.getContentRaw().charAt(0) == 'C')&& !(msg.getContentRaw().charAt(0) == 'D')&& !(msg.getContentRaw().charAt(0) == 'E')&& !(msg.getContentRaw().charAt(0) == 'F')&& !(msg.getContentRaw().charAt(0) == 'G')&& !(msg.getContentRaw().charAt(0) == 'H')&& !(msg.getContentRaw().charAt(0) == 'I')&& !(msg.getContentRaw().charAt(0) == 'J')&& !(msg.getContentRaw().charAt(0) == 'K')&& !(msg.getContentRaw().charAt(0) == 'L')&& !(msg.getContentRaw().charAt(0) == 'M')&& !(msg.getContentRaw().charAt(0) == 'N')&& !(msg.getContentRaw().charAt(0) == 'O')&& !(msg.getContentRaw().charAt(0) == 'P')&& !(msg.getContentRaw().charAt(0) == 'Q')&& !(msg.getContentRaw().charAt(0) == 'R')&& !(msg.getContentRaw().charAt(0) == 'S')&& !(msg.getContentRaw().charAt(0) == 'T')&& !(msg.getContentRaw().charAt(0) == 'U')&& !(msg.getContentRaw().charAt(0) == 'V')&& !(msg.getContentRaw().charAt(0) == 'W')&& !(msg.getContentRaw().charAt(0) == 'X')&& !(msg.getContentRaw().charAt(0) == 'Y')&& !(msg.getContentRaw().charAt(0) == 'Z');
	  { 
    		  if(msg.getContentRaw().charAt(0) == 'm' && msg.getContentRaw().charAt(1) == ' '  && !(msg.getContentRaw().charAt(2) == 'm')) { //getting the bot to talk and delete the last message
	    		  String msg2 = msg.getContentRaw();
	    				e.getMessage().delete().queue();
		            channel.sendMessage(msg2.substring(1, msg2.length())).queue(); 
	    	  } else {
	    		 if(msg.getContentRaw().equalsIgnoreCase("bruh")) {
	    			 e.getMessage().delete().queue();
	    			 EmbedBuilder ebbruh = new EmbedBuilder();
	    			 String author = e.getAuthor().getAsMention();
	    			 	ebbruh.setDescription("from: " + author);
	    			 	ebbruh.setColor(Color.green);
	    			 	ebbruh.setImage("https://cdn.discordapp.com/attachments/633814145854078988/636380461865893888/624685264995876874.gif");
	    			 	channel.sendMessage(ebbruh.build()).queue();
	    			 	
	    		 } else {
	    					  if(msg.getContentRaw().equalsIgnoreCase("heccyeah")) {
	    						  e.getMessage().delete().queue();
	    			    			 EmbedBuilder ebheccyeah = new EmbedBuilder();
	    			    			 	ebheccyeah.setColor(Color.green);
	    			    			 	String author = e.getAuthor().getAsMention();
	    			    			 	ebheccyeah.setDescription("from: " + author);
	    						  ebheccyeah.setImage("https://cdn.discordapp.com/attachments/633814145854078988/636385275987099668/519064231803355157.gif");
	    						  channel.sendMessage(ebheccyeah.build()).queue(); 
	    					  } else {
	    						  if(msg.getContentRaw().equalsIgnoreCase("nuuu")) {
	    							  e.getMessage().delete().queue();
		    			    			 EmbedBuilder ebnuuu = new EmbedBuilder(); 
		    			    			 String author = e.getAuthor().getAsMention();
		    			    			 ebnuuu.setDescription("from: " + author);
		    			    			 	ebnuuu.setColor(Color.green);
	    							  ebnuuu.setImage("https://cdn.discordapp.com/attachments/633814145854078988/636385319129841697/632357721055690773.gif");
	    							  channel.sendMessage(ebnuuu.build()).queue(); 
	    						  } else {
	    							  if(msg.getContentRaw().equalsIgnoreCase("gacha")) {
	    								  e.getMessage().delete().queue();
			    			    			 EmbedBuilder ebgacha = new EmbedBuilder();
			    			    			 String author = e.getAuthor().getAsMention();
			    			    			 ebgacha.setDescription("from: " + author);
			    			    			 	ebgacha.setColor(Color.green);
	    								  ebgacha.setImage("https://cdn.discordapp.com/attachments/633814145854078988/636385466752565288/583008145337745418.gif"); 
	    								  channel.sendMessage(ebgacha.build()).queue(); 
	    							  } else {
	    							  if(msg.getContentRaw().length() == 5 && letterTest) {
    									  channel.sendMessage("https://mangadex.org/title/" + msg.getContentRaw() + "/").queue(); //posts ad mangadex link from 5 digits
    								  	  } else {
    								  		if (msg.getContentRaw().length() == 6 &&((TextChannel) channel).isNSFW()) {
    		    								channel.sendMessage("https://nhentai.net/g/" + msg.getContentRaw() + "/").queue(); //posts and nhentai link from 6digits
    		    							  
    								  		  } else {
    								  			  if(msg.getContentRaw().equalsIgnoreCase("gj")) {
    								  				e.getMessage().delete().queue();
    				    			    			 EmbedBuilder ebgj = new EmbedBuilder();
    				    			    			 String author = e.getAuthor().getAsMention();
    				    			    			 ebgj.setDescription("from: " + author);
    				    			    			 	ebgj.setColor(Color.green);
    				    			    			 	ebgj.setImage("https://cdn.discordapp.com/emojis/395671317497511937.gif?v=1");
    				    			    			 	channel.sendMessage(ebgj.build()).queue(); 
    								  			  } else {
    								  				  if(msg.getContentRaw().equalsIgnoreCase("mhelp")) {
    								  					EmbedBuilder ebhelp = new EmbedBuilder();
    								  					ebhelp.setTitle("Melsa Commands");
    				    			    			 	ebhelp.setColor(Color.pink);
    				    			    			 	ebhelp.setThumbnail("https://cdn.discordapp.com/attachments/310633151875514368/637274476840747008/Melsa.png");
    				    			    			 	ebhelp.setDescription("do m<command> for help on that specific command\n\nType 6 digits for an nhentai link\nType 5 digits for a mangadex link\ngifs\nEmotes\nMisc.");
    				    			    			 	channel.sendMessage(ebhelp.build()).queue(); 
    				    			    			 	} else {
    				    			    			 	if(msg.getContentRaw().equalsIgnoreCase("mhelp gifs")) {
  				    			    			 		EmbedBuilder ebgifs = new EmbedBuilder();
      								  					ebgifs.setTitle("List of Gifs");
      				    			    			 	ebgifs.setColor(Color.pink);
      				    			    			 	ebgifs.setThumbnail("https://cdn.discordapp.com/attachments/310633151875514368/637274476840747008/Melsa.png");
      				    			    			 	ebgifs.setDescription("gj\ngacha\nnuuu\nbruh\nheccyeah");
      				    			    			 	channel.sendMessage(ebgifs.build()).queue(); 	
    								  				  } else {
    								  					  if(msg.getContentRaw().equalsIgnoreCase("mdelete") && member.hasPermission(Permission.ADMINISTRATOR)) {
    								  					
    								  						  		e.getMessage().delete().queue();
    	    								  						String messageId = e.getMessageId();
    	    								  						 MessageHistory history = MessageHistory.getHistoryBefore(channel, messageId).limit(1).complete();
    	    								  						channel.purgeMessages(history.getRetrievedHistory());	 
    								  					  } else {
    								  						  if (msg.getContentRaw().equalsIgnoreCase("hello there") || msg.getContentRaw().equalsIgnoreCase("hewwo there")) {
    								  							  
    								  							 channel.sendMessage("<:HelloThere:618115969897988096>").queue();
    								  						  }
    								  						  else {
    								  							  if(msg.getContentRaw().equalsIgnoreCase("mhelp emotes")) {
    								  								EmbedBuilder ebemotes = new EmbedBuilder();
    		      								  					ebemotes.setTitle("List of Emotes");
    		      				    			    			 	ebemotes.setColor(Color.pink);
    		      				    			    			 	ebemotes.setThumbnail("https://cdn.discordapp.com/attachments/310633151875514368/637274476840747008/Melsa.png");
    		      				    			    			 	ebemotes.setDescription("hello there\nnagaping\nmelsaworry\n02bounce");
    		      				    			    			 	channel.sendMessage(ebemotes.build()).queue(); 
    								  							  }
    								  							  else {
    								  								  if(msg.getContentRaw().equalsIgnoreCase("nagaping")) {
    								  									e.getMessage().delete().queue();
    								  									  channel.sendMessage("<:nagaping:637871602259984401>").queue();
    								  								  }else {
    								  									  if(msg.getContentRaw().equalsIgnoreCase("melsaworry")) {
    								  										e.getMessage().delete().queue(); 
    								  										channel.sendMessage("<:MelsaWorry:628426584801542144>").queue();
    								  									  } else {
    								  										  if(msg.getContentRaw().equalsIgnoreCase("02bounce")) {
    								  											e.getMessage().delete().queue();
    								  											  channel.sendMessage("<a:ezgif:637875460059037698>").queue();
    								  										  } else {
    								  											  if(msg.getContentRaw().equalsIgnoreCase("mcreate")) {
    								  												  
    								  											  }
    								  										  }
    								  									  }
    								  								  }
    								  							  }
    								  						  }
    								  					  }
    								  				  }
  				    			    			 	}
    								  			  }
    								  		  }
    								  	  }
    	  }
	            
    					  }
    				  }
    			  }
    		  }
    	  }
      } //main class method
	      }//public class
	    	  
	    	
