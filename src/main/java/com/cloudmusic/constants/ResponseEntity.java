package com.cloudmusic.constants;
import java.io.Serializable;

/**
 * Created by taoye on 2020/5/11.
 */
public class ResponseEntity implements Serializable {

    private  Integer status;

    private  String msg;

    private  Object data;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Integer getSUCCEED() {
        return SUCCEED;
    }

    public static Integer getFAILED() {
        return FAILED;
    }

    // 成功
    public static final Integer SUCCEED = 200;

    // 失败
    public static final Integer FAILED = 500;

    private ResponseEntity(Integer status , String msg , Object data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static ResponseEntity succeed(Object t){
        return  new ResponseEntity(SUCCEED , null , t);
    }

    public static ResponseEntity failed(String msg , Object t){
        return  new ResponseEntity(FAILED , msg , t);
    }

}
