package com.yd.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * TODO
 *
 * @data: 2018/8/3
 * @author: YD
 */
@ConfigurationProperties(prefix = "datasource.config")
public class DbProperties {

    private String username = "localhost";

    private String password = "123456";

    private int port = 3308;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
