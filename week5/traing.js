// 함수 변수 할당 = 함수 표현식(Expression)
var expression = function() {
    console.log('hello')
}
expression()

// 함수 파라미터
var array = [1, 2, 3, 4]
var parameter = (element) => {
    return element * 10
}
var calcarray = array.map(parameter)
console.log(calcarray)

// 함수 반환
function returnvalue(unit){
    return (parameter) => {
        console.log(parameter * unit)
    }
}

var returned = returnvalue(10)
console.log(returned(1230))
returned(1230)

// 순수 함수
function add(a, b) {
    return a + b;
}

console.log(add(2, 3)); // 항상 5
console.log(add(2, 3)); // 항상 5

// 비순수 함수 예시(참조 투명성 X)
let multiplier = 2;

function multiply(a) {
    return a * multiplier;
}

console.log(multiply(3)); // 6
multiplier = 3;
console.log(multiply(3)); // 9

// 부수 효과 없음
function square(x) {
    return x * x;
}

console.log(square(4)); // 16
console.log(square(4)); // 16

let count = 0;

function increment() {
    count++;
    console.log(count);
}

increment(); // count가 1로 증가
increment(); // count가 2로 증가

// 멀티스레드에서 순수 함수
function calculateSum(arr) {
    return arr.reduce((sum, value) => sum + value, 0);
}

console.log(calculateSum([1, 2, 3, 4]));


// 비순수 함수의 문제
var globalSum = 0;

function addToGlobalSum(arr) {
    arr.forEach((value) => {
        globalSum += value;
    });
}

addToGlobalSum([1, 2, 3, 4]);
console.log(globalSum); // globalSum = 10
addToGlobalSum([1, 2, 3, 4]);
console.log(globalSum); // globalSum = 20

// 참조 투명성 사례
var c = 3
function sideeffect_type0(a, b) {
    console.log(a + b + c)
}

sideeffect_type0(1, 2);

var c = 5;

sideeffect_type0(1, 2);

// 사이드 이펙트
var object = {name: 'Aaron', age: 10}
function sideeffect_type1() {
    object.name = 'Baron'
}

sideeffect_type1();
console.log(object);

function sideeffect_type2(object) {
    object.name = 'Caron'
}

sideeffect_type2(object);
console.log(object);

var object = {name: 'Aaron', age: 10}
function sideeffect_type3(object) {
    var copied = object
    copied.name = 'Daron'
    return copied
}

var manipulated = sideeffect_type3(object);
console.log(manipulated)
console.log(object)
manipulated == object

const member = Object.freeze({ name: 'Aaron', social: '911028-0000000' })
console.log(member) // { name: 'Aaron', social: '911028-0000000' }
member.social = '961028-1111111'
console.log(member) // { name: 'Aaron', social: '911028-0000000' } <- 변하지 않음

var object = {
    name: 'Aaron',
    age: 10,
    address: {
        location: 'Earth',
    }
}
var copied = Object.assign({}, object)
copied.name = 'Baron'
console.log(object)
console.log(copied)
object.address.location = 'Moon'
console.log(object)
console.log(copied)