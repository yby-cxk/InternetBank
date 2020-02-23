package com.internetbank.yby.debit_card.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zyw
 * @since 2020-02-22
 */
@Data
//@EqualsAndHashCode(callSuper = false)
//@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class DebitCard implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("uNo")
    private String uNo;

    private String bank;

    @TableId(value = "card_number",type = IdType.AUTO)
    private String cardNumber;

    private String traPassword;

    private String resPassword;

    private String money;

    private Integer moneyLimit;

    private String state;

    private Integer point;


}
