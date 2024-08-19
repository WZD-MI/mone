package run.mone.neo4j;

import lombok.Data;

/**
 * @author caobaoyu
 * @description:
 * @date 2024-08-19 17:25
 */
@Data
public class Node {
    private String fullName;

    private String packageName;

    // todo 枚举
    private Object label;

    // todo 枚举
    private Object type;

    // 元数据
    private String meta;

    private String desc;

    private String md5;

    private Float[] embedding;

    private String path;

    private String language;
}
