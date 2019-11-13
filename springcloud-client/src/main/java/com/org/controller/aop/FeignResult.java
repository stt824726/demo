package com.org.controller.aop;

import lombok.Data;

import java.io.Serializable;

/**
 * feigin请求响应消息体
 */
@Data
public class FeignResult<T> implements Serializable {
    private int code;
    private String desc;
    private T data;
    public static final int SUCCESS_CODE = 0;
    public static final String SUCCESS_MSG = "操作成功";

    public static final int FAIL_CODE = 1;
    public static final String FAIL_MSG = "操作成功";

    /**
     * 兼容api老接口
     */
    private int result;
    
    public FeignResult() {}
    public FeignResult(int code, String desc, T data) {
        super();
        this.code = code;
        this.desc = desc;
        this.data = data;
        this.result = code;
    }
    
    public FeignResult(FeignResultCode feignResultCode) {
        super();
        this.code = feignResultCode.getCode();
        this.desc = feignResultCode.getDesc();
        this.result = feignResultCode.getCode();
    }
    
    public static <T> FeignResult<T> success(T data) {
        FeignResult<T> feignResult = new FeignResult<T>();
        feignResult.setCode(SUCCESS_CODE);
        feignResult.setResult(SUCCESS_CODE);
        feignResult.setDesc(SUCCESS_MSG);
        feignResult.setData(data);
        return feignResult;
    }

    public static <T> FeignResult<T> fail(int code, String desc, T data) {
        FeignResult<T> feignResult = new FeignResult<T>();
        feignResult.setCode(code);
        feignResult.setResult(code);
        feignResult.setDesc(desc);
        feignResult.setData(data);
        return feignResult;
    }

    public static <T> FeignResult<T> fail(int code, String desc) {
        FeignResult<T> feignResult = new FeignResult<T>();
        feignResult.setCode(code);
        feignResult.setResult(code);
        feignResult.setDesc(desc);
        return feignResult;
    }

    public static <T> FeignResult<T> fail(String desc) {
        FeignResult<T> feignResult = new FeignResult<T>();
        feignResult.setCode(FAIL_CODE);
        feignResult.setResult(FAIL_CODE);
        feignResult.setDesc(desc);
        return feignResult;
    }

    /**
     * 根据code==0判断是否成功
     * @return  是否成功
     */
    public boolean isSuccess() {
        return code == 0;
    }

    public void setCode(int code) {
        this.code = code;
        this.result = code;
    }

    public void setResult(int result) {
        this.result = result;
        this.code = result;
    }
}
