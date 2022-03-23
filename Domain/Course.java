package Programmeren2.Domain;

public class Course {
    private String courseName;
    private String subject;
    private String introductionText;
    private Difficulty difficulty;
    private ArrayList<Course> recommendedCourses;

    public Course(String courseName, String subject, String introductionText, Difficulty difficulty, ArrayList<Course> recommendedCourses) {
        this.courseName = courseName;
        this.subject = subject;
        this.introductionText = introductionText;
        this.difficulty = difficulty;
        this.recommendedCourses = recommendedCourses;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIntroductionText() {
        return introductionText;
    }

    public void setIntroductionText(String introductionText) {
        this.introductionText = introductionText;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public ArrayList<Course> getRecommendedCourses() {
        return recommendedCourses;
    }

    public void setRecommendedCourses(ArrayList<Course> recommendedCourses) {
        this.recommendedCourses = recommendedCourses;
    }
    
}
