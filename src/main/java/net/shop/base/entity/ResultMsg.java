package net.shop.base.entity;

import net.shop.base.util.DateUtil;

import java.io.Serializable;

public class ResultMsg implements Serializable {

    private static final long serialVersionUID = -6579084649781101208L;
    private String rmid;
    private Type type;
    private String content;
    private Object objx;
    private String time;

    public enum Type {
        SUCCESS,
        ERROR
    }

    private ResultMsg() {
    }

    private ResultMsg(Type type, String content, Object... args) {
        this.type = type;
        this.content = content;
        this.time = DateUtil.getCurrDateStr();
    }

    public static ResultMsg success() {
        return new ResultMsg(Type.SUCCESS, "1000", new Object[0]);
    }


    public static ResultMsg success(String code, Object... args) {
        return new ResultMsg(Type.SUCCESS, code, args);
    }

    public static ResultMsg error(String code, Object... args) {
        return new ResultMsg(Type.ERROR, code, args);
    }



    public ResultMsg addObjX(Object objx) {
        this.objx = objx;
        return this;
    }

    public ResultMsg addRMId(String rmid) {
        this.rmid = rmid;
        return this;
    }

}
