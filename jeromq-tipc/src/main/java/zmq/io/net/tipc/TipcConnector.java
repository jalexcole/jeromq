package zmq.io.net.tipc;

import zmq.io.net.AbstractSocketConnecter;

public class TipcConnector extends AbstractSocketConnecter<TipcSocketAddress>{
    public TipcConnecter(IOThread ioThread, SessionBase session, Options options, Address<TipcSocketAddress> addr, boolean wait)
    {
        super(ioThread, session, options, addr, wait);
    }
}
