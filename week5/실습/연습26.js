function create({ name = "Unnamed", age = 1, favor = undefined }) {
  return { name, age, favor };
}

const created_user_1 = create({ name: "Aaron" });
const created_user_2 = create({ name: "Baron", age: 20 });
const created_user_3 = create({ age: 10, favor: "Game" });

console.log(created_user_1);
console.log(created_user_2);
console.log(created_user_3);
