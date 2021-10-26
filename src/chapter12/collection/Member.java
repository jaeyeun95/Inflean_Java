package chapter12.collection;

public class Member {

    // 회원 관리 프로그램
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString() {

        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;

            if (this.memberId == member.memberId) {
                return true;
            } else
                return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

}
