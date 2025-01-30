const users = [
  { name: "Aaron", age: 10, specialty: "frontend" },
  { name: "Baron", age: 20, specialty: "backend" },
  { name: "Caron", age: 30, specialty: "engineer" },
];

const userList = [];

// 향상된 for문(of)
/*
for (each of users) {
  userList.push({ name: each.name });
}
*/

// 향상된 for(in)
for (index in users) {
  userList[index] = { name: users[index].name }; // 훗
}
console.log(userList);
