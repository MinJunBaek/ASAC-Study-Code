// 1. 객체 비구조화
const object = { name: "Aaron", age: 10, favor: "Game" };
const { name: aarons_name, age: aarons_age } = object;
console.log(object.name);
console.log(aarons_name);
console.log(aarons_age);

// 2. 배열 비구조화
const array = ["Aaron", "Baron", "Caron"];
const [_, __, third] = array;
console.log(array[2]);
console.log(third);
console.log(_);
console.log(__);
