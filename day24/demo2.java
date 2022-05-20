class Request {
    private String val;
    private String desc;

    public Request(String desc, String val) {
        this.desc = desc;
        this.val = val;
    }

    public String getValue() {
        return val;
    }

    public String getDescription() {
        return desc;
    }
}

abstract class Handler {
    protected Handler m_successor;

    public void setSuccessor(Handler successor) {
        m_successor = successor;
    }

    public abstract void handleRequest(Request request);
}

class civil extends Handler {
    public void handleRequest(Request request) {
        if (request.getValue().equals("CIVIL")) { 
            System.out.println(" handled by Civil");
            System.out.println( request.getDescription() + request.getValue());
        } else {
            m_successor.handleRequest(request);
        }
    }
}

class mech extends Handler {
    public void handleRequest(Request request) {
        if (request.getValue().equals("mech")) { 
            System.out.println(" handled by mech:");
            System.out.println( request.getDescription() + request.getValue());
        } else {
            m_successor.handleRequest(request);
        }
    }
}

public class demo2 {
    public static void main(String[] args) {
        Request r1=new Request("For mech DEPT","mech");
        Handler h1=new civil();
        Handler h2=new mech();
        h1.setSuccessor(h2);
        h1.handleRequest(r1);
    }

}