package io.bdshadow.question69627280;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserGroupId implements Serializable {
    @Column(name = "user_id")
    private String userId;

    private Integer groupId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String productId) {
        this.userId = productId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
