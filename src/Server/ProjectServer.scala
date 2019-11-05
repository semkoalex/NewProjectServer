package Server

import com.corundumstudio.socketio.listener.{ConnectListener, DataListener, DisconnectListener}
import com.corundumstudio.socketio.{AckRequest, Configuration, SocketIOClient, SocketIOServer}

class ProjectServer {
  val config: Configuration = new Configuration {
    setHostname("localhost")
    setPort(8080)
  }
}
