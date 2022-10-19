package site.metacoding.dsl.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.dsl.domain.Foo;
import site.metacoding.dsl.domain.FooRepository;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class FooApiController {

    private final FooRepository fooRepository;

    @GetMapping("/v1/foo")
    public List<Foo> findAll() {
        return fooRepository.findAll();
    }
}
