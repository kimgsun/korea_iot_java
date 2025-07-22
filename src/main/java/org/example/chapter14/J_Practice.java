package org.example.chapter14;

/*
    1. 컬렉션 프레임 워크
    2. 스트림 API
    3. 람다식 & 메서드 참조

    == 학생 관리 시스템 ==
    : 학생 목록 필터링 & 정렬
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
@ToString
class StudentClass {
    private String name;
    private int age;
    private double grade; // 학점
}

public class J_Practice {
    public static void main(String[] args) {
        List<StudentClass> studentClasses = Arrays.asList(
                new StudentClass("오신혁", 25, 4.3),
                new StudentClass("김세훈", 30, 4.5),
                new StudentClass("권민현", 27, 4.0),
                new StudentClass("안미향", 29, 3.8),
                new StudentClass("김태양", 20, 3.9)
        );

        // 1) 학점이 4.0 이상인 학생 필터링
        List<StudentClass> filteredStudents = studentClasses.stream()
                .filter(student -> student.getGrade() >= 4.0)
                .collect(Collectors.toList());

        // Collectors.toList()
        // : static 메서드
        // - 스트림을 List 타입으로 변환
        
        System.out.println("학점이 4.0이상인 학생");
        filteredStudents.forEach(System.out::println);

        // 2) 학생 이름 목록만 추출

        // 3) 학생들을 점수 순으로 정렬

        // 4) 학생들 중 이름에 '민' 자가 포함된 학생 필터링
    }
}
