const convert = (object) => ({ name: object.name });

const user = { name: "Aaron", age: 10 };
const converted = convert(user);
console.log(converted);

// function convert(object) {
//   return { name: object.name };
// }
