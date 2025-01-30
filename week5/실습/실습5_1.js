const generate = (name) => `안녕하세요 저는 ${JSON.stringify(name)} 입니다.`;

const user = { name: "Aaron", age: 10 };
const generated = generate(user);
console.log(generated);

// function generate(name) {
//   return `안녕하세요 저는 ${JSON.stringify(name)} 입니다`;
// }
