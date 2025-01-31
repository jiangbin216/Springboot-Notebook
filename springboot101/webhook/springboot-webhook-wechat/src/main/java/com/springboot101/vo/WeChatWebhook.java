package com.springboot101.vo;//package com.springboot101.webhook.vo;

import lombok.Data;

import java.util.List;

/**
 * @Auther: 程序员小富
 * @Date: 2021/5/19 20:56
 * @Description:
 */
@Data
public class WeChatWebhook {

    private String msgtype;

    private TextDTO text;

    @Data
    public static class TextDTO {

        private String content;

        private List<String> mentionedList;

        private List<String> mentionedMobileList;
    }
}
