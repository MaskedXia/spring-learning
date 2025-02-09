package com.pipe.demo05.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

@Data
public class Countries {
    @TableId
    @TableField(value = "country_id")
    private String countryId;
    @TableField(value = "country_name")
    private String countryName;
    @TableField(value = "region_id")
    private String regionId;
    @TableField(exist = false)
    private Integer online;
}
