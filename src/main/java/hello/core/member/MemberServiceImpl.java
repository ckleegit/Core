package hello.core.member;

//회원 서비스 구현체
public class MemberServiceImpl implements MemberService {

    //인터페이스 필요
    //인터페이스만 가지고 있으면 널포인트인셉션 터짐, 구현객체 선택
    //추상화에도 의존, 구현체에도 의존 -> DIP 위반
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
