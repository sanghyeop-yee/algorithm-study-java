# 코딩 인터뷰 실습

[toc]

## Java

### 1. Scanner 와 BufferedReader 의 차이점?

> Scanner 입력시 Space Enter 모두 경계로 인식하지만 BufferedReader 는 Enter 만 경계로 인식하고 받은 데이터가 String 으로 고정되기 때문에 데이터를 가공하는 작업이 필요할 경우가 많습니다.
>
> BufferedReader 객체를 생성하고 그 안에  InputStreamReader 객체도 생성해주어야 합니다. 
>
> 그리고 BufferedReader 는 readLine() 함수로 받으면 한줄씩 String 형태로 받게 됩니다.  때문에 StringTokenizer 를 생성해서 받아주어야 합니다. 
>
> 그리고 Tokenizer 로 받은 값을 int 형태로 파싱까지 해주어야 합니다. 
>
> 스캐너에 비교하면 꽤 복잡하지만  입력데이터가 많다면 BufferedReader 가 훨씬 빠릅니다.



```java
// InputStreamReader : 문자 단위 입력하는 클래스
// BufferedReader : 버퍼에 입력문자를 저장한후 1줄씩 읽어올수 있다.
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// Read 한 데이터 가공 방법 1
StringTokenizer st = new StringTokenizer(br.readLine()); // 인자값에 입력 문자열 넣기
// readLine() 리턴값은 String 이라 형변환을 꼭 해주어야 합니다.
int a = Integer.parseInt(st.nextToken());
int b = Integer.parseInt(st.nextToken());

// Read 한 데이터 가공 방법 2
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
String array[] = s.split(" "); // String[] arr = s.split(" "); 공백마다 데이터 끊어서 배열에 넣음



// 1. BufferedReader 에 문자 스트림인 InputStreamReader 와 바이트 스트림인 System.in 을 연결시키기
// 2. readLine() 으로 한 라인을 입력받으면 String 형태로 입력받고, 구분자로 공백문자를 전달하기 위해 st 생성하기
// 3. 

```





### 2. int vs Long

> 코딩테스트에서는 Long 을 사용하면 더 좋습니다.
>
> 자료형의 범위가 더욱 넓기 때문에 가능합니다.
>
> 이상한 음수가 답으로 나온다면 꼭 확인해서 Long 으로 변환해보세요.



```java
int answer = 1000000000;
answer += 2000000000;
System.out.println(answer);
// -1294967296

long answer = 1000000000;
answer += 2000000000;
System.out.println(answer);
// 3000000000 (의도한 답)
```





### 3. ++i vs i++

> 전위연산자 (이기적, 나 먼저) vs 후위연산자 (이타적, 다른 거 먼저)

```java
// 전위연산자
int A[] = new int[3]; // 3칸짜리 배열을 만들고
int i = 1; // i를 1로 초기화 하였습니다. 
A[++i] = 10; // 배열의 인덱스에 전위연산자를 넣고 10을 저장하면?

// 1. i값 1이 2로 증가 (나 먼저)
// 2. A[i]에 10 저장 (i=2)
// A = |0|0|10|

System.out.println(i); // 2
System.out.println(A[1]); // 0
System.out.println(A[2]); // 10
```

```java
// 후위연산자
int A[] = new int[3];
int i = 1;
A[i++] = 10;

// 1. A[i]에 10 저장 (i=1)
// A = |0|10|0|
// 2. i값 2로 증가 (다른 거 먼저)

System.out.println(i); // 2
System.out.println(A[1]); // 10
System.out.println(A[2]); // 0

```





https://www.youtube.com/watch?v=0tnWpmULrdE







### 4. String.valueOf 와 Object.toString 의 차이

> 문자열 형 변환의 대표적인 두가지 메소드입니다.
>
> 차이점은 크게 두가지입니다.
>
> 1. 변환 가능 자료형의 종류 및 개수
> 2. NULL 값의 처리 여부
>
> toString() : null 값을 문자열로 형 변환 시 NullPointerException 를 발생시킵니다. 
>
> String.valueOf() : 전달받은 파라미터가 null 이 전달될 경우 문자열 'null' 을 반환합니다.

```java
public static void main(String[] args){
  Object obj = null;
  System.out.println(String.valueOf(obj)); // String "null" 반환
  System.out.println(obj.toString()); // NullPointerException 오류 발생 
}
```







### 5. Array : 오름차순 정렬 vs 내림차순 정렬 



```java
// 오름차순
int A[] = {5, 3, 2, 4, 1} // 다섯개의 데이터를 배열에 초기화
Arrays.sort(A);
System.out.println(Arrays.toString(A));
```



```java
// 내림차순 정렬 방법 1
Integer A[] = {5, 3, 2, 4, 1} // 2. 따라서 배열의 선언을 기본형인 int 가 아닌 객체 형태인 Integer 배열로 선언합니다.
Arrays.sort(A, Collections.reverseOrder()); // 1. Collections.. 는 객체의 형태에만 적용이 가능합니다.
System.out.println(Arrays.toString(A));


// 내림차순 정렬 방법 2
int A[] = {5,3,2,4,1};
// Integer라는 래퍼 클래스를 만들어서 int 배열인 A 를 박싱해줍니다.
Integer[] tmp = Arrays.stream(A).boxed().toArray(Integer[]::new); 
Arrays.sort(tmp, Collections.reverseOrder());
System.out.println(Arrays.toString(tmp));


// 내림차순 정렬 방법 3
// 난 오름차순처럼 그냥 쓰고 싶어~ -> 그럼 -1 곱해서 저장해서 오름차순 함수로 정렬해~
int A[] = {-5, -3, -2, -4, -1}; // 실제로는 5,4,3,2,1 을 저장하고자 하는 의도지만 -1을 곱하여 저장
Arrays.sort(A);
System.out.println(Arrays.toString(A));
```





### 6. Comparable: 데이터 정렬할 때

> sort (단일 기준) vs Comparable (정렬 기준이 여러 개)



Q. 영어 점수가 높은 학생 순으로 정렬하되 영어 점수가 같으면 수학점사가 높은 학생을 선순위로 정렬하여 주세요.

```java
 // Step 1. 점수 클래스 생성하기
Class Score{
  // 멤버변수로 선언
  int english;
  int math;
  
  // 위 두 변수를 파라미터로 하는 생성자 선언
  public Score(int english, int math){
    super();
    this.english = english;
    this.math = math;
  }
  
  // 나중에 확인하기 위해
  @Override
  public String toString(){
    return "Score [english="+ english +", math="+ math +"]";
  }
}
```



```java
 // Step 2. Implement Comparable
Class Score implements Comparable<Score>
{
  int english;
  int math;
  ...
  @Override
  public int compareTo(Score o){
    return 0;
  }
}
```

