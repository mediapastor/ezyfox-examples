/**
 * 
 */
package com.tvd12.ezyfox.videopoker.event;

import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.command.Log;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;
import com.tvd12.ezyfox.videopoker.entities.VideoPokerUser;

/**
 * @author tavandung12
 *
 */
@ServerEventHandler(event = ServerEvent.USER_LOGOUT)
public class UserLogoutHandler {

    public void handle(AppContext context, VideoPokerUser user) {
        String username = (user != null) ? user.getName() : "unknown";
        context.command(Log.class).info("user " + username + " has logged out");
    }
    
}
