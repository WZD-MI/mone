package run.mone.neo4j;

import lombok.Data;

import java.util.List;

/**
 * @author caobaoyu
 * @description:
 * @date 2024-08-19 17:29
 */
@Data
public class Relationship {

    private String fullName;

    private List<RelationshipDetail> relationshipDetails;


}
