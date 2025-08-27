package zmq.io.net.tipc.wrapper;

import java.lang.foreign.MemorySegment;

public class TipcEvent {
    private MemorySegment memorySegment;    

    public int event() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void event(int event) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int foundLower() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void foundLower(int foundLower) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int foundUpper() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void foundUpper(int foundUpper) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public TipcSoketAddress port() {
        throw new UnsupportedOperationException();
    }

    public void port(TipcSocketAddress port) {
        tipc_event.port(this.memorySegment, port.getPtr());
    }

    public TipcSubscriber s() {
        throw new UnsupportedOperationException();
    }

    public void s(TipcSubscriber s) {
        tipc_event.s(this.memorySegment, s);
    }
}
