package hello.core.member;

import lombok.*;

@Getter
@Setter
//회원 엔티티
public class Member {

    private Long id;
    private String name;
    private Grade grade;

    //생성자 생성
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

/*    // 데이터는 가지고 오고 뽑기 위해 getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }*/
}
