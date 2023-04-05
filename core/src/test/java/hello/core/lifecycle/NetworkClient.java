package hello.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient{

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
        connect();
        call("init message");

    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("connect: " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + "message = " + message);
    }

    public void disconnect() {
        System.out.println("close: " + url);
    }

    @PostConstruct
    public void init() {
        connect();
        call("init message");

    }

    @PreDestroy
    public void close() {
        disconnect();
    }
}


