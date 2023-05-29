package bai1;

public class Teacher extends People {
    private String level;
    private String experience;
    private String subject;

    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String sex, int height, int weight, String level, String experience, String subject) {
        super(name, age, sex, height, weight);
        this.level = level;
        this.experience = experience;
        this.subject = subject;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex='" + getSex() + '\'' +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ",level='" + level + '\'' +
                ", experience='" + experience + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
