package mate.lesson.test;

public enum CourseName {
    FE_FT("Frontend"),
    FE_PT("Frontend part-time"),
    JV_FT("Java"),
    JV_PT("Java part-time"),
    FS_FT("Full stack"),
    FS_PT("Full stack part-time"),
    UI_UX_FT("UI/UX design"),
    QA_FT("QA");

    private String courseName;

    CourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
