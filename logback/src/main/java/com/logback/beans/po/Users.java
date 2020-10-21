package com.logback.beans.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiWei
 * @since 2020-10-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("users")
public class Users extends Model<Users> {

    private static final long serialVersionUID=1L;

    @TableId("id")
    private Long id;

    /**
     * 用户名，账号，慕信号
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 我的头像，如果没有默认给一张
     */
    @TableField("face_image")
    private String faceImage;

    @TableField("face_image_big")
    private String faceImageBig;

    /**
     * 昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 新用户注册后默认后台生成二维码，并且上传到fastdfs
     */
    @TableField("qrcode")
    private String qrcode;

    @TableField("cid")
    private String cid;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
