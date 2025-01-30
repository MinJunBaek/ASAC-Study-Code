// 함수 선언문
function gugudan(firstNumber, endNumber, secondNumber = 9) {
    for(let i = firstNumber; i < endNumber+1; i++){
        for (let j = 1; j < secondNumber+1; j++){
            console.log(`${i} X ${j} = ${i * j}`);
        }
        console.log('\n');
    }
}

gugudan(3, 5, 9);

// 함수 표현식(네이밍 함수)
const namingFunction = function gugu(firstNumber, endNumber, secondNumber = 9) {
    console.log('네이밍 함수');
    for(let i = firstNumber; i < endNumber+1; i++){
        for (let j = 1; j < secondNumber+1; j++){
            console.log(`${i} X ${j} = ${i * j}`);
        }
        console.log('\n');
    }
}; // 변수에 함수를 할당하기 때문에 {}뒤에 ;(세미콜론)를 붙여주는게 좋다

namingFunction(1, 2, 9); // 함수 명으로 호출하지 않고 변수명으로 호출

// 함수 표현식(익명 함수)
const anonymousFunction = function(firstNumber, endNumber, secondNumber = 9) {
    console.log('익명 함수');
    for(let i = firstNumber; i < endNumber+1; i++){
        for (let j = 1; j < secondNumber+1; j++){
            console.log(`${i} X ${j} = ${i * j}`);
        }
        console.log('\n');
    }
};

anonymousFunction(1, 2, 9);

// 화살표 함수
const arrowFunction = (firstNumber, endNumber, secondNumber = 9) => {
    console.log('화살표 함수');
    for(let i = firstNumber; i < endNumber+1; i++){
        for (let j = 1; j < secondNumber+1; j++){
            console.log(`${i} X ${j} = ${i * j}`);
        }
        console.log('\n');
    }
};

arrowFunction(1, 2);

console.log(num); // undefined
var num = 10;

printHello(1, 2); // 함수 선언문으로 작성한 것은 호이스팅이 가능하다
function printHello(num1, num2) {
    console.log("Hello");
    console.log(num1 + num2);
}
// 하지만 함수 표현식, 화살표 함수 방식은 호이스팅이 안됨. 왜냐하면, 변수로 할당했기 때문에...

// 즉시 함수 실행
(function init() {
    console.log('즉시 함수 실행');
}) ();

// init(); // ReferenceError