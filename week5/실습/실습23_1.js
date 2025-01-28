const user = {
  id: 1,
  name: "Aaron",
  age: 10,
  address: "Earth",
  job: "Developer",
  specialty: "Backend",
};

function handleChange(user, property, value) {
  const newUser = JSON.parse(JSON.stringify(user));
  newUser[property] = value;
  return newUser;
}

const updated = handleChange(user, "job", "Designer");

console.log(updated);
