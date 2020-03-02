package ink.teamwork.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author zhaokai
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "role")
public class RoleEntity {

    @Id
    @Column(length = 128)
    private String id;

    @Column(length = 128)
    private String name;

    @Column(length = 128)
    private String parent;

    @Column(length = 4)
    private Integer sort;

    private Date createTime;

    private Date updateTime;

}
