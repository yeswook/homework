package javaone.oop;

public class Student {
    private String studentId;
    private String fullName;
    private String examMethod; // phương thức thi học kỳ
    private String labMethod;  // phương thức làm bài lab
    private String quizMethod; // phương thức quiz

    public Student() {
    }

    public Student(String studentId, String fullName, String examMethod, String labMethod, String quizMethod) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.examMethod = examMethod;
        this.labMethod = labMethod;
        this.quizMethod = quizMethod;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getExamMethod() {
        return examMethod;
    }

    public void setExamMethod(String examMethod) {
        this.examMethod = examMethod;
    }

    public String getLabMethod() {
        return labMethod;
    }

    public void setLabMethod(String labMethod) {
        this.labMethod = labMethod;
    }

    public String getQuizMethod() {
        return quizMethod;
    }

    public void setQuizMethod(String quizMethod) {
        this.quizMethod = quizMethod;
    }

    // Hành vi (methods)
    public String takeExam() {
        return String.format("Sinh vien %s (%s) thi hoc ky: %s", fullName, studentId, examMethod);
    }

    public String doLab() {
        return String.format("Sinh vien %s (%s) lam bai lab: %s", fullName, studentId, labMethod);
    }

    public String takeQuiz() {
        return String.format("Sinh vien %s (%s) lam quiz: %s", fullName, studentId, quizMethod);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\\'' +
                ", fullName='" + fullName + '\\'' +
                ", examMethod='" + examMethod + '\\'' +
                ", labMethod='" + labMethod + '\\'' +
                ", quizMethod='" + quizMethod + '\\'' +
                '}';
    }

    // Demo main
    public static void main(String[] args) {
        Student s = new Student("20260001", "Nguyen Van A", "Trac nghiem", "Tai phong lab", "Online");
        System.out.println(s);
        System.out.println(s.takeExam());
        System.out.println(s.doLab());
        System.out.println(s.takeQuiz());
    }
}
