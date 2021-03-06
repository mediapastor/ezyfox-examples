/**
 * 
 */
package com.tvd12.ezyfox.videopoker.entities;

import com.tvd12.ezyfox.core.annotation.RoomAgent;
import com.tvd12.ezyfox.core.entities.ApiRoom;
import com.tvd12.ezyfox.core.entities.ApiRoomExtension;

/**
 * @author tavandung12
 *
 */
@RoomAgent
public class LobbyRoom extends ApiRoom {
    public LobbyRoom() {
        setUseWordsFilter(true);
        setExtension(new ApiRoomExtension("ezyfox-videopoker-extension", "com.tvd12.ezyfox.videopoker.GameExtension"));
    }
    
}
