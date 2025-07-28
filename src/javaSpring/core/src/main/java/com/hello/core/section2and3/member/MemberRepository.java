package com.hello.core.section2and3.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long id);


}
