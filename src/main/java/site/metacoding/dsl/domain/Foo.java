package site.metacoding.dsl.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Foo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foo_id")
    private Long id;

    @Column(name = "foo_name")
    private String name;

    @Column(name = "foo_phone")
    private String phone;
}