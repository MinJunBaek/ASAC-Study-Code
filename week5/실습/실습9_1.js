// const filter = (object) => ...
const users = [
  { name: "Aaron", age: 10, specialty: "frontend" },
  { name: "Baron", age: 20, specialty: "backend" },
  { name: "Caron", age: 30, specialty: "engineer" },
];
const filtered = [];
/*
  for (let i = 0; i < users.length; i++) {
  filtered.push(users[i]);
}
*/

// let i = 0;
// while (i < users.length) {
//   filtered.push(users[i]);
//   i++;
// }

// for (let element of users) {
//   filtered.push(element);
// }

for (let key in users) {
  filtered.push(users[key]);
}

console.log(filtered);
