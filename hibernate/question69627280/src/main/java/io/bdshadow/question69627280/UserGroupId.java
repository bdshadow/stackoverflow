package io.bdshadow.question69627280;

import java.io.Serializable;

public class UserGroupId implements Serializable {
    //@Column(name = "user_id") - NOT NEEDED, CAUSES EXCEPTION
    private String userId;

    //@Column(name = "group_id") - NOT NEEDED, CAUSES EXCEPTION
    private Integer group;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String productId) {
        this.userId = productId;
    }

    public Integer getGroupId() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }
}
