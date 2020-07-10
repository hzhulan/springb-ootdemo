package com.example.demo.bean;

/**
 * @authod: pp_lan on 2020/7/11.
 */
public class RspMsg<T> {
    private int code;

    private String msg;

    private T data;

    public static int SUCCESS = 200;

    public static int ERROR = 500;

    public RspMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public RspMsg(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> RspMsg success(T data) {
        return new RspMsg<>(RspMsg.SUCCESS, "成功", data);
    }

    public static <T> RspMsg error(String msg) {
        return new RspMsg<>(RspMsg.ERROR, msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RspMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
