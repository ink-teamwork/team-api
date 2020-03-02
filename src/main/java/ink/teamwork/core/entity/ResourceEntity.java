package ink.teamwork.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.beans.BeanCopier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 权限资源实体
 *
 * @author zhaokai
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "resource")
public class ResourceEntity {

    @Id
    @Column(length = 32)
    private String url;

    @Column(length = 8)
    private String method;

    @Column(length = 32)
    private String name;

    @Column(length = 128)
    private String authorities;

    @Column(length = 32)
    private String icon;

    @Column(length = 32)
    private String path;

    @Column(length = 128)
    private String groupName;

    @Column(length = 4)
    private Integer sort;

    private Boolean menu;

}
