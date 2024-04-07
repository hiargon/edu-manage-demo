package com.hipolis.edu.manage.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: CommonResult
 * @description:
 * @author: hipolis
 * @create: 2024-04-07 22:38
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResult<T> {

    public static final int FAIL = -1;
    public static final int SUCCESS = 0;

    @JsonProperty("error_code")
    private int code;
    @JsonProperty("error_info")
    private String info;
    @JsonProperty("data")
    private T data;
    @JsonProperty("data_list")
    private List<T> dataList;
    @JsonProperty("meta_info")
    private Map<String, Object> metaInfo;

    public CommonResult() {
        this(SUCCESS, "执行成功");
    }

    public CommonResult(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public CommonResult(int code, Throwable throwable) {
        this(code, throwable.getMessage() + ":" + throwable.getCause());
    }

    public CommonResult(List<T> result) {
        this();
        this.dataList = result;
    }

    public CommonResult(T result) {
        this();
        this.data = result;
    }

    public boolean success() {
        return code == 0;
    }

    public boolean failed() {
        return code != 0;
    }

    public CommonResult addMetaInfo(String key, Object value) {
        if (this.metaInfo == null) {
            this.metaInfo = new HashMap<>();
        }
        this.metaInfo.put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @JsonIgnore
    public T getData() {
        return data;
    }

    @JsonIgnore
    public void setData(T data) {
        this.data = data;
    }

    @JsonIgnore
    public List<T> getDataList() {
        return dataList;
    }

    @JsonIgnore
    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public Map<String, Object> getMetaInfo() {
        return metaInfo;
    }

    public void setMetaInfo(Map<String, Object> metaInfo) {
        this.metaInfo = metaInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommonResult{");
        sb.append("code=").append(code);
        sb.append(", info='").append(info).append('\'');
        sb.append(", metaInfo=").append(metaInfo);
        sb.append('}');
        return sb.toString();
    }
}
