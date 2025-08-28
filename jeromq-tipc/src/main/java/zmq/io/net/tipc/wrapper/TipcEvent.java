package zmq.io.net.tipc.wrapper;

import java.lang.foreign.MemorySegment;

public class TipcEvent {
    private MemorySegment memorySegment;    

    public int event() {
return tipc_event.event(this.memorySegment);
    }

    public void event(int event) {
        tipc_event.event(this.memorySegment, event);
    }

    public int foundLower() {
        return tipc_event.found_lower(this.memorySegment);
    }

    public void foundLower(int foundLower) {
        tipc_event.found_lower(this.memorySegment, foundLower);
    }

    public int foundUpper() {
        return tipc_event.found_upper(this.memorySegment);
    }

    public void foundUpper(int foundUpper) {
        tipc_event.found_upper(this.memorySegment, foundUpper);
    }

    public TipcSoketAddress port() {
        return new TipcSocketAddress(tipc_event.port(this.memorySegment));
    }

    public void port(TipcSocketAddress port) {
        tipc_event.port(this.memorySegment, port.getPtr());
    }

    public TipcSubscriber s() {
        return new TipcSubscriber(tipc_event.s(this.memorySegment));
    }

    public void s(TipcSubscriber s) {
        tipc_event.s(this.memorySegment, s);
    }
}
