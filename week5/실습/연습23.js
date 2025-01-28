const array = [1, 2, 3];
console.log(array);

const added = [...array, 4, 5];
console.log(added);

const array_1 = [1, 2];
const array_2 = [3, 4];
const combine = [...array_1, ...array_2];
console.log(combine);

const object = { name: "Aaron", age: 10 };
const modified = { ...object, name: "Baron" };
console.log(modified);
