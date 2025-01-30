const number = 1;
// number = 2; // const는 재할당이 되지 않음.

const object = {
  name: "Aaron",
  age: 10,
};

console.log(object);
object.name = "Baron"; // const의 값은 참조값이지 해당 객체의 값이 아님
console.log(object); // 그래서 객채 내부의 값을 변경한다고 참조값이 변경되지 않음.

object.name = "Aaron";

const copied_o = JSON.parse(JSON.stringify(object));

copied_o.name = "Baron";
copied_o.age = 0;

console.log(object);
console.log(copied_o);
