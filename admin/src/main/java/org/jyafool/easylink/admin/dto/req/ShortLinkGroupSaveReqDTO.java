package org.jyafool.easylink.admin.dto.req;

import lombok.Data;

/**
 * 短链接分组创建参数
 * @Author jyafool
 * @Version 1.0
 * @Since 2024/6/7
 */
@Data
public class ShortLinkGroupSaveReqDTO {

    /**
     * 分组名
     */
    private String name;
}
