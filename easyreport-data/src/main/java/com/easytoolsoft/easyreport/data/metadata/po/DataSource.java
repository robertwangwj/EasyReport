package com.easytoolsoft.easyreport.data.metadata.po;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * 报表数据源(ezrpt_meta_datasource表)持久化类
 *
 * @author Tom Deng
 */
@SuppressWarnings("serial")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DataSource implements Serializable {
    /**
     * 数据源ID
     */
    private Integer id;
    /**
     * 数据源唯一ID,由调接口方传入
     */
    private String uid;
    /**
     * 数据源名称
     */
    private String name;
    /**
     * 数据源驱动类
     */
    private String driverClass;
    /**
     * 数据源连接字符串(JDBC)
     */
    private String jdbcUrl;
    /**
     * 数据源登录用户名
     */
    private String user;
    /**
     * 数据源登录密码
     */
    private String password;
    /**
     * 数据源配置选项(JSON格式）
     */
    private String options;
    /**
     * 说明备注
     */
    private String comment;
    /**
     * 记录创建时间
     */
    private Date gmtCreated;
    /**
     * 记录修改时间
     */
    private Date gmtModified;
}
