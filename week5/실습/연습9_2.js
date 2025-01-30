const array = ["first", "second", "third"];
for (const element of array) {
  // const가 되네???
  console.log(element);
}

for (key in array) {
  // 생략이 되네???
  console.log(key);
}

const object = { name: "Aaron", age: 10, favor: "Game" };
for (const key in object) {
  console.log(key);
}
