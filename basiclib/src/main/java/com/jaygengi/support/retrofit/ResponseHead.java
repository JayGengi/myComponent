package com.jaygengi.support.retrofit;

import android.content.Context;


/**
 * 描述：
 *
 * @author zhangqin
 * @date 2018/2/10
 */
public class ResponseHead<T> {

    /**
     * 接口名称
     * */
    private String method;
    /**
     * 信息级别：Info、警告：Warn、异常：Error
     * */
    private String level;
    /**
     * 操作结果：000、001、002、003
     * */
    private String code;
    /**
     * 返回信息
     * */
    private String description;
    /**
     * 数据集
     * */
    private T data;

    @Override
    public String toString() {
        return "ResponseHead{" +
                "method='" + method + '\'' +
                ", level='" + level + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", data=" + data +
                '}';
    }

    public boolean isOk(Context context) {
        if (code.equals("000")) {
            return true;
        } else {
            NetworkError.error(context, new ServerException(Integer.parseInt(code), description));
            return false;
        }
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
