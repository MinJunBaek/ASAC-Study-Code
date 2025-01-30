let str = "12345";

// 질문: 문자열 길이 매서드? 괄호가 없어? -> 괄호가 없는 이유 배열의 길이라서?
str.length;

console.log(str[0]);

const str1 = "one";
const str2 = "two";
console.log(str1 + str2);

// 문자열 자르기
console.log(str.slice(0, 3));
console.log(str.substring(0, 3));

// 문자열에서 원하는 문자의 인덱스 찾기
console.log(str.indexOf("1"));
console.log(str.lastIndexOf("1"));
console.log(str.indexOf("0"));

// 문자열에서 원하는 문자 포함여부 확인
console.log(str.includes("34"));
console.log(str.includes("14"));

// 모두 대문자로 만들기(영문)
let firstName = "Kim";

console.log(firstName.toUpperCase());
console.log(firstName.toLowerCase());

// 공백으로 나누어 배열 만들기
const name = "Tom Kim";
const arr = name.split(" ");

console.log(arr.join(", "));
