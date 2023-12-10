package DesignPattern.builder;

public class Student {
    private Integer id;
    private String name;
    private String major;
    private Integer age;

    public static class Builder {
        // Required parameters
        Integer id;
        String name;

        // Optional parameters
        String major;
        Integer age;

        public Builder(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder major(String major) {
            this.major = major;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);  // 필수 요소를 전달한 후 생성자를 호출
        }
    }

    private Student(Builder builder) {
        id = builder.id;
        name = builder.name;
        age = builder.age;
        major = builder.major;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public Integer getAge() {
        return age;
    }
}
