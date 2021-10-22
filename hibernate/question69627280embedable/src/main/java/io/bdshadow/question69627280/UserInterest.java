package io.bdshadow.question69627280;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "user_interest")
public class UserInterest {

    @EmbeddedId
    private UserGroupId userGroupId;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("groupId")
    private Group group;

    public UserGroupId getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(UserGroupId userGroupId) {
        this.userGroupId = userGroupId;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group product) {
        this.group = product;
    }
}
