package com.javasampleapproach.jspresource;


public class Callback {
    private int errno;
    private String info;

    public String getinfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrono(int errno) {
        this.errno = errno;
    }
}