package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member lee = new Member(101, "이순신");
        Member kim = new Member(102, "김유신");
        Member shin = new Member(103, "신사임당");

        memberArrayList.addMember(lee);
        memberArrayList.addMember(kim);
        memberArrayList.addMember(shin);

        memberArrayList.showAll();

        memberArrayList.removeMember(kim.getMemberId());
        memberArrayList.showAll();
    }

}
