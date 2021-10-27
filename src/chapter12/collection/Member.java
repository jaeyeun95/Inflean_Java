package chapter12.collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {

    // 회원 관리 프로그램
    private int memberId;
    private String memberName;

    public Member() {
    }

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

    @Override
    public int compareTo(Member member) {

        // this. 의 값이 매개변수의 값보다 커야 오름차순 , 반대면 내림차순
        // return (this.memberId - member.memberId); // 오름차순
        return (this.memberName.compareTo(member.memberName) * (-1));
    }

    @Override
    public int compare(Member member1, Member member2) {
        // 두번째 인자가 비교할 값
        return (member1.memberId - member2.memberId);
    }

}
