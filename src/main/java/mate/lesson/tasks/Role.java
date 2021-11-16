package mate.lesson.tasks;

public class Role {
    private Long id;
    // 1, 2
    private ROLE_NAME roleName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ROLE_NAME getRoleName() {
        return roleName;
    }

    public void setRoleName(ROLE_NAME roleName) {
        this.roleName = roleName;
    }

    enum ROLE_NAME {
        USER, ADMIN
    }
}
