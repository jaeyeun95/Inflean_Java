package chapter12.collection.treeset;

import chapter12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberHashSet = new MemberTreeSet();

        Member lee = new Member(102, "이순신");
        Member kim = new Member(101, "김유신");
        Member shin = new Member(103, "신사임당");

        memberHashSet.addMember(lee);
        memberHashSet.addMember(kim);
        memberHashSet.addMember(shin);

        memberHashSet.showAll();

    }

}
