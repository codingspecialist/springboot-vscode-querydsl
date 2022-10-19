package site.metacoding.dsl.domain;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class FooRepository {

    private final JPAQueryFactory query;

    public List<Foo> findAll() {
        QFoo foo = QFoo.foo;
        List<Foo> result = query.select(foo).from(foo).fetch();
        return result;
    }
}
