# 자바관련 알고리즘 문제를 하루에 2개씩 풀고 정리하는 레파지토리

# 02월 08일
## 문자열
### 1. 문자열 압축
+ 문자열에서 같은 문자가 연속으로 반복되는 경우 반복된느 문자 바로 오른쪽에 반복 횟수를 표시하는 방법으로 문자열을 압축한다
    + 반복문을 사용하여 같은 문자가 나오지 않을 때까지 검사한다
    + 같은 문자가 나온 경우 count를 1씩 증가시킨다
    + 같은 문자가 나오지 않은 경우 변수에 문자와 count 개수를 연결한다
### 2. 암호
+ 문자 개수의 7개 만큼의 # 과 * 로 구성된 암호를 해제하여 문자신호로 구분한다
    + substring 메서드를 사용하여 문자열을 특정 위치까지 자른다
    + replace 메서드를 사용하여 문자가 #인 경우 1로 , *인 경우 0으로 대체한다
    + parseInt 메서드를 사용하여 2진수를 10진수를 변환한다
    + 10진수를 char로 변환하여 문자로 만든다
    + 문자를 이어 붙인다
  

# 02월 09일
## 문자열
### 1. 숫자만 추출
+ 숫자와 문자가 섞여있는 문자열에서 숫자만 추출한다 단, 숫자 순서그대로 자연수를 만든다
 + 문자열을 char 타입의 배열로 만든다
 + 배열을 순회하면서 데이터를 하나씩 꺼낸다
 + 숫자 여부를 판단하기 위해 Character 클래스의 isDigit 메서드를 사용하였다

### 2. 가장 짧은 문자거리
+ 문자열을 입력받는다 문자를 입력받는다 문자열에서 문자를 기준으로 각 문자의 거리를 구한다
  - 문자와 문자간 거리를 저장할 int 타입의 배열을 선언한다
  -   문자열을 char 타입을 배열로 만든다
  - 문자간 거리를 계산할 변수를 선언하고 1000으로 초기화 한다
    - 왜? 가장 먼 위치에 떨어져 있다고 가정하기 위함
  - 문자열에서 꺼낸 데이터와 문자가 같다면 0으로 저장한다
  - 문자열에서 꺼낸 인덱스의 데이터와 문자가 같지 않다면 1로 저장한다
  - 반복문을 순회하면서 같지 않은 문자가 나올때 마다 문자간 거리를 + 1만큼 증가시켜 준다
  - 문자간 거리를 배열에 저장한다
  - 그런데, 문제의 예시를 보면 문자기준 가장 가까운 거리를 계산하는 것을 확인할 수 있다
  - 따라서 문자열을 역 방향으로 순회하면서 거리를 계산하는 과정도 필요하다
  - 배열의 역순으로 반복문을 돌린다
    - 문자와 일치하는 값이 있으면 0으로 저장한다
    - 문자와 일치하지 않는 경우 기존에 계산해둔 거리 값과 비교한다
    - 기존 거리값이 역순으로 돌면서 검사한 거리값 보다 더 크다면
    - 역순으로 돌면서 검사한 거리값을 저장한다
      - 왜? 문자 기준 가장 가까운 거리를 계산해야 하기 때문
  

# 02월 10일
## 배열
### 큰수 출력하기
- 문제에서 첫번째 수는 무조건 출력한다고 했으므로
- 배열의 0번 인덱스의 값을 ArrayList에 담아 둔다
- 배열의 1번 인덱스부터 순회한다
- 현재 인덱스 기준 인덱스 + 1 한 위치의 값이 더 큰 경우 ArrayList에 담는다


### 보이는 학생
- 맨앞에 있는 학생은 무조건 보일 것이다
- 따라서 볼수 있는 학생수를 저장하는 변수를 1로 초기화 시켰다
- 학생수 만큼 키가 담겨있는 배열을 순회한다
- 첫번쨰 학생은 무조건 보이기 때문에 배열의 1인덱스 부터 탐색한다
- 현재 인덱스의 값 기준 인덱스+1 위치의 값이 더 큰 경우 선생님이 볼수 있는 학생이다
- 따라서 변수에 카운팅을 매겨준다


# 02월 11일
## 배열
### 소수
- 크기가 N인 배열을 선언하고 값을 0부터 N까지 넣어준다
- 반복문을 N까지 돌린다
- 숫자를 하나씩 꺼낸다 (i)
- 안쪽 반복문을 돌면서 i의 크기만큼 게속 더하면서 i의 배수에 해당하는 데이터를 걸러낸다
  - i의 배수에 해당하는 애들은 소수가 될수 없다
    - 왜? 배수가 된다는 것은 i를 약수로 갖고 있다는 의미가 되기 때문
    - 배수를 쳐내기 위해 배열[i] = 1으로 처리한다
  - i를 약수로 갖지 않는 데이터를 카운팅 한다
  

### 뒤집은 소수
- 크기가 N인 String 타입의 배열을 선언한다
- N개의 숫자를 문자타입으로 입력받는다
- 숫자를 입력받은후 StringBuffer 클래스의 reverse 메서드를 사용하여 뒤집은후 다시 배열에 저장한다
- 배열에서 숫자를 하나씩 꺼낸다
- 소수가 되려면 2부터 시작해서 자기 자신 까지의 숫자로 나눴을때 자기 자신을 제외한 다른 숫자로 나눠 떨어지면 안된다
- 바깥쪽 반복문을 돌면서 숫자를 하나씩 꺼낸다
  - 2부터 자기자신 까지 돌면서 나눠떨어지는지 검사한다
  - 나눠떨어지는 경우 primeCount 변수의 값을 1씩 증가시킨다
  - 안쪽 반복문을 다 돈후 primeCount 변수의 값이 1 인 경우
  - ArrayList에 해당 숫자를 담는다
  
#02월 12일
### 점수계산
- 문제를 연속으로 맞히는 경우 1점씩 가산점이 붙는다
- 따라서 맞힌 문제개수를 저장할 변수를 선언하고 0으로 초기화 한다
- 총점을 저장할 변수를 선언하고 0으로 초기화 한다
- 반복문을 돌면서 배열에서 데이터를 꺼낸다
  - 데이터값이 1인 경우 맞힌 문제이다
  - 문제를 맞힐때 마다 맞힌 문제수 만큼 변수에 + 1 해준다
  - 총점을 계산하는 변수에 맞힌 문제수를 더해준다
  - 왜? 문제에서 점수가 계산되는 방식의 규칙을 살펴보면
  - 문제를 연속으로 맞히는 경우 맞힌 문제 개수가 변수가 된다
  - 따라서 맞힌 문제개수를 총점을 구하는 변수에 누적하여 더해준다
  - 문제를 틀리는 경우 맞힌 문제 개수를 저장하는 변수를 0으로 초기화 시킨다
  

# 02월 14일
### 가위바위보
- A가 낸 패를 담을 배열을 선언한다
- B가 낸 패를 담을 배열을 선언한다
- A가 낸 패와 B가 낸 패를 비교하여 이겼을때 졌을때 비겼을때를 판별한다