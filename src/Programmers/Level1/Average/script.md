// 다른 사람의 풀이
public double solution(int[] arr) {
    return Arrays.stream(arr).average().getAsDouble();
}

위의 방식은 Java8에서 도입된 StreamAPI를 사용한 방법이다.

1. Arrays.stream(arr)
- 일반 배열을 자바의 Stream 객체로 변환
- 즉, 데이터를 하나씩 흘려보내는 '파이프라인'을 만든다고 생각하면됨
- 여기서는 IntStream이 생성됨

2. .average()
- 스트림 안의 숫자들의 산술 평균을 계산
- 내부적으로 모든 요소를 더하고 개수로 나누는 작업을 자동으로 수행
- 이 함수는 결과값으로 double을 바로 주는 게 아니라, OptionalDouble이라는 박스에 담아서 반환

3. .getAsDouble()
- average()가 계산해 놓은 평균값을 최종적으로 반환받는 단계
- OptionalDouble 박스 안에 들어있는 실제 double 값을 꺼냄