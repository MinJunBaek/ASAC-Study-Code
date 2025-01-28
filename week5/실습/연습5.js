function add(a, b) {
  return a + b;
}

const add1 = function (a, b) {
  return a + b;
};

const add2 = (a, b) => a + b;

const getPerson = (name) => ({ name: name, age: 100 });

const person = getPerson("홍길동");
console.log(person);
