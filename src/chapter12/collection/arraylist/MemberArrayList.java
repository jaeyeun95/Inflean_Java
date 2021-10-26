package chapter12.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {

        // ArrayList 사용할 경우
        // for (int i = 0; i < arrayList.size(); i++) {
        // Member member = arrayList.get(i);
        // int tempId = member.getMemberId();
        // if (memberId == tempId) {
        // arrayList.remove(i);
        // return true;
        // }
        // }

        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();

            int tempId = member.getMemberId();
            if (memberId == tempId) {
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {

        for (Member m : arrayList) {
            System.out.println(m);
        }
        System.out.println();

        // System.out.println(arrayList);
    }
}
