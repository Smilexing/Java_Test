package com.smile.socket;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/6 10:37
 */
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@Data
@AllArgsConstructor
public class Message implements Serializable {
    private String content;

}
