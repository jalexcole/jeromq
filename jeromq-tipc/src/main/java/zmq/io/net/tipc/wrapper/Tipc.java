package zmq.io.net.tipc.wrapper;

public class Tipc {
    public static final int TIPC_NODE_STATE = tipc_h.TIPC_NODE_STATE();
    public static final int TIPC_TOP_SRC = tipc_h.TIPC_TOP_SRC();
    public static final int TIPC_LINK_STATE = tipc_h.TIPC_LINK_STATE();
    public static final int TIPC_RESERVED_TYPES = tipc_h.TIPC_RESERVED_TYPES();

    /**
     * Publication scopes when binding service / service range
     */
    public enum Scope {
        CLUSTER_SCOPE, NODE_SCOPE;
    }

    /**
     * Limiting value for messages
     */
    public static final int TIPC_MAX_USER_MSG_SIZE = tipc_h.TIPC_MAX_USER_MSG_SIZE();

    /*
     * Message importance levels
     */

    public static final int TIPC_LOW_IMPORTANCE = tipc_h.TIPC_LOW_IMPORTANCE();
    public static final int TIPC_MEDIUM_IMPORTANCE = tipc_h.TIPC_MEDIUM_IMPORTANCE();
    public static final int TIPC_HIGH_IMPORTANCE = tipc_h.TIPC_HIGH_IMPORTANCE();
    public static final int TIPC_CRITICAL_IMPORTANCE = tipc_h.TIPC_CRITICAL_IMPORTANCE();

    /*
     * Msg rejection/connection shutdown reasons
     */

    public static final int TIPC_OK = tipc_h.TIPC_OK(); /* no error */
    public static final int TIPC_ERR_NO_NAME = tipc_h.TIPC_ERR_NO_NAME(); /* name not found */
    public static final int TIPC_ERR_NO_PORT = tipc_h.TIPC_ERR_NO_PORT(); /* port not found */
    public static final int TIPC_ERR_NO_NODE = tipc_h.TIPC_ERR_NO_NODE(); /* node not found */
    public static final int TIPC_ERR_OVERLOAD = tipc_h.TIPC_ERR_OVERLOAD(); /* node overloaded */
    public static final int TIPC_CONN_SHUTDOWN = tipc_h.TIPC_CONN_SHUTDOWN(); /* connection shutdown */

    /*
     * TIPC topology subscription service definitions
     */

    public static final byte TIPC_SUB_PORTS = tipc_h.TIPC_SUB_PORTS(); /* filter: evt at each match */
    public static final byte TIPC_SUB_SERVICE = tipc_h.TIPC_SUB_SERVICE(); /* filter: evt at first up/last down */
    public static final byte TIPC_SUB_CANCEL = tipc_h.TIPC_SUB_CANCEL(); /* filter: cancel a subscription */

}
