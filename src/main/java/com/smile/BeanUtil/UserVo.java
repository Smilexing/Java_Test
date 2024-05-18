package com.smile.BeanUtil;/**
 * @Author: Yeman
 * @Date: 2024-05-17-9:17
 * @Description:
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: TODO
 * @author Tom Smile
 * @date 2024/5/17 9:17
 * @version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserVo {

    private Long userId;

    private String userName;

    private Integer age;

    private String sex;
}

