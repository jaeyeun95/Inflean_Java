package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member lee = new Member(101, "이순신");
        Member kim = new Member(102, "김유신");
        Member shin = new Member(103, "신사임당");

        memberHashSet.addMember(lee);
        memberHashSet.addMember(kim);
        memberHashSet.addMember(shin);

        memberHashSet.showAll();

        Member lee2 = new Member(101, "이몽룡");
        memberHashSet.addMember(lee2);
        memberHashSet.showAll();
    }

}
