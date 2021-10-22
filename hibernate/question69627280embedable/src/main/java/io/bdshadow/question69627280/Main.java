package io.bdshadow.question69627280;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        UserGroupId userGroupId = new UserGroupId();
        userGroupId.setUserId("1");

        Group group = new Group();
        group.setId(1);

        UserInterest userInterest = new UserInterest();
        userInterest.setUserGroupId(userGroupId);
        userInterest.setGroup(group);

        insertUserInterest(userInterest);
        Group groupPersisted = findGroup(1);
        System.out.println(groupPersisted);
    }

    private static void insertUserInterest(UserInterest userInterest) {
        EntityManager entityManager = openEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userInterest);
        entityManager.getTransaction().commit();
    }

    private static Group findGroup(Integer groupId) {
        EntityManager entityManager = openEntityManager();
        Group group = entityManager.find(Group.class, groupId);
        entityManager.close();
        return group;
    }



    private static EntityManagerFactory entityManagerFactory = null;

    /**
     * Open entity manager.
     *
     * @return the entity manager
     */
    private static EntityManager openEntityManager() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory( "Demo" );
        }
        return entityManagerFactory.createEntityManager();
    }
}
