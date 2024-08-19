package run.mone.neo4j;

import lombok.Data;

/**
 * @author caobaoyu
 * @description:
 * @date 2024-08-19 19:07
 */
@Data
public class RelationshipDetail {

    private Object label;

    private String next;

    private String desc;
}
