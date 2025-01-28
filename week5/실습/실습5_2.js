// const filter = (object) => object.age > 19 && object.specialty === "backend";

const users = [
  { name: "Aaron", age: 10, specialty: "frontend" },
  { name: "Baron", age: 20, specialty: "backend" },
  { name: "Caron", age: 30, specialty: "engineer" },
];

const filtered = [];

for (let i = 0; i < users.length; i++) {
  if (filter(users[i])) {
    filtered.push(users[i]);
  }
}
console.log(filtered);

function filter(object) {
  return object.age > 19 && object.specialty === "backend";
}
