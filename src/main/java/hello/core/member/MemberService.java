package hello.core.member;

//회원 서비스 인터페이스
//회원을 가입하고 조회할 수 있다.
public interface MemberService {

    //회원가입
    void join(Member member);

    //회원조회
    Member findMember(Long memberId);
}
