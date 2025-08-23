package zmq.io.net.tipc;
import zmq.io.net.Address;
import zmq.io.net.ProtocolFamily;
public class TipcAddress implements Address.IZAddress<TipcSocketAddress>{

    public TipcAddress(String addr)
    {
        this.address = resolve(addr);
    }

    @Override
    public TipcSocketAddress address() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProtocolFamily family() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TipcSocketAddress resolve(String name, boolean ipv6, boolean local) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TipcSocketAddress sourceAddress() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString(int port) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
