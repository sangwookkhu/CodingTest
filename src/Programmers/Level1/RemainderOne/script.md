```java
// 다른 사람의 풀이
public int solution(int n) {
    return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
}
```

---

### 1. `IntStream.range(2,n)`
- 생성 되는 숫자 -> (2, 3, 4, 5, 6, 7, 8, ... , n-1)

---

### 2. `.filter(i -> n % i == 1)`
- i에 대하여 `n % 1`이 1인지 확인

---

### 3. `.findFirst()`
- filter의 조건을 만족하는 첫번째 수를 찾음
- OptionalInt으로 반환

### 4. `.orElse(0)`
- 만족하는 값이 없다면 0을 반환