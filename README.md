# QueryDSL 설정

## 1. build.gradle
```gradle
buildscript {
	ext {
		queryDslVersion = "5.0.0"
	}
}

plugins {
    ...생략
	id "com.ewerk.gradle.plugins.querydsl" version "1.0.10"
	...생략
}

dependencies {
	...생략

	// querydsl 추가
	implementation "com.querydsl:querydsl-jpa:${queryDslVersion}"
	implementation "com.querydsl:querydsl-apt:${queryDslVersion}"

}

def querydslDir = "$buildDir/generated/querydsl"

querydsl {
	jpa = true
	querydslSourcesDir = querydslDir
}

sourceSets {
	main.java.srcDir querydslDir
}

compileQuerydsl {
	options.annotationProcessorPath = configurations.querydsl
}

configurations {
	compileOnly {
		extendsFrom annotationProcessor
	} 
	querydsl.extendsFrom compileClasspath
}

```

## 2. Q파일 생성
- vscode 왼쪽 메뉴 gradle project -> gradle refresh
- vscode 왼쪽 메뉴 gradle project -> Tasks -> compileQuerydsl 실행

## 3. Q파일 런타임시 인식 못하면!!
- querydsl q파일 찾지 못하면 아래 참고 (for vscode)
- Java Debugger 2.5점대로 확장프로그램 다운그레이드
https://www.inflearn.com/questions/35226
