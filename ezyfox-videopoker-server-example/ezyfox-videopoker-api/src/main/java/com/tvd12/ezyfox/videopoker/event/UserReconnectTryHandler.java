/**
 * 
 */
package com.tvd12.ezyfox.videopoker.event;

import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.command.Log;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;
import com.tvd12.ezyfox.core.entities.ApiZone;
import com.tvd12.ezyfox.videopoker.entities.VideoPokerUser;

/**
 * @author tavandung12
 *
 */
@ServerEventHandler(event = ServerEvent.USER_RECONNECTION_TRY)
public class UserReconnectTryHandler {

    public void handle(AppContext context, ApiZone zone, VideoPokerUser user) {
        context.command(Log.class).from(this).info(
                "=====>> user " + user.getName()
                + " reconnection try zone = " 
                + zone.getName());
    }
    
}
