package io.bdshadow.question69627280;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_interest")
@IdClass(UserGroupId.class)
public class UserInterest {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    private Group group;

    public String getUserId() {
        return this.userId;
    }

    public Group getGroup() {
        return group;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setGroup(Group product) {
        this.group = product;
    }
}
