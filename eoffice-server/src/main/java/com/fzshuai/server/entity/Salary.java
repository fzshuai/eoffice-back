package com.fzshuai.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author fzshuai
 * @since 2022/03/14 13:43
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_salary")
@ApiModel(value = "Salary对象", description = "")
public class Salary implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("基本工资")
    private Integer basicSalary;

    @ApiModelProperty("奖金")
    private Integer bonus;

    @ApiModelProperty("午餐补助")
    private Integer lunchSalary;

    @ApiModelProperty("交通补助")
    private Integer trafficSalary;

    @ApiModelProperty("应发工资")
    private Integer allSalary;

    @ApiModelProperty("养老金基数")
    private Integer pensionBase;

    @ApiModelProperty("养老金比率")
    private Float pensionPer;

    @ApiModelProperty("启用时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private LocalDateTime createDate;

    @ApiModelProperty("医疗基数")
    private Integer medicalBase;

    @ApiModelProperty("医疗保险比率")
    private Float medicalPer;

    @ApiModelProperty("公积金基数")
    private Integer accumulationFundBase;

    @ApiModelProperty("公积金比率")
    private Float accumulationFundPer;

    @ApiModelProperty("名称")
    private String name;


}
