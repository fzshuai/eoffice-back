package com.fzshuai.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

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
@TableName("t_salary_adjust")
@ApiModel(value = "SalaryAdjust对象", description = "")
public class SalaryAdjust implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("员工ID")
    private Integer eid;

    @ApiModelProperty("调薪日期")
    private LocalDate asDate;

    @ApiModelProperty("调前薪资")
    private Integer beforeSalary;

    @ApiModelProperty("调后薪资")
    private Integer afterSalary;

    @ApiModelProperty("调薪原因")
    private String reason;

    @ApiModelProperty("备注")
    private String remark;


}
