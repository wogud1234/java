package _06_컬렉션프레임워크.app.ex02;

import java.util.*;

public class MemberRepository {

    Map<String, Member> map;

    public MemberRepository() {
        this.map = new HashMap<>();
    }

    public void save(Member member) {
        map.put(member.getId(), member);
    }

    public Member findById(String id) {
        return map.get(id);
    }

    public ArrayList<Member> findByName(String name) {
        ArrayList<Member> list = new ArrayList<>();
        for(Member member : map.values()) {
            if(member.getName().equals(name))
                list.add(member);
        }
        return list;
    }

    public void remove(String id) {
        map.remove(id);
    }
}
