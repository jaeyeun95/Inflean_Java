package chapter12.collection.hashmap;

import chapter12.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member lee = new Member(102, "이순신");
        Member kim = new Member(101, "김유신");
        Member shin = new Member(103, "신사임당");

        memberHashMap.addMember(lee);
        memberHashMap.addMember(kim);
        memberHashMap.addMember(shin);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(102);
        memberHashMap.showAllMember();

    }

}
