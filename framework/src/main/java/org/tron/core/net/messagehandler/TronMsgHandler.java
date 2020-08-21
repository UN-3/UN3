package org.un.core.net.messagehandler;

import org.un.core.exception.P2pException;
import org.un.core.net.message.UnMessage;
import org.un.core.net.peer.PeerConnection;

public interface UnMsgHandler {

  void processMessage(PeerConnection peer, UnMessage msg) throws P2pException;

}
