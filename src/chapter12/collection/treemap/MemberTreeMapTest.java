package chapter12.collection.treemap;

import chapter12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member lee = new Member(102, "이순신");
        Member kim = new Member(101, "김유신");
        Member shin = new Member(103, "신사임당");

        memberTreeMap.addMember(lee);
        memberTreeMap.addMember(kim);
        memberTreeMap.addMember(shin);

        memberTreeMap.showAllMember();

        // memberTreeMap.removeMember(102);
        // memberTreeMap.showAllMember();

    }

}
